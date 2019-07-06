package com.hm.user.service.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hmj
 * @date 2019/7/2
 */
public class UserInfoServiceDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 2411046947317550130L;


    /**
     * 手机号
     **/
    private String phone;

    /**
     * 用户名
     **/
    private String userName;

    /**
     * 状态
     **/
    private Integer status;

    /**
     * 是否有效(0:无效 1:有效)
     **/
    private Integer valid;

    /**
     * 创建时间
     **/
    private Date createTime;

    /**
     * 创建人
     **/
    private Long createBy;

    /**
     * 创建人类型
     **/
    private Integer createByType;

    /**
     * 修改时间
     **/
    private Date updateTime;

    /**
     * 修改人
     **/
    private Long updateBy;

    /**
     * 修改人类型
     **/
    private Integer updateByType;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Integer getCreateByType() {
        return createByType;
    }

    public void setCreateByType(Integer createByType) {
        this.createByType = createByType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getUpdateByType() {
        return updateByType;
    }

    public void setUpdateByType(Integer updateByType) {
        this.updateByType = updateByType;
    }

    @Override
    public String toString() {
        return "UserInfoServiceDTO{" +
                "phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                ", valid=" + valid +
                ", createTime=" + createTime +
                ", createBy=" + createBy +
                ", createByType=" + createByType +
                ", updateTime=" + updateTime +
                ", updateBy=" + updateBy +
                ", updateByType=" + updateByType +
                '}';
    }
}
