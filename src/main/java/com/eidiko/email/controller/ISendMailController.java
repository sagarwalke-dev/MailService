package com.eidiko.email.controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.eidiko.email.entity.Mail;
import com.eidiko.email.entity.SendMailResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public interface ISendMailController {
	@ApiOperation(value = "send mail service")
	@ApiResponses(value = {@ApiResponse(code = 200,message = "mail sent successfully"),
							@ApiResponse(code=500,message = "Internal server error")})
	@PostMapping("/sendmail")
	public SendMailResponse sendMail(@RequestBody Mail mail);
	
}
