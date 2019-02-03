/**
 * 
	File : UserInfoRepository.java
	Author : Nishant Varshney
 */
package com.nv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.Entity.UserInformation;

/**
 * @author nishant.varshney
 *
 */
public interface UserInfoRepository extends JpaRepository<UserInformation, Integer>{
	

}
