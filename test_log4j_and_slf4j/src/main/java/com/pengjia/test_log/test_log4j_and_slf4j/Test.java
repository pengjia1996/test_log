package com.pengjia.test_log.test_log4j_and_slf4j;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pengjia
 * @date 2022/11/5 11:48
 */
public class Test {

    private static final Logger log=Logger.getLogger(Test.class);

    private static final org.slf4j.Logger log1= LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        log.info("这是log4j对象打印");
        log1.info("这是slf4j对象打印");
    }

}
