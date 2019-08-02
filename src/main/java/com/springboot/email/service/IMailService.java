package com.springboot.email.service;

import com.springboot.email.common.model.Email;
import org.springframework.stereotype.Service;

@Service
public interface IMailService {

    /** 纯文本 */
    void send(Email mail) throws Exception;

    /** 富文本 */
    void sendHtml(Email mail) throws Exception;

    /** 模板发送freemarker */
    void sendFreemarker(Email mail) throws Exception;

    /** 模板发送thymeleaf */
    void sendThymeleaf(Email mail) throws Exception;

    /** 队列 */
    void sendQueue(Email mail) throws Exception;

    /** redis队列 */
    void sendRedisQueue(Email mail) throws Exception;


}
