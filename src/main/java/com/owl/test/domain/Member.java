package com.owl.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member extends AuditFields {

	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String memberId;
		
}
