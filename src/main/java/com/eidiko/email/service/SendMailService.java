package com.eidiko.email.service;

import org.springframework.stereotype.Service;

import com.eidiko.email.entity.Mail;

@Service
public interface SendMailService {
	public String sendMail(Mail mail);
}
