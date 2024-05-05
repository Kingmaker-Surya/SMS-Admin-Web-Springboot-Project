package com.sms.application.service;

import java.util.List;

import com.sms.application.dto.UserDto;
import com.sms.application.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
