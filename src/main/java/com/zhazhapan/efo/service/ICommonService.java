package com.zhazhapan.efo.service;

/**
 * @author pantao
 * @date 2018/1/23
 */
public interface ICommonService {

    /**
     * 发送验证码
     *
     * @param email 邮箱
     */
    boolean sendVerifyCode(String email);
}