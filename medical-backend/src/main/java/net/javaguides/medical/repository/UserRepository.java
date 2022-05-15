package net.javaguides.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.medical.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
