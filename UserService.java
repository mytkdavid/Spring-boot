package com.example.demomysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demomysql.bean.User;
import com.example.demomysql.dao.UserDao;

@Service
public class UserService {
	 @Autowired
	 
	    private UserDao userDao;
	 
	 /**
	     * 根据名字查找用户
	     */
	    public User selectUserByName(String name) {
	        return userDao.findUserByName(name);
	    }

	    /**
	     * 查找所有用户
	     */
	    public List<User> selectAllUser() {
	        return userDao.findAllUser();
	    }

	    /**
	     * 插入两个用户
	     */
	    @Transactional(rollbackFor = Exception.class)
	    public int addUser(String name, Integer age, double money){	         
	    	 return userDao.addUser(name,age,money);
	    }
	    /**
	     * 根据id 删除用户
	     */

	    public void deleteService(int id) {
	        userDao.deleteUser(id);
	    }

	    /**
	     * 模拟事务。由于加上了 @Transactional注解，如果转账中途出了意外 SnailClimb 和 Daisy 的钱都不会改变。
	     */
	    @Transactional
	    public void changemoney() {
	        userDao.updateUser("SnailClimb", 22, 2000.0, 3);
	        // 模拟转账过程中可能遇到的意外状况
	        int temp = 1 / 0;
	        userDao.updateUser("Daisy", 19, 4000.0, 4);

   }

		}
