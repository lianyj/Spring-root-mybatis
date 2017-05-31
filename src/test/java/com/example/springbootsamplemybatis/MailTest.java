package com.example.springbootsamplemybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

	@Autowired
	private MailService mailService;
	
//	@Test
//	public void testSimpleMail(){
//		mailService.sendSimple("631258447@qq.com", "test simple mail"," hello this is simple mail");
//	}
//	
//	@Test
//	public void testHtml() throws Exception{
//		  String content="<html>\n" +
//		            "<body>\n" +
//		            "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
//		            "</body>\n" +
//		            "</html>";
//		  mailService.sendSimple("631258447@qq.com","test simple mail",content);
//	}
	
	@Test
	public void sendInlineResourceMail() {
	    String rscId = "neo006";
	    String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
	    String imgPath = "C:\\Users\\summer\\Pictures\\favicon.png";

	    mailService.sendInlineResourceMail("ityouknow@126.com", "主题：这是有图片的邮件", content, imgPath, rscId);
	}
}
