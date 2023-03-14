package com.pengjia.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjia
 * @date 2023/2/27 17:29
 */
public class Test {
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger x = Logger.getLogger("wombat");
        Logger y = Logger.getLogger("wombat");
        System.err.println(x);
        System.err.println(y);
        System.err.println(x.equals(y));

    }
}
