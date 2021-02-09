package com.example.baky.hackernews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baky.hackernews.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long>{

}
