package com.example.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.pojo.domain.TestUser;
import com.example.pojo.ro.TestUserRo;
import com.example.pojo.so.TestUserSo;
import com.example.service.TestUserService;
import com.example.util.tool.WebSecurityConfig;


@Controller
public class MainController {
	
	private static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private TestUserService testUserService;

	//登录后的页面
	@RequestMapping("/")
	public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {
		model.addAttribute("name", account);
		return "index";
	}

	//登录页面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//登录页面
	@RequestMapping("/register")
	public String register() {
		return "login";
	}

	//登录ajax后台方法
	@RequestMapping("/loginPost")
	public @ResponseBody Map<String, Object> loginPost(String account, String password, HttpSession session) {
		Map<String, Object> map = new HashMap<>();
		
		TestUserSo userSo = new TestUserSo();
		userSo.setAccount(account);
		List<TestUserRo> userRos = testUserService.selectUserList(userSo);
		if(userRos.size()>0){
			if(!userRos.get(0).getPassword().equals(password)){
				map.put("success", false);
				map.put("message", "密码错误");
				return map;
			}else{
				// 设置session
				session.setAttribute(WebSecurityConfig.SESSION_KEY, account);

				map.put("success", true);
				map.put("message", "登录成功");
				return map;
			}
		}else {
			map.put("success", false);
			map.put("message", "还没有注册");
			return map;
		}
		
	}

	//注销
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// 移除session
		session.removeAttribute(WebSecurityConfig.SESSION_KEY);
		return "redirect:/login";
	}
		
	
	//注册ajax后台方法
	@RequestMapping("/registerPost")
	public @ResponseBody Map<String, Object> registerPost(String account, String password, HttpSession session) {
		Map<String, Object> map = new HashMap<>();
		logger.info("注册开始");
		TestUserSo userSo = new TestUserSo();
		userSo.setAccount(account);
		List<TestUserRo> userRos = testUserService.selectUserList(userSo);
		if(userRos.size()>0){
			map.put("success", false);
			map.put("message", "账户已经存在");
			return map;
		}else {
			// 设置session
			session.setAttribute(WebSecurityConfig.SESSION_KEY, account);
			
			TestUser user = new TestUser();
			user.setAccount(account);
			user.setPassword(password);
			testUserService.insertUser(user);
			map.put("success", true);
			map.put("message", "注册成功");
			return map;
		}
	}

}
