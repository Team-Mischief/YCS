package com.mischief.code.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mischief.code.beans.Developer;

@Repository
public interface DeveloperRepo extends CrudRepository<Developer, Integer>{

}