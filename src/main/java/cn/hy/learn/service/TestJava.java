package cn.hy.learn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJava {
    public static Logger logger = LoggerFactory.getLogger(TestJava.class);
    public static void main(String[] args) {
        Fu fu = new Zi();
        fu.show();
    }
}
