package com.sorrab.Sis_Emprestimos.service;

import com.sorrab.Sis_Emprestimos.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
