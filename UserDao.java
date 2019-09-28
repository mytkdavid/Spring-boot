package com.example.demomysql.dao;

 
 
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demomysql.bean.User;

@Mapper 
public interface UserDao {
	
	
	 @Select("SELECT * FROM user WHERE name = #{name}")
	    User findUserByName(@Param("name") String name);

	    /**
	     * 查询所有用户信息
	     */
	    @Select("SELECT * FROM user")
	    List<User> findAllUser();

	    /**
	     * 插入用户信息
	     * @return 
	     */
	    @Insert("INSERT INTO user(name, age,money) VALUES(#{name}, #{age}, #{money})")
	    int addUser(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money);

	    /**
	     * 根据 id 更新用户信息
	     */
	    @Update("UPDATE  user SET name = #{name},age = #{age},money= #{money} WHERE id = #{id}")
	    void updateUser(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money,
	                    @Param("id") int id);

	    /**
	     * 根据 id 删除用户信息
	     */
	    @Delete("DELETE from user WHERE id = #{id}")
	    void deleteUser(@Param("id") int id);
	   

}
