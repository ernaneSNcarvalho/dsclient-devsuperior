package com.client.client.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	

}
