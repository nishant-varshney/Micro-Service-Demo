/**
 * 
	File : AccountController.java
	Author : Nishant Varshney
 */
package com.nv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nv.Entity.UserInformation;
import com.nv.Repository.UserInfoRepository;
import com.nv.Service.UserInfoService;
import com.nv.Utility.Utility;

/**
 * @author nishant.varshney
 *
 */
@RestController
public class AccountController {
	
	@Autowired
	UserInfoService userServie;
	
	@PostMapping(value="/new",consumes= MediaType.APPLICATION_JSON_VALUE)
	public String addUser(@RequestBody UserInformation userInfo){
		System.out.println("calledd");
			return userServie.addUser(userInfo);
	}
	
	@GetMapping(value="/")
	public String Home(){
		System.out.println("Account Service is saying Hello!!!");
		return "Account Service is saying Hello!!!";
}

}
