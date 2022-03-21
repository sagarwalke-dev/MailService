package com.eidiko.email.service;

import org.springframework.stereotype.Service;

import com.eidiko.email.entity.Mail;
import com.eidiko.email.entity.SendMailResponse;

@Service
public interface SendMailService {
	public SendMailResponse sendMail(Mail mail);
}
