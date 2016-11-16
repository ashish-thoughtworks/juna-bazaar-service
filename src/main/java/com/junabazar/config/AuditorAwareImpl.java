package com.junabazar.config;

import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by dharihar on 16/11/2016.
 */
public class AuditorAwareImpl implements AuditorAware<User>{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getCurrentAuditor() {
        String emailId = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByEmail(emailId);
    }
}
