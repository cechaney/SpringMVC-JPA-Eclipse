/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cec.restapijpa.web;

import com.cec.restapijpa.domain.Profile;
import com.cec.restapijpa.services.ProfileService;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
	
    @Autowired
    ProfileService profileService;
    
	@RequestMapping(value="/profile", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Profile> findAllProfile(
			HttpServletRequest req, 
			HttpServletResponse res){

        return profileService.findAll();
		
	}
	
	@RequestMapping(value="/profile/generate", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Profile generateProfile(
			HttpServletRequest req, 
			HttpServletResponse res){
		
		Profile profile = new Profile();

		profile.setEmail(UUID.randomUUID()+"@email.com");
		profile.setPassword(UUID.randomUUID().toString());

        return profileService.create(profile);
		
	}	

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(
			HttpServletRequest req, 
			HttpServletResponse res){

        return "HELLO JPA!";
		
	}    
    
}
