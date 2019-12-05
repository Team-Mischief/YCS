package com.mischief.code.clients;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mischief.code.beans.Comment;

@FeignClient("rating-service")
public interface RatingClient {
	@RequestMapping(method = RequestMethod.GET, value = "/rating/code/{code_id}/average")
    Double getRatings(@PathVariable("code_id") Integer id);
	
	@RequestMapping(method = RequestMethod.GET, value = "/comment/code/{code_id}")
	List<Comment> getComments(@PathVariable("code_id") Integer id);
}
