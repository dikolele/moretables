package com.diko.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.diko.po.RootSelect;
import com.diko.po.User;
import com.diko.service.RoleService;
import com.diko.service.UserService;

@Controller
@RequestMapping("/person")
public class DIKOController {
	@Resource
	private UserService userservice ;
	@Resource
	private RoleService roleService ;
	//添加用户
	@ResponseBody
	@RequestMapping(value="/addUser" ,method=RequestMethod.POST)
	public String addUser(@RequestParam String name,@RequestParam String password , String p2){

		if(p2.equals(password)){
			if(name == "" || password == ""){
				return "please input name or password!";
			}else{
				userservice.insertUser(name,password);
				return "insert success!";
			}
		}else{
			return "insert failed!";
		}
	}

	//用户登录
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView login(HttpSession session,
			@RequestParam(value="name",required=true) String name ,
			@RequestParam(value="password") String password){
		ModelAndView mav = new ModelAndView();
		User userlogin = userservice.select(name, password);
		if(userlogin==null){
			mav.setViewName("error");
			return mav;
		}else{
			session.setAttribute("userSession", userlogin);
			int uid = userlogin.getUserId();
			String rnm = roleService.selectRolename(uid);
			if("root".equals(rnm)){
				mav.addObject("list", roleService.rootselect()) ;
				mav.setViewName("root");
				return mav;
			}else{
				if(rnm !=null){
					mav.addObject("role", rnm);
					mav.addObject("user", userlogin);
					mav.setViewName("user");
					return mav;
				}else{
					mav.addObject("user", userlogin);
					mav.setViewName("user");
					return mav;
				}
				
			}

		}

	}




	//查找用户
	@RequestMapping(value="selectUserById/{userId}",method=RequestMethod.GET)
	public ModelAndView selectUserById(@PathVariable int userId){
		ModelAndView mav = new ModelAndView();
		User user = userservice.selectUserById(userId);
		String rnm = roleService.selectRolename(userId) ;
		mav.addObject("user", user);
		mav.addObject("rolename", rnm);
		mav.setViewName("change");
		return mav;
		
	}
	
	//修改用户信息
	@RequestMapping(value="selectUserById/afterChange" , method=RequestMethod.POST)
	public ModelAndView afterChange(@RequestParam (value="userName",required=true) String userName,
									@RequestParam (value="rolename",required=true) String rolename){
		ModelAndView mav = new ModelAndView();
		int uid=userservice.selct_UIdByUNM(userName);
		int rid = roleService.selectRidbyRnm(rolename);
		roleService.updateU_R(uid,rid);
		RootSelect rs = roleService.select_afterupdateU_R(uid) ;
		mav.addObject("rs",rs ) ;
		mav.setViewName("afterchange");
		return mav ;
	}


}


