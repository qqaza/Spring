package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.emp.EmpVo;
import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	
	@Autowired EmpMapper dao;             //의존성 주입 (DI = Dependency Injection)
	
	@RequestMapping("/ajaxEmp")
	@ResponseBody
	public List<EmpVo> ajaxEmp(){
		return dao.getEmpList();
	}
	
	@RequestMapping("/empList")
	public String empList(Model model){
		model.addAttribute("empList", dao.getEmpList());
	return "empList"; 
	}
		
}