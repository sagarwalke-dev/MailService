package com.eidiko.email.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mail {

	private String to;
	private String from;
	private String subject;
	private String body;
}
