package com.eidiko.email.controller;

import com.eidiko.email.entity.Mail;
import com.eidiko.email.exception.SendMailException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SendMailController implements ISendMailController {

	@Override
	public String sendMail(Mail mail) {
		try {
			log.info("SendMailController start");
			return null;
		} catch (Exception e) {
			log.info("Error raised SendMailController {}",e.getMessage());
			throw new SendMailException();
		}

	}

}
