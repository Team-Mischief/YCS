package com.mischief.code.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mischief.code.beans.Code;

@Repository
public interface CodeRepo extends JpaRepository<Code, Integer>{

}