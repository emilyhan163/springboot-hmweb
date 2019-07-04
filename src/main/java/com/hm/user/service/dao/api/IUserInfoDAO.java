package com.hm.user.service.dao.api;

import com.hm.user.service.dao.entity.UserInfoEntity;

import java.util.List;

/**
 * IUserInfoDAO
 *
 * @author 人工智能
 * @date 2019-07-02 15:28:32
 */
public interface IUserInfoDAO {

    /**
     * 根据主键查询
     *
     * @param id
     * @return 使用findByIdL
     */
    UserInfoEntity findById(Long id);


    /**
     * @param status
     * @return
     */
    List<UserInfoEntity> findByStatus(Integer status);

    /**
     * 更新用户信息
     *
     * @param userInfoEntity
     * @return
     */
    int update(UserInfoEntity userInfoEntity);

}
