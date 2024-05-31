package com.ghaith.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.dojoninjas.models.Ninja;

public interface NinjaRepository  extends CrudRepository<Ninja, Long>{

	List<Ninja> findAll();
}
