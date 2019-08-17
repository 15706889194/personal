package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sso")
@Api(tags = "UmsMemberController",description = "验证码测试")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;
    @ApiOperation("获取验证码")
    @RequestMapping("/generateAuthCode")
    public CommonResult generateAuthCode(@RequestParam String telephone){
        return umsMemberService.generateAuthCode(telephone);
    }
    @RequestMapping("/checkRandom")
    @ApiOperation("校验验证码")
    public CommonResult updatePassword(String telephone, String authCode){
        return umsMemberService.verifyAuthCode( telephone, authCode);
    }
}
