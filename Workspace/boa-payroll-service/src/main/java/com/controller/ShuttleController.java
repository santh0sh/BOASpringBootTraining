package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Payroll;

@RestController
public class ShuttleController {

	private static Map<String, List<Payroll>> payrolldb = new HashMap<String, List<Payroll>>();

	static {
		payrolldb = new HashMap<String, List<Payroll>>();

		List<Payroll> lst = new ArrayList<Payroll>();
		Payroll payroll = new Payroll("Sandy","se3",  "25L");
		lst.add(payroll);

		payroll = new Payroll("Kumar","se3",  "22L");
		lst.add(payroll);
		payrolldb.put("se3", lst);
		lst = new ArrayList<Payroll>();
		payroll = new Payroll("AG","se2",  "15L");
		lst.add(payroll);
		payroll = new Payroll("Appie","se2",  "18L");
		lst.add(payroll);
		payrolldb.put("se2", lst);
	}

	@RequestMapping("/getpaydetails/{desg}")
	public List<Payroll> getPayDetails(@PathVariable String desg) {

		List<Payroll> paylist = payrolldb.get(desg);
		if (paylist == null) {
			paylist = new ArrayList<Payroll>();
			Payroll e = new Payroll("NA","NA" ,"Not Found");
			paylist.add(e);
		}
		return paylist;
	}

}
