package com.onesoft.TwoSoft;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class TwoSoftContoller {
	@GetMapping("prakesh")
	public String getMethodName() {
		return "Good night";
	}
	

}
