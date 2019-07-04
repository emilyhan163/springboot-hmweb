package com.hm.user.service.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * UserInfoEntity
 *
 * @author 人工智能
 * @date 2019-07-02 15:28:32
 */
public class UserInfoEntity implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 2411046947317550130L;

    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取属性值：手机号
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * 设置属性值：手机号
     **/
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取属性值：用户名
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * 设置属性值：用户名
     **/
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取属性值：状态
     **/
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置属性值：状态
     **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取属性值：是否有效(0:无效 1:有效)
     **/
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置属性值：是否有效(0:无效 1:有效)
     **/
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * 获取属性值：创建时间
     **/
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置属性值：创建时间
     **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取属性值：创建人
     **/
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置属性值：创建人
     **/
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取属性值：创建人类型
     **/
    public Integer getCreateByType() {
        return createByType;
    }

    /**
     * 设置属性值：创建人类型
     **/
    public void setCreateByType(Integer createByType) {
        this.createByType = createByType;
    }

    /**
     * 获取属性值：修改时间
     **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置属性值：修改时间
     **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取属性值：修改人
     **/
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置属性值：修改人
     **/
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取属性值：修改人类型
     **/
    public Integer getUpdateByType() {
        return updateByType;
    }

    /**
     * 设置属性值：修改人类型
     **/
    public void setUpdateByType(Integer updateByType) {
        this.updateByType = updateByType;
    }
}
