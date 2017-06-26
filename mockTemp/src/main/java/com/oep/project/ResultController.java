package com.oep.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class ResultController {
	
	@RequestMapping(value = "/holidays", method = RequestMethod.GET)
	Result getHolidays(){		
		Holidays h = new Holidays();
		Result rs = new Result(h.getAllHolidays(), "200");
		return rs;
	}
}
