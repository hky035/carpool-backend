package com.oss.carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.carpool.domain.Carpool;

@Repository
public interface CarpoolRepository extends JpaRepository<Carpool, Long>{
	public Carpool findByProviderId(Long providerId);
}
