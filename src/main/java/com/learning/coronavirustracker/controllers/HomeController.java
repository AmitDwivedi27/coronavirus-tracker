package com.learning.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.coronavirustracker.models.LocationStats;
import com.learning.coronavirustracker.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> locationStats = coronaVirusDataService.getAllLocationStats();
		int totalReportedCases = locationStats.stream()
				.mapToInt(stats -> stats.getTotalCasesCount()).sum();
		int totalNewCases = locationStats.stream()
				.mapToInt(stats -> stats.getDifferenceFromPreviousDay()).sum();
		model.addAttribute("locationStats",locationStats );
		model.addAttribute("totalReportedCases" , totalReportedCases);
		model.addAttribute("totalNewCases" , totalNewCases);
		return "home";
	}

}
