package com.example.service;

public interface MailService {

	public void sendSimple(String to,String subject,String content);
	
	public  void sendHtmlMail(String to,String subject,String content);
	
	public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
