package com.example.Rest.repository;

import com.example.Rest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<String, String> userPasswords = new HashMap<>();
    private final Map<String, List<Authorities>> userAuthorities = new HashMap<>();

    public UserRepository() {
        userPasswords.put("admin", "adminpass");
        userAuthorities.put("admin", Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE));

        userPasswords.put("user", "userpass");
        userAuthorities.put("user", List.of(Authorities.READ));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (userPasswords.containsKey(user) && userPasswords.get(user).equals(password)) {
            return userAuthorities.get(user);
        }
        return Collections.emptyList();
    }
}
