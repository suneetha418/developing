package com.valid.excep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;



@Entity
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue
	private int userid;
	
	//@NotNull(message = "name should not be null")
	private String name;
	//@Email(message = "invalid emailid address")
	private String emailid;
	private String gender;
	//@Pattern(regexp = "(0/91)?[7-9][0-9]{9}",message = "invalid mobile number entered")
	private String mobile;
	private String nationality;
	//@Min(18)
	//@Max(60)
	private int age;
	

}
