
package com.zdws.spring.tx;
/**
 * 转账操作业务层接口
 *
 */
public interface AccountService {
 
    /**
     * 转账
     *
     * @param out
     *              转出账户
     * @param in
     *              转入账户
     * @param money
     *              转账金额
     */
    void transfer(String out, String in, int money);
}