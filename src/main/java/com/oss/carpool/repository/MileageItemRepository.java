package com.oss.carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.carpool.domain.MileageItem;

@Repository
public interface MileageItemRepository extends JpaRepository<MileageItem, Long>{

}
