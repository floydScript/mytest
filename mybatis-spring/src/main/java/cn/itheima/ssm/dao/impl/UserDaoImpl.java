/**   
* @Title: UserDaoImpl.java 
* @Package cn.itheima.ssm.dao.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-5-29 下午12:43:04 
* @version V1.0   
*/
package cn.itheima.ssm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itheima.ssm.dao.UserDao;
import cn.itheima.ssm.po.User;

/** 
 * @ClassName: UserDaoImpl 
 * @Description:用户dao实现类 
 * @author 传智 小杨老师  
 * @date 2018-5-29 下午12:43:04 
 *  
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	/**
	 * 根据用户Id查询用户
	 */
	public User queryUserById(Integer id) {
		// 1.获取sqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		Object user = sqlSession.selectOne("test.queryUserById", id);
		
		// 2.释放资源
		/**
		 * 与spring整合以后，sqlSession对象交给spring管理，不需要在手动释放（不能）
		 */
		
		return (User) user;
	}

	/**
	 * 新增用户
	 */
	public void insertUser(User user) {
		// 1.获取SqlSession
		SqlSession sqlSession = this.getSqlSession();
		
		sqlSession.insert("test.insertUser", user);
		
		// 2.释放资源与事务
		/**
		 * 1.与spring整合以后，sqlSession对象交给spring管理，不需要在手动释放（不能）
		 * 2.与spring整合以后，sqlSession对象交给spring管理，不需要再关心事务
		 * （如果配置了spring的事务，就使用spring的事务；如果没有配置，就使用jdbc的事务）
		 */

	}

}
