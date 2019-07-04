package com.hm.user.service.api;


import com.hm.user.service.dto.UserInfoChangeReqDTO;
import com.hm.user.service.dto.UserInfoServiceDTO;

import java.util.List;

/**
 * IUserInfoService
 *
 * @author 人工智能
 * @date 2019-07-02 15:28:32
 */
public interface IUserInfoService {

    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    UserInfoServiceDTO findById(Long id);

    /**
     * @param status
     * @param offest
     * @param limit
     * @return
     */
    List<UserInfoServiceDTO> findByStatus(Integer status, Integer offest, Integer limit);


    /**
     * 更新用户信息
     *
     * @param userInfoChangeReqDTO
     * @return
     */
    int update(UserInfoChangeReqDTO userInfoChangeReqDTO);

}
