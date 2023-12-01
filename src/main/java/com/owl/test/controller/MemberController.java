package com.owl.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.owl.test.domain.Member;
import com.owl.test.repository.MemberRepository;

@Controller
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/")
	public String hello(ModelMap map) {
		
		List<Member> memberLists = memberRepository.findAll();
		
		map.addAttribute("lists", memberLists);
				
		return "home";
	}
	
	
	
}
