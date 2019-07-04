package com.hm.user.service.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 韩美娟
 * @date 2019/7/4
 */
@ApiModel
public class UserInfoChangeReqDTO implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfoChangeReqDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
