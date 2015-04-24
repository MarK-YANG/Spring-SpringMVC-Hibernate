package com.mark.java.service;

import com.mark.java.entity.User;

import java.util.List;

/**
 * Created by mark on 4/24/15.
 */
public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
}
