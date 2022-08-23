package com.example.City.service;

import com.example.City.model.MyUser;
import com.example.City.model.UserType;
import com.example.City.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public MyUser insertCitizenUser(MyUser myUser) {
        if (userRepository.findAll().isEmpty()) {
            System.out.println(userRepository.save(MyUser.builder()
                    .userType(UserType.MAYOR)
                    .tok(UUID.randomUUID().toString())
                    .build()));
        }

        return userRepository.save(myUser);
    }

    public boolean isMayor(String token) {
        return userRepository.getUserByTok(token).getUserType().equals(UserType.MAYOR);
    }
}
