package com.example.form1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.form1.model.Employee;
import com.example.form1.model.EmployeeInfo;
import com.example.form1.repository.EmployeeInfoRepository;
import com.example.form1.repository.EmployeeRepository;



@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeInfoRepository employeeInfoRepository;
	
	@GetMapping("/employeeForm")
	public String showEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeform";
	}
	
	@PostMapping("/submitEmployee")
	public String submitEmployeeForm(@ModelAttribute("employee") Employee employee, Model model) {
		Employee savedEmployee = employeeRepository.save(employee);
		model.addAttribute("employeeInfo", new EmployeeInfo());
		model.addAttribute("id", savedEmployee.getEmployeeId());
		return "employeeInfo";
	}
	
	@PostMapping("/submitEmployeeInfo")
	public String submitEmployeeInfo(@ModelAttribute("employeeinfo") EmployeeInfo employeeInfo) {
		employeeInfoRepository.save(employeeInfo);
		return "redirect:/process";
	}
	
@GetMapping("/process")
public String process() {
	return "process";
}


@PostMapping("/process")
    	    public String processForm(@RequestParam("address") String address,
                    @RequestParam("bloodGroup") String bloodGroup,
                    @RequestParam("siblingsCount") int siblingsCount,
                    @RequestParam("siblingsType") String siblingsType) {
                   return "process"; // Redirect
    	    					
}
        // Process the form data here
        
        // Redirect to a success page or return a response as needed
	
	@GetMapping("/employeeDetails")
	public String employeeDetails() {
		return "employeeDetails";
	}
}
