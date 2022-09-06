package ru.demo.springboot.dao;

import ru.demo.springboot.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
    User getUserById(long id);

}
