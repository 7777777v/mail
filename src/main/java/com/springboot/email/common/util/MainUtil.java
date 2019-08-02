package com.springboot.email.common.util;

/**
 * @ClassName MainUtil
 * @Description main util
 * @Author 2985062714@qq.com
 * @Date 2019/8/2 17:33
 * @Version 1.0
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/** 异步发送 */
public class MainUtil {

    /** 周期执行线程池 容量为6 */
    private ScheduledExecutorService executorService = Executors.newScheduledThreadPool(6);

    /** 执行次数 */
    private final AtomicInteger count = new AtomicInteger(1);
}
