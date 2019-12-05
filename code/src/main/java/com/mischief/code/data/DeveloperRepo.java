package com.mischief.code.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mischief.code.beans.Developer;

@Repository
public interface DeveloperRepo extends JpaRepository<Developer, Integer>{

}