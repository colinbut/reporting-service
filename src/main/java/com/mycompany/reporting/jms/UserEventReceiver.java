/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.jms;

import javax.jms.Message;
import javax.jms.MessageListener;

public class UserEventReceiver implements MessageListener{

    @Override
    public void onMessage(Message message) {
        System.out.println(message);
    }
}
