package com.cos.blog.ListService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

//import rg.springframework.transaction.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.List.BoardList;
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
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	@Transactional
	public void findBoardInfo()  {
		User user = new User("123","2134","1234",UserType.User);
		userRepository.save(user);
		
		BoardList boardList = new BoardList("test", "testBody", user.getName());
		saveBoard(boardList);
		
	}
	
	public boolean saveBoard(BoardList boardList) {
		boardListRepository.save(boardList);
		return true;
	}
}
//
//@Autowired
//private EntityManagerFactory entityManagerFactory;
// EntityManger은 스프링 빈에 등록되지 않는다. 따라서 @Autowired을 사용할 수 없다.
//@PersistenceContext(type = PersistenceContextType.TRANSACTION)
//private EntityManager entityManager;
