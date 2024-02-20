package com.imrob.javaspringcrud.repositories;

import com.imrob.javaspringcrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
