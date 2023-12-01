package com.owl.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.owl.test.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
