package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepo extends JpaRepository <Channels, Long>{
}
