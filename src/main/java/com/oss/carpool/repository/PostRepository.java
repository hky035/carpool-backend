package com.oss.carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.carpool.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
