package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.dto.DriverDto;
import com.narendra.pal.rapiride.dto.SignupDto;
import com.narendra.pal.rapiride.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
