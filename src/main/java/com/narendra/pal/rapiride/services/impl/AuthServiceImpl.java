package com.narendra.pal.rapiride.services.impl;

import com.narendra.pal.rapiride.dto.DriverDto;
import com.narendra.pal.rapiride.dto.SignupDto;
import com.narendra.pal.rapiride.dto.UserDto;
import com.narendra.pal.rapiride.entities.User;
import com.narendra.pal.rapiride.entities.enums.Role;
import com.narendra.pal.rapiride.exceptions.RuntimeConflictException;
import com.narendra.pal.rapiride.repositories.UserRepository;
import com.narendra.pal.rapiride.services.AuthService;
import com.narendra.pal.rapiride.services.RiderService;
import com.narendra.pal.rapiride.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;
    private final WalletService walletService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    @Transactional
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null)
                throw new RuntimeConflictException("Cannot signup, User already exists with email "+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

//        create user related entities
        riderService.createNewRider(savedUser);
        walletService.createNewWallet(savedUser);

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
