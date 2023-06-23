package com.pac2;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class PersonValidator {

	public boolean supports(Class clazz) {
		return Person.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		System.out.println("Inside validation");
		ValidationUtils.rejectIfEmpty(e, "name", "nameEmpty");
		Person p = (Person) obj;
		if (p.getAge() < 0) {
			e.rejectValue("age", "negativevalue");
		} else if (p.getAge() > 110) {
			e.rejectValue("age", "too old");
		}
		System.out.println(e);
	}

}
