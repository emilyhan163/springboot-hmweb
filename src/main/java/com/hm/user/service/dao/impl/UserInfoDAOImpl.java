package com.hm.user.service.dao.impl;

import com.hm.user.service.dao.api.IUserInfoDAO;
import com.hm.user.service.dao.entity.UserInfoEntity;
import com.hm.user.service.dao.impl.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserInfoImpl
 *
 * @author 人工智能
 * @date 2019-07-02 15:28:32
 */
@Service
public class UserInfoDAOImpl implements IUserInfoDAO {

    @Autowired
    private UserInfoMapper userInfoMapper;

//    @Autowired
//    public void setEntityMapper(UserInfoMapper userInfoMapper) {
//        entityMapper = userInfoMapper
//    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 使用findByIdL
     */
    @Override
    public UserInfoEntity findById(Long id) {
        return userInfoMapper.findById(id);
    }

    /**
     * @param status
     * @return
     */
    @Override
    public List<UserInfoEntity> findByStatus(Integer status) {
        return userInfoMapper.findByStatus(status);
    }

    /**
     * 更新用户信息
     *
     * @param userInfoEntity
     * @return
     */
    @Override
    public int update(UserInfoEntity userInfoEntity) {
        return userInfoMapper.update(userInfoEntity);
    }
}
