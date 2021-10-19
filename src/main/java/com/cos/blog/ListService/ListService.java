package com.cos.blog.ListService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

//import rg.springframework.transaction.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.List.BoardListRepository;
import com.cos.blog.User.User;
import com.cos.blog.User.UserRepository;
import com.cos.blog.User.UserType;

@Service
public class ListService {

	@Autowired
	private BoardListRepository boardListRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public void findBoardInfo() {
		
		User user = new User("adc","123","123", UserType.User);
	
		User user2 = new User("abcd","1414","2525",UserType.ADMIN);
		User user3 = new User("a","244","323",UserType.User);
		entityManager.persist(user);
		
		entityManager.persist(user2);	
		
		userRepository.save(user);
		
		
		
		//userRepository.deleteAll(); <= userRepository에 연결된 데이터베이서 데이터 전체 삭제
		
	}
}
