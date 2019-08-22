package com.kuliza.task.repository;
import org.springframework.data.repository.CrudRepository;
import com.kuliza.task.model.User;

public interface UserRepo extends CrudRepository<User, String> {

}

