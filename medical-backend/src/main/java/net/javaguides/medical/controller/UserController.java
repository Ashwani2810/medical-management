package net.javaguides.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.medical.model.User;
import net.javaguides.medical.services.UserService;

@RestController
@RequestMapping("/api/user/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUser();

	}

	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
	}

}
