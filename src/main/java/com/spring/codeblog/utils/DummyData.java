package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import com.spring.codeblog.service.serviceImpl.CodeblogServiceImpl;

@Component
public class DummyData {

	@Autowired
	CodeBlogRepository rep;
	
	@Autowired
	CodeblogServiceImpl service;

//	@PostConstruct
	public void savePost() {
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Autor Teste1");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do"
				+ " eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim"
				+ " ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut"
				+ " aliquip ex ea commodo consequat. Duis aute irure dolor in"
				+ " reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla"
				+ " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in"
				+ " culpa qui officia deserunt mollit anim id est laborum.");
		post1.setTitulo("Título Teste");
		post1.setData(LocalDate.now());

		Post post2 = new Post();
		post2.setAutor("Autor2 Teste");
		post2.setData(LocalDate.now());
		post2.setTitulo("Titulos Teste2");
		post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do"
				+ " eiusmod tempor incididunt ut labore et dolore magna aliqua. Sapien"
				+ " nec sagittis aliquam malesuada bibendum arcu. Tortor id aliquet lectus"
				+ " proin nibh nisl condimentum id. Lobortis elementum nibh tellus"
				+ " molestie nunc non blandit massa. Aenean pharetra magna ac placerat"
				+ " vestibulum lectus mauris ultrices eros. Cras fermentum odio eu"
				+ " feugiat. Tincidunt augue interdum velit euismod in pellentesque. "
				+ "Purus sit amet luctus venenatis lectus magna fringilla. Est ante in"
				+ " nibh mauris cursus mattis molestie a iaculis. Luctus accumsan tortor"
				+ " posuere ac. Lorem dolor sed viverra ipsum nunc aliquet bibendum enim."
				+ " Tincidunt ornare massa eget egestas purus viverra accumsan. Arcu "
				+ "cursus vitae congue mauris rhoncus aenean vel elit.");

		postList.add(post1);
		postList.add(post2);

		for (Post post : postList) {
			
			Post savedPost = post;
			service.save(post);
			
			
			System.out.println(savedPost.getId());
		}

	}

}
