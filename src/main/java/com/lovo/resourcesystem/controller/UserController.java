package com.lovo.resourcesystem.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.resourcesystem.entity.CashStatementEntity;
import com.lovo.resourcesystem.entity.UserEntity;
import com.lovo.resourcesystem.service.UserService;

@Controller
@RequestMapping("User")
public class UserController {
	private String a = "添加失败";

	@Autowired
	private  UserService userService;
	
	
	
	/**
	 *  展示所有用户
	 */
	@RequestMapping("/User.lovo")
	 @ResponseBody
	 public PageInfo<UserEntity> UserFind(Integer currPage){
		
		 PageHelper.startPage(currPage , 5,true);
			List<UserEntity> eventList=userService.userFind();
			//分页插件的bean 传入动态查询的集合
			PageInfo<UserEntity> page= new PageInfo<UserEntity>(eventList);
			return page;
		
	}
	
	
	@RequestMapping("/Userdelect.lovo")
	 @ResponseBody
	public ModelAndView Userdelect(Integer id) {
		 ModelAndView mv=new ModelAndView("usermanagement/userManagement");
		
		 userService.userDelete(id);
		return mv;
		
	}
	
	
	@RequestMapping("/UserAdd.lovo")
	 @ResponseBody
	public ModelAndView UserAdd(String userName,String password,String sex,String birthday,String telephone) {
		 ModelAndView mv=new ModelAndView("usermanagement/userAdd");
		
		 
		 Date a =  Date.valueOf(birthday);
		 
		 
		UserEntity user =  new UserEntity();
		user.setUserName(userName);
		user.setPassword(password);
		user.setSex(sex);
		user.setBirthday(a);
		user.setTelephone(telephone);
		userService.userAdd(user);
		
		
		return mv;
		
	}
	
	
	
	@RequestMapping("/UserRevise.lovo")
	 @ResponseBody
	public ModelAndView UserRevise( String id) {
		 ModelAndView mv=new ModelAndView("usermanagement/userRevise");
		Integer ida = Integer.parseInt(id);
			 
			
		List<UserEntity> list = userService.userFindId(ida);
		 
		mv.addObject("list",list);
		
		return mv;
		
	}
	
	@RequestMapping("/UserRevisea.lovo")
	 @ResponseBody
	public ModelAndView UserRevisea(String id,String passworda,String passwordb) {
		 ModelAndView mv=new ModelAndView("usermanagement/userManagement");
		
		 
		 
		 Integer ida = Integer.parseInt(id);
		 
		 userService.userRevise(ida, passworda);
		
		return mv;
		
	}
	
	
	
	@RequestMapping("/Userlogin.lovo")
	public ModelAndView UserLogin() {
		 ModelAndView mv=new ModelAndView("usermanagement/userManagement");
		return mv;
		
	}
	
	
	
	
	
	
	
}
