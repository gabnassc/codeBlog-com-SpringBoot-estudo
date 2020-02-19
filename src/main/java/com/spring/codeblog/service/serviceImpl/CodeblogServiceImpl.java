package com.spring.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	@Autowired
	CodeBlogRepository rep; 
	
	@Override
	public List<Post> findAll() {

		return rep.findAll();
	}

	@Override
	public Post findById(long id) {
		return rep.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return rep.save(post);
	}
	

}
