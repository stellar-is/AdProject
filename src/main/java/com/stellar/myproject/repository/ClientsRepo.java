package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepo extends JpaRepository <Clients, Long> {
    Clients findByPhone(String phone);
}
