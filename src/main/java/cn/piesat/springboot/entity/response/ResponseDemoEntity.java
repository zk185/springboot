package cn.piesat.springboot.entity.response;

import cn.piesat.springboot.entity.PageEntity;

/**
 * @author zk
 * @date 2018/8/21 14:32
 */
public class ResponseDemoEntity{
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
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
