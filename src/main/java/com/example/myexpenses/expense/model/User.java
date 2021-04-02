package com.example.myexpenses.expense.model;



import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="user")
public  class User {
	
	@Id
	
	private Long id;
	
	 private String name;
	 
	 private String email;
	 
	
}
