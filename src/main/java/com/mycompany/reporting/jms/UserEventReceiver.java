/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.Message;
import javax.jms.MessageListener;

public class UserEventReceiver implements MessageListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserEventReceiver.class);

    @Override
    public void onMessage(Message message) {
        LOGGER.info(message.toString());
    }
}
