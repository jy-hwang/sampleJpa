package com.owl.test.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String memberId;
		
	private String createdAt =  LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	
	private String updatedAt;
	
}
