package com.eidiko.email.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.eidiko.email.entity.Mail;
import com.eidiko.email.entity.SendMailResponse;
import com.eidiko.email.exception.SendMailException;
import com.eidiko.email.service.SendMailService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SendMailController implements ISendMailController {

	@Autowired
	SendMailService service;
	
	@Override
	public SendMailResponse sendMail(Mail mail) {
		try {
			log.info("SendMailController start");
			return service.sendMail(mail);
		} catch (Exception e) {
			log.info("Error raised SendMailController {}",e.getMessage());
			throw new SendMailException();
		}

	}

}
