package com.mischief.code.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mischief.code.beans.Code;

@Repository
public interface CodeRepo extends CrudRepository<Code, Integer>{

}