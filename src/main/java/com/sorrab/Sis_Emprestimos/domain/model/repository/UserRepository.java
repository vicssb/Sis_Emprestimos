package com.sorrab.Sis_Emprestimos.domain.model.repository;

import com.sorrab.Sis_Emprestimos.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}
