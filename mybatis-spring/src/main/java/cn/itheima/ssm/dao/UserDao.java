/**   
* @Title: UserDao.java 
* @Package cn.itheima.ssm.dao 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-5-29 下午12:40:17 
* @version V1.0   
*/
package cn.itheima.ssm.dao;

import cn.itheima.ssm.po.User;

/** 
 * @ClassName: UserDao 
 * @Description: 用户dao接口
 * @author 传智 小杨老师  
 * @date 2018-5-29 下午12:40:17 
 *  
 */
public interface UserDao {
	
	// 1.根据用户Id查询用户
	User queryUserById(Integer id);
	
	// 2.新增一个用户
	void insertUser(User user);

}
