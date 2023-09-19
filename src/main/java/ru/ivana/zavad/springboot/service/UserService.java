package ru.ivana.zavad.springboot.service;

import ru.ivana.zavad.springboot.models.User;

import java.util.List;

public interface UserService {
    List<User> peopleCount();
    public User userShow(Integer id);
    void saveUser(User user);
    void updateUser(Integer id, User updatedUser);
    void deleteUser(Integer id);

}
