package com.mark.java.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mark on 4/24/15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public List<String> getAllUsernames() {
        List<String> users = new ArrayList<String>();
        users.add("MarK");
        users.add("Alice");
        users.add("Fowafolo");
        return users;
    }
}
