/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.jms;

import com.mycompany.reporting.event.UserEvent;
import com.mycompany.reporting.service.ReportingService;
import javax.jms.MessageListener;
import org.apache.activemq.command.ActiveMQBlobMessage;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;

public class UserEventReceiverUTest {

    @Mock
    private ReportingService reportingService;

    private UserEventReceiverUTest classInTest = new UserEventReceiverUTest();

    @Test
    public void testOnMessage(){
        Mockito.doNothing().when(reportingService).report(Matchers.any(UserEvent.class));

        ((MessageListener)classInTest).onMessage(new ActiveMQBlobMessage());

        Mockito.verify(reportingService, Mockito.times(1)).report(Matchers.any(UserEvent.class));
    }

}