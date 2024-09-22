package com.VarunVatsal.LearnSpringBoot.dao;

import com.VarunVatsal.LearnSpringBoot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
