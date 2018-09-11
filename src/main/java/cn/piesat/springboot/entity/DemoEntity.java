package cn.piesat.springboot.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class DemoEntity implements Serializable {

    private static final long serialVersionUID = 1100502434821765640L;

    private Integer id;

    private String userName;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}