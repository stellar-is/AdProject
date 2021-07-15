package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepo extends JpaRepository<Prices,Long> {
}
