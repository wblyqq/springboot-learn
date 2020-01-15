package com.springboot.demo3.mapper;

import com.springboot.demo3.mapperprovider.UserProvider;
import com.springboot.demo3.mybean.User;
import org.apache.ibatis.annotations.*;
import org.hibernate.validator.constraints.pl.REGON;

import java.util.List;
//@Mapper 和启动类中注解MapperScan只要有一个就行
public interface UserMapper {
    //1.@Select("select * from t_user where 1=1")
    @Results({
            @Result(property = "userId",column = "USER_ID"),
            @Result(property = "userName",column = "USER_NAME"),
            @Result(property = "password",column = "PASSWORD")
    })
    @Select("select * from user where 1=1")
    List<User> list();
    @Select("select * from user where username like #{username}")
    List<User> findByUserName(String username);
    @Select("select * from user where user_id like #{userId}")
    User getOne(String userId);
    @Delete("delete from user where user_id like #{userId}")
    int delete(String userId);

    /**
     * 延伸：无论什么方式,如果涉及多个参数,则必须加上@Param注解,否则无法使用EL表达式获取参数。
     */
    //2.  1和2都可以附加@result注解来指定结果集的映射关系
    //ps 如果符合下划线转驼峰的匹配可以直接省略不写
    //高级注解
    @SelectProvider(type= UserProvider.class,method = "list2222")
    List<User> list2();
}
