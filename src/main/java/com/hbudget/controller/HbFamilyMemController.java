package com.hbudget.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hbuget.vo.HbFamilyMember;

@Controller
@RequestMapping("hbudget")
public class HbFamilyMemController {
	
	@
	
	@RequestMapping(value = "register",method = RequestMethod.POST )
	public String register(@RequestBody() HbFamilyMember famMem) {		
		return "success";
	}
	
	@RequestMapping(value = "registers",method = RequestMethod.GET )
	public List<String> registers(@RequestBody() HbFamilyMember famMem) {		
		return "success";
	}

}
