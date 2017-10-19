<<<<<<< HEAD
package com.winksi.roinchina.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 
* @ClassName: RoinChinaController
* @Description: TODO积分Controller  
* @author 王文龙  
* @date 2017年7月18日  
*
 */
@Controller
public class RoinChinaController {

	private static final Logger log = LoggerFactory.getLogger(RoinChinaController.class);

	
	
	public RoinChinaController(){
		log.info("RoinChinaController init");
	}

	/**
	 * 查询归属地v1.0接口
	 * 
	 * @param input
	 * @return
	 */
	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject getToken(@RequestBody JSONObject input) {
		JSONObject json = new JSONObject();
		json.put("akey", "avalue");
		return json;
	}
}
=======
package com.winksi.roinchina.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 
* @ClassName: RoinChinaController
* @Description: TODO积分Controller  
* @author 王文龙  
* @date 2017年7月18日  
*
 */
@Controller
public class RoinChinaController {

	private static final Logger log = LoggerFactory.getLogger(RoinChinaController.class);

	
	
	public RoinChinaController(){
		log.info("RoinChinaController init");
	}

	/**
	 * 查询归属地v1.0接口
	 * 
	 * @param input
	 * @return
	 */
	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject getToken(@RequestBody JSONObject input) {
		JSONObject json = new JSONObject();
		json.put("akey", "avalue");
		return json;
	}
}
>>>>>>> cd25a129ac6e9d3b2982c803a677aa7618e4c08a
