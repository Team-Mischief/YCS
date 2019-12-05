package com.mischief.code.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mischief.code.beans.Code;
import com.mischief.code.dto.CodeDTO;
import com.mischief.code.services.CodeService;

@RestController
@RequestMapping(value="/code")
@CrossOrigin
public class CodeController {
	@Autowired
	private CodeService cs;
	
	@RequestMapping(value = "{code_id}", method=RequestMethod.GET)
	public CodeDTO getCode(@PathVariable("code_id") Integer id) {
		return cs.getCode(id);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<CodeDTO> getCodes() {
		return cs.getCodes();
	}
	@RequestMapping(method=RequestMethod.POST)
	public Code addCode(@RequestBody Code c) {
		return cs.addCode(c);
	}
}
