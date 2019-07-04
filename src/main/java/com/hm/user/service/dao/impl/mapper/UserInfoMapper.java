package com.hm.user.service.dao.impl.mapper;

import com.hm.user.service.dao.entity.UserInfoEntity;

import java.util.List;

/**
 * UserInfoMapper
 *
 * @author 人工智能
 * @date 2019-07-02 15:28:32
 */
public interface UserInfoMapper {
    /**
     * 根据主键查询
     *
     * @param id
     * @return 使用findByIdL
     */
    UserInfoEntity findById(Long id);

    /**
     * 根据状态查询用户
     *
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
