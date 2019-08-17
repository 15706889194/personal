package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;
import org.springframework.stereotype.Service;

@Service
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 校验验证码
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
