/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.service.impl;

import com.mycompany.reporting.event.UserEvent;
import com.mycompany.reporting.format.ReportObject;
import com.mycompany.reporting.service.ReportingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportingServiceImpl implements ReportingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportingServiceImpl.class);

	@Override
	public void report(UserEvent userEvent) {

        ReportObject reportObject = new ReportObject();

        // TODO Write to CSV
        // TODO Write to TXT
	}

}