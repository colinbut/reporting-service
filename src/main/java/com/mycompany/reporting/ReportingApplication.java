/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class ReportingApplication {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/application-context.xml");

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                ((ClassPathXmlApplicationContext)applicationContext).close();
            }
        });
    }
}
