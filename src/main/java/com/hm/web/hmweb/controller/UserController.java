package com.hm.web.hmweb.controller;

import com.hm.user.service.api.IUserInfoService;
import com.hm.user.service.dto.UserInfoChangeReqDTO;
import com.hm.user.service.dto.UserInfoServiceDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author hmj
 * @date 2019/7/2
 */
@Api(value = "user模块")
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private IUserInfoService userInfoService;

    //http://192.168.41.75:8086/hmweb/user/find/1
    @GetMapping(value = "/find/{id}")
    public String findUserById(@PathVariable Long id) {
        UserInfoServiceDTO userInfoServiceDTO = userInfoService.findById(id);
        return userInfoServiceDTO.getUserName();
    }

    //http://192.168.41.75:8086/hmweb/user/findByStatus/1?offest=0&limit=2
    @GetMapping(value = "/findByStatus/{status}")
    public Integer findByStatus(@PathVariable Integer status,
                                @PathParam(value = "offest") Integer offest, @PathParam(value = "limit") Integer limit) {
        List<UserInfoServiceDTO> userInfoDTOs = userInfoService.findByStatus(status, offest, limit);
        return userInfoDTOs.size();
    }


    @PostMapping("/update")
    @ApiOperation("根据id更新用户的接口")
    public Integer updateUserById(@RequestBody UserInfoChangeReqDTO user) {
        if (user == null || user.getId() == null) {
            return null;
        }
        Integer result = userInfoService.update(user);
        return result;
    }

}
