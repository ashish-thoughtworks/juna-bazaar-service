package com.junabazar.inventory.repository;

import com.junabazar.inventory.model.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dharihar on 14/11/2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
