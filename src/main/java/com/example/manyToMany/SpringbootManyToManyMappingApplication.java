package com.example.manyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.manyToMany.entity.Post;
import com.example.manyToMany.entity.Tag;
import com.example.manyToMany.repository.PostRepository;
import com.example.manyToMany.repository.TagRepository;

@SpringBootApplication
public class SpringbootManyToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootManyToManyMappingApplication.class, args);
	}

	@Autowired
	PostRepository postRepository;

	@Autowired
	TagRepository tagRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post post = new Post("Hibernate", "Simply a Hibernate", "Hibernate is a framework contains ORM mapping");

		Tag springBoot = new Tag("springboot");
		Tag Hibernate = new Tag("Hibernate");

		post.getTags().add(Hibernate);
		post.getTags().add(springBoot);
		
		this.postRepository.save(post);

	}

}
