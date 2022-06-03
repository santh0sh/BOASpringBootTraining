package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Shuttle;

@RestController
public class ShuttleController {

	private static Map<String, List<Shuttle>> empdb = new HashMap<String, List<Shuttle>>();

	static {
		empdb = new HashMap<String, List<Shuttle>>();

		List<Shuttle> lst = new ArrayList<Shuttle>();
		Shuttle shuttle = new Shuttle("Tempo",  "mumbai");
		lst.add(shuttle);

		shuttle = new Shuttle("Auto",  "mumbai");
		lst.add(shuttle);
		empdb.put("mumbai", lst);
		lst = new ArrayList<Shuttle>();
		shuttle = new Shuttle("Car",  "chennai");
		lst.add(shuttle);
		shuttle = new Shuttle("Bike", "chennai");
		lst.add(shuttle);
		empdb.put("chennai", lst);
	}

	@RequestMapping("/loadshuttle/{city}")
	public List<Shuttle> loadEmployee(@PathVariable String city) {

		List<Shuttle> emplist = empdb.get(city);
		if (emplist == null) {
			emplist = new ArrayList<Shuttle>();
			Shuttle e = new Shuttle("NA", "Not Found");
			emplist.add(e);
		}
		return emplist;
	}

}
