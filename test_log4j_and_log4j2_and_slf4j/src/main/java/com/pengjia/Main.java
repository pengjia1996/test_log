package com.pengjia;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log=Logger.getLogger(Main.class);

    private static final org.apache.logging.log4j.Logger log2 = LogManager.getLogger(Main.class);//log4j2的写法 import org.apache.logging.log4j.xxx
    private static final org.slf4j.Logger log1= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("这是log4j对象打印");
        log1.info("这是slf4j对象打印");
        log2.info("这是log4j2对象打印");
    }
}