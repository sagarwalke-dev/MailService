package com.eidiko.email.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.eidiko.email.entity.Mail;
import com.eidiko.email.entity.SendMailResponse;
import com.eidiko.email.util.MailUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SendMailServiceImpl implements SendMailService {

	@Autowired
	MailUtil util;

	@Override
	public SendMailResponse sendMail(Mail mail) {
		log.info("SendMailService start");
		Boolean status = false;
		try {
			status = util.sendMail(mail);
			if (Boolean.TRUE.equals(status)) {
				return new SendMailResponse(status, "mail send successfully");
			} else {
				return new SendMailResponse(status, "mail send failed");
			}
		} catch (Exception e) {
			log.info("Error raised SendMailService {}", e.getMessage());
			return new SendMailResponse(status, e.getMessage());
//			throw new SendMailException();
		}

	}

}
