<<<<<<< HEAD
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
     
=======
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
     
>>>>>>> cd25a129ac6e9d3b2982c803a677aa7618e4c08a
}