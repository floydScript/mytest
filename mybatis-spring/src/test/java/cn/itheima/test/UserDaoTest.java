/**   
* @Title: UserDaoTeset.java 
* @Package cn.itheima.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-5-29 下午12:51:47 
* @version V1.0   
*/
package cn.itheima.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itheima.ssm.dao.UserDao;
import cn.itheima.ssm.po.User;

/** 
 * @ClassName: UserDaoTeset 
 * @Description: dao开发方法测试
 * @author 传智 小杨老师  
 * @date 2018-5-29 下午12:51:47 
 *  
 */
public class UserDaoTest {
	
	/**
	 * 测试根据用户Id查询用户
	 */
	@Test
	public void queryUserByIdTest(){
		
		// 1.加载spring配置文件，得到spring容器
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		
		// 2.获取用户dao对象
		UserDao userDao = (UserDao) context.getBean("userDao");
		
		User user = userDao.queryUserById(2);
		System.out.println(user);
		
	}
	
	/**
	 * 测试新增用户
	 */
	@Test
	public void insertUserTest(){
		// 1.加载spring配置文件，得到spring容器
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		
		// 2.获取用户dao对象
		UserDao userDao = (UserDao) context.getBean("userDao");
		
		// 创建用户对象
		User user = new User();
		user.setUsername("李云龙");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("独立团");
		
		userDao.insertUser(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
