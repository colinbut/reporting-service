/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import com.mycompany.reporting.event.UserEvent;
import com.mycompany.reporting.service.ReportingService;

public class UserEventReceiver implements MessageListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserEventReceiver.class);

    @Autowired
    private ReportingService reportingService;

    @Override
    public void onMessage(Message message) {
        LOGGER.debug(message.toString());
        ObjectMessage objectMessage = (ObjectMessage) message;
        try {
            UserEvent userEvent = (UserEvent) objectMessage.getObject();

            reportingService.report(userEvent);
        } catch (JMSException e) {
            LOGGER.error("{}", e);
        }
    }
}
