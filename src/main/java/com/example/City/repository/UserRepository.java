package com.example.City.repository;

import com.example.City.model.MyUser;
import org.hibernate.type.CompositeCustomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

    MyUser getUserByTok(String token);

}
