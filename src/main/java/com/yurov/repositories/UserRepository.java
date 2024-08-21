package com.yurov.repositories;

import com.yurov.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(Long id);
    void deleteById(Long id);
}
