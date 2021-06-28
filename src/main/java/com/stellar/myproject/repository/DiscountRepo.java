package com.stellar.myproject.repository;

import com.stellar.myproject.entity.DiscountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepo extends JpaRepository<DiscountEntity, Long> {
}