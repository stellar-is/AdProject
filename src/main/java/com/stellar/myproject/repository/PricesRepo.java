package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepo extends JpaRepository<Prices,Long> {
    @Query(value = "select * from prices p where p.channels_id = ?1 and current_timestamp between start_date and end_date",nativeQuery = true)
    Prices findByChannelsAndDate(Long channelId);
}
