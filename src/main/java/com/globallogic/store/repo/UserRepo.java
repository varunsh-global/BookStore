package com.globallogic.store.repo;

import com.globallogic.store.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

	void deleteById(Integer id);
}
