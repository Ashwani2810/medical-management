package net.javaguides.medical.services;

import java.util.List;

import net.javaguides.medical.model.User;

public interface UserService {
	public User saveUser(User user);

	public List<User> getAllUser();

	public User getUserById(Long userId);

	public Boolean updateUser(User user, Long userId);

	public Boolean deleteUser(Long userId);

}
