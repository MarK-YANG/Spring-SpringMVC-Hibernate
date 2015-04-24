package com.mark.java.DAO;

import com.mark.java.entity.User;

import java.util.List;

/**
 * Created by mark on 4/24/15.
 */
public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}
