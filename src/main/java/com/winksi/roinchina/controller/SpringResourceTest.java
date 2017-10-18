package com.winksi.roinchina.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.asm.ClassReader;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.NestedIOException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

public class SpringResourceTest {

	public static void main(String[] args) {
//		String path = "D:\\workspace_spring\\spring-web-study\\target\\classes\\com\\winksi\\roinchina\\controller\\RoinChinaController.class";
//		File file = new File(path);
//		//InputStream is = new BufferedInputStream(resource.getInputStream());
//		InputStream is = new BufferedInputStream(new FileInputStream(file));
//		ClassReader classReader;
//		try {
//			classReader = new ClassReader(is);
//		}
//		catch (IllegalArgumentException ex) {
//			throw new NestedIOException("ASM ClassReader failed to parse class file - " +
//					"probably due to a new Java class file version that isn't supported yet: ");
//		}
//		finally {
//			is.close();
//		}
//
//		AnnotationMetadataReadingVisitor visitor = new AnnotationMetadataReadingVisitor(SpringResourceTest.class.getClassLoader());
//		classReader.accept(visitor, ClassReader.SKIP_DEBUG);
//
//		this.annotationMetadata = visitor;
//		// (since AnnotationMetadataReadingVisitor extends ClassMetadataReadingVisitor)
//		this.classMetadata = visitor;
//		this.resource = resource;
		
		
		
		new SpringResourceTest().findCandidateComponents("");
	}

	public Set<BeanDefinition> findCandidateComponents(String basePackage) {
		Set<BeanDefinition> candidates = new LinkedHashSet<BeanDefinition>();
		try {
			ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
			MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resourcePatternResolver);
			
			//base-package中的值替换为classpath*:cn/test/**/*.class
			String packageSearchPath = "classpath*:**/**/controller/**/*.class";
			//logger.info("ClassPathScanningCandidateComponentProvider findCandidateComponents packageSearchPath = " + packageSearchPath);
			//获取所以base-package下的资源
			Resource[] resources = resourcePatternResolver.getResources(packageSearchPath);
			for (Resource resource : resources) {
				if (resource.isReadable()) {
					try {
						MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(resource);
						/**
						 * AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
		return metadata.hasAnnotation(this.annotationType.getName()) || (this.considerMetaAnnotations && metadata.hasMetaAnnotation(this.annotationType.getName()));
						 */
						System.out.println("resource.getFilename() = " + resource.getFilename());
						System.out.println("getAnnotationMetadata = " + metadataReader.getAnnotationMetadata().hasMetaAnnotation("org.springframework.stereotype.Component"));
						System.out.println("getClassMetadata = " + metadataReader.getClassMetadata());
					}
					catch (Throwable ex) {
						throw new BeanDefinitionStoreException(
								"Failed to read candidate component class: " + resource, ex);
					}
				}
				else {
				}
			}
		}
		catch (IOException ex) {
			throw new BeanDefinitionStoreException("I/O failure during classpath scanning", ex);
		}
		return candidates;
	}
}
