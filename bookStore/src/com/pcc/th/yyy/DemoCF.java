package com.pcc.th.yyy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoCF {
	public static void main(String[] args) {
		Map<String, Integer> employee = new HashMap<>();
		employee.put("karn", 23);
		employee.put("karnfff", 34);
		employee.put("karnee", 54);
		System.out.println(employee.get("karn"));
		if(!employee.containsKey("xxx")) {
			System.out.println("not found");
		}
		Set<String> keys = employee.keySet();
		for(String key : keys) {
			System.out.printf("%s --> %d\n",key, employee.get(key));
		}
	}
}
