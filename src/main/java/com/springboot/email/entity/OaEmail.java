package com.springboot.email.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName OaEmail
 * @Description email entity
 * @Author 2985062714@qq.com
 * @Date 2019/8/2 16:02
 * @Version 1.0
 */
/*@Entity
@Table(name = "oa_email")*/
public class OaEmail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 接收人邮箱(逗号分隔) */
    private String receiveEmail;

    /** 主题 */
    private String subject;

    /** 发送内容 */
    private String content;

    /** 模板 */
    private String template;

    /** 发送时间 */
    private Timestamp sendTime;

    public OaEmail() {
        super();
    }

    public OaEmail(Long id, String receiveEmail, String subject, String content, String template, Timestamp sendTime) {
        this.id = id;
        this.receiveEmail = receiveEmail;
        this.subject = subject;
        this.content = content;
        this.template = template;
        this.sendTime = sendTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail;
    }
    @Column(name = "receive_email", nullable = false, length = 500)
    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Column(name = "subject", nullable = false, length = 100)
    public String getSubject() {
        return subject;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Column(name = "content", nullable = false, length = 65535)
    public String getContent() {
        return content;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    @Column(name = "template", nullable = false, length = 100)
    public String getTemplate() {
        return template;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }
    @Column(name = "send_time", nullable = false, length = 19)
    public Timestamp getSendTime() {
        return sendTime;
    }
}
