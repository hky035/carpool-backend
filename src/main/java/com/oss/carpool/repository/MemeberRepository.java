package com.oss.carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.carpool.domain.Member;

@Repository
public interface MemeberRepository extends JpaRepository<Member, Long> {

}
