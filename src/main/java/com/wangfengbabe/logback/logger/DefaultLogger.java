package com.wangfengbabe.logback.logger;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangfeng on 30/08/2017.
 */
public class DefaultLogger {

  private static Logger logger = LoggerFactory.getLogger(DefaultLogger.class);

  public static void main(String[] args) {
    logger.debug("hello world");
    //logger level :trace,warn,debug,info,error,OFF
    ch.qos.logback.classic.Logger myLogger = (ch.qos.logback.classic.Logger) logger;
    myLogger.setLevel(Level.INFO);
    logger.debug("hello world again");
    logger.error("error occurs");

    //Singleton instance
    Logger logger2 = LoggerFactory.getLogger(DefaultLogger.class);
    System.out.println(logger == logger2);//true


  }

}
