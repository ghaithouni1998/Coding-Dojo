package com.ghaith.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.dojoninjas.models.Dojo;

public interface DojoRepository  extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
