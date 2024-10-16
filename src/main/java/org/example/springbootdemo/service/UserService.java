package org.example.springbootdemo.service;

import org.example.springbootdemo.dto.UserDto;
import org.example.springbootdemo.entity.user.AppUser;

public interface UserService {
    AppUser findByUsername(String username);

    AppUser save(UserDto userDto);

}