package com.user.service.userservice;

import com.user.service.userservice.model.User;
import com.user.service.userservice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testCreateUser(){
		User user = new User();
		user.setUsername("User tester");
		user.setEmail("tester@email.com");
		user.setPassword("password");
		user.setPhone("085645890621");
		user.setIsDeleted(0);
		assertNotNull(user);
	}

	@Test
	public void testGetUser(){
        User user = new User();
        user.setUsername("andikaopp");
        user.setEmail("tester@email.com");
        user.setPassword("password");
        user.setPhone("085645890621");
        user.setIsDeleted(0);
		assertEquals("andikaopp", user.getUsername());
	}

}
