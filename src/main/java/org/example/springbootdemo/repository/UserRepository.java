package org.example.springbootdemo.repository;

import org.example.springbootdemo.dto.UserDto;
import org.example.springbootdemo.entity.user.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);

    AppUser save(UserDto userDto);
}