package com.mischief.code.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mischief.code.beans.Code;
import com.mischief.code.clients.RatingClient;
import com.mischief.code.data.CodeRepo;
import com.mischief.code.dto.CodeDTO;

@Service
public class CodeService {
	@Autowired
	private CodeRepo cr;
	//@Autowired
	private RatingClient rc;
	
	public CodeDTO getCode(Integer id) {
		Code c = cr.findOne(id);
		CodeDTO data = new CodeDTO(c);
		//data.setAvgRating(rc.getRatings(id));
		//data.setCommentList(rc.getComments(id));
		return data;
	}
	
	public List<CodeDTO> getCodes() {
		List<Code> codes = cr.findAll();
		List<CodeDTO> list = new ArrayList<>();
		for(Code c : codes) {
			CodeDTO data = new CodeDTO(c);
			//data.setAvgRating(rc.getRatings(c.getId()));
			//data.setCommentList(rc.getComments(c.getId()));
			list.add(data);
		}
		return list;
	}
	
	public Code addCode(Code c) {
		return cr.save(c);
	}
}
