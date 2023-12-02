package com.visualpathit.account.service;

import java.util.List;

import com.visualpathit.account.model.User;

<<<<<<< HEAD
/** {@author waheedk}!*/
=======
/** {@author imrant}!*/
>>>>>>> f95b762d12759fb580e677a155c7a068e20387ad
public interface UserService {
	/** {@inheritDoc}} !*/
    void save(User user);
    /** {@inheritDoc}} !*/
    User findByUsername(String username);
    User findById(long id);
    /*public void updateUser(User user);*/
    public List <User> getList();
}
