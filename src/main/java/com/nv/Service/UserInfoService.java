package com.nv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.Entity.UserInformation;
import com.nv.Repository.UserInfoRepository;
import com.nv.Utility.Utility;

/**
 * @author nishant.varshney
 *
 */
@Service
public class UserInfoService {

	@Autowired
	UserInfoRepository userRepo;
	
	public String addUser(UserInformation userInfo){
		 userRepo.save(userInfo);
		 return Utility.getSuccessResponce("User Successfully Added");
	}
}
