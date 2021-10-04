package com.example.manyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manyToMany.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
