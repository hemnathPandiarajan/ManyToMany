package com.example.manyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manyToMany.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>{

}
