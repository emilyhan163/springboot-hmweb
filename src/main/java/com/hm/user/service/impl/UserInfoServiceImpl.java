package com.hm.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.hm.user.service.api.IUserInfoService;
import com.hm.user.service.dao.api.IUserInfoDAO;
import com.hm.user.service.dao.entity.UserInfoEntity;
import com.hm.user.service.dto.UserInfoChangeReqDTO;
import com.hm.user.service.dto.UserInfoServiceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UserInfoServiceImpl
 *
 * @author 人工智能
 * @date 2019-07-02 15:28:32
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private IUserInfoDAO userInfoDAO;

    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    @Override
    public UserInfoServiceDTO findById(Long id) {
        UserInfoServiceDTO userInfoServiceDTO = null;
        UserInfoEntity userInfoEntity = userInfoDAO.findById(id);
        if (userInfoEntity != null) {
            userInfoServiceDTO = new UserInfoServiceDTO();
            BeanUtils.copyProperties(userInfoEntity, userInfoServiceDTO);
        }
        return userInfoServiceDTO;
    }

    /**
     * @param status
     * @return
     */
    @Override
    public List<UserInfoServiceDTO> findByStatus(Integer status, Integer offest, Integer limit) {
        com.github.pagehelper.Page githubPage = PageHelper.startPage(offest, limit, true);
        List<UserInfoEntity> userInfoEntities = userInfoDAO.findByStatus(status);
        if (CollectionUtils.isEmpty(userInfoEntities)) {
            return new ArrayList<>();
        }
        LOGGER.info("total={}", githubPage.getTotal());
        List<UserInfoServiceDTO> userInfoServiceDTOS = userInfoEntities.stream().map(v -> {
            UserInfoServiceDTO userInfoServiceDTO = new UserInfoServiceDTO();
            BeanUtils.copyProperties(v, userInfoServiceDTO);
            return userInfoServiceDTO;
        }).collect(Collectors.toList());
        return userInfoServiceDTOS;
    }

    /**
     * 更新用户信息
     *
     * @param userInfoChangeReqDTO
     * @return
     */
    @Override
    @Transactional
    public int update(UserInfoChangeReqDTO userInfoChangeReqDTO) {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(userInfoChangeReqDTO.getId());
        userInfoEntity.setUserName(userInfoChangeReqDTO.getUserName());
        return userInfoDAO.update(userInfoEntity);
    }
}
