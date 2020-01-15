package com.springboot.demo3.mapperprovider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class UserProvider {
    public String list2222(){
        return "select * from user";
    }

    public String getBadUser(@Param("userName") String username,@Param("password") String password){
        return new SQL(){{
            SELECT("*");
            FROM("user");
            if(username!=null && password!=null){
                WHERE("username like #{username} and password like #{password}");
            }else{
                WHERE("1=2");
            }
        }}.toString();
    }
}
