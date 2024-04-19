package com.sorrab.Sis_Emprestimos.service.impl;

import com.sorrab.Sis_Emprestimos.domain.model.User;
import com.sorrab.Sis_Emprestimos.domain.model.repository.UserRepository;
import com.sorrab.Sis_Emprestimos.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exist.");
        }
        return userRepository.save(user);
    }
}
