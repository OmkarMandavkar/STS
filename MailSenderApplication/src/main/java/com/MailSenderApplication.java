package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.EmailService;

@SpringBootApplication
public class MailSenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MailSenderApplication.class, args);

		EmailService bean = run.getBean(EmailService.class);

		String to = "omkarmandavkar000@gmail.com";
		String subject = "Email Service Testing";
		String body = "This is an email confirmation for Successful Application Working";

//		bean.send(to, subject, "Omkar"); // if body is not assigned
		bean.send(to, subject, body);

//		bean.sendEmail(to, subject, body);

		System.out.println("To: " + to);
		System.out.println("Subject: " + subject);
		System.out.println("Body: " + body);
		System.out.println("Email Sent Successfully"); 
	}
}