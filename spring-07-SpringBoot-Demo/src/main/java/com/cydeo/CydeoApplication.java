package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {

//		Comment comment  = new Comment();
//		comment.setAuthor("Johnson");
//		comment.setText("Spring Framework");

		Comment comment = new Comment();
		comment.setAuthor("Rose");
		comment.setText("Spring boot practice");

		// ApplicationContext container = SpringApplication.run(CydeoApplication.class, args);
		ApplicationContext container = SpringApplication.run(CydeoApplication.class, args);

		CommentService commentService = container.getBean(CommentService.class);
		commentService.publishComment(comment);

		commentService.printConfigData();
		commentService.printDbConfigData();
	}



}
