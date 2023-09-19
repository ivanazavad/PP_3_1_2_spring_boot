package ru.ivana.zavad.springboot.dao;

import ru.ivana.zavad.springboot.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(Integer id);
    void save(User user);
    void update(Integer id, User updatedUser);
    void delete(Integer id);
}
