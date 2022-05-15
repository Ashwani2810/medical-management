package net.javaguides.medical.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.medical.model.User;
import net.javaguides.medical.repository.UserRepository;
import net.javaguides.medical.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.getById(userId);
	}

	@Override
	public Boolean updateUser(User user, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(Long userId) {
		try {
			userRepository.deleteById(userId);
			return true;
		}catch (Exception e) {
		// TODO Auto-generated method stub
		return false;
		}
	}
}