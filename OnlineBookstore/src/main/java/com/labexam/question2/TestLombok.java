package com.labexam.question2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestLombok {
	private String name = "Nobel";
	
	public static void main(String[]args) {
		TestLombok lombok = new TestLombok();
		System.out.println(lombok.getName());
		
	}
}
