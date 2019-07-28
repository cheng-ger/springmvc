package com.cyl.vo;

import java.io.Serializable;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-25
 */
public class UserVO implements Serializable {
    private static final long serialVersionUID = -2721701700875539643L;

    private Integer id ;

    private String userName ;

    private String password ;

    private String realName ;


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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
