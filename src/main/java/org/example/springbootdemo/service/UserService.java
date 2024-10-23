package org.example.springbootdemo.service;

import org.example.springbootdemo.dto.UserDto;
import org.example.springbootdemo.entity.user.AppUser;

import java.util.List;

public interface UserService {
    AppUser findByUsername(String username);

    AppUser save(UserDto userDto);

    List<UserDto> findAllUsers();
}