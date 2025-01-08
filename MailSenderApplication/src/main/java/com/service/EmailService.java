package com.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void send(String to, String subject, String body) {
		
		SimpleMailMessage msg = new SimpleMailMessage();
		
		msg.setTo(to);
		msg.setText(body);
		msg.setSubject(subject);
		
		javaMailSender.send(msg);
	}
	
	@Autowired
	private TemplateEngine engine;

	public void sendEmail(String to, String subject, String userName) {
	    try {
	        Context context = new Context();
	        context.setVariable("name", userName);

	        String body = engine.process("reset-password", context);

	        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

	        helper.setTo(to);
	        helper.setText(body, true); 
	        helper.setSubject(subject);

	        helper.addAttachment("Image", new File("C:\\Users\\Dell\\Downloads\\EmailAttachment.jpg"));

	        javaMailSender.send(mimeMessage);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
