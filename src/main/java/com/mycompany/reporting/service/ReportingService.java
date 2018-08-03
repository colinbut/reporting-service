/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.service;

import com.mycompany.reporting.event.UserEvent;

public interface ReportingService {
    void report(UserEvent UserEvent);
}