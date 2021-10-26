package com.joserodriguez.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class AppController {
	@RequestMapping( "/" )
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping( "/date" ) 
	public String date(Model model) {
		Date date = new Date();
		//model.addAttribute("date", date); date can be send in this way but it does not have the format required
		//next lines were added to give format to the date and send it to the JSP files with Model object
		SimpleDateFormat withDateFormat = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		model.addAttribute("date", withDateFormat.format(date));

		return "date.jsp";
		
	}
	
	@RequestMapping( "/time" )
	public String time(Model model) {
		Date time = new Date();	
		// Same here that above end point, but in this case a time format was provided
		SimpleDateFormat withTimeFormat = new SimpleDateFormat("HH:mm a");
		model.addAttribute("time", withTimeFormat.format(time));
		return "time.jsp";
	}

}
