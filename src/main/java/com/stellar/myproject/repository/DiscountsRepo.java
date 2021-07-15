package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountsRepo extends JpaRepository<Discounts, Long> {
}