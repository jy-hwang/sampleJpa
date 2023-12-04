package com.owl.test.domain;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.owl.test.repository.MemberRepository;

@Transactional
@SpringBootTest
public class MemberTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	void member_test() {
		//given
		Member member1 = new Member(1L,"Owl");
				
		//when
		Member savedMember = memberRepository.save(member1);
		
		//then
		System.out.println("member1 >>> : {}"+member1);
		System.out.println("savedMember >>> : {}"+savedMember);
	}
	
}
