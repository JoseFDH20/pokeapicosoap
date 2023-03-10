package com.josedimash.pokeapicosoap.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josedimash.pokeapicosoap.db.entity.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

}
