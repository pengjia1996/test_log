package com.pengjia.test_log.test_log4j;

import org.apache.log4j.Logger;

/**
 * 测试单独使用log4j
 * @author pengjia
 * @date 2022/11/5 11:35
 */
public class Test {

    private static final Logger  log=Logger.getLogger(Test.class);

    public static void main(String[] args) {
        log.info("11111111111111");
    }

}
