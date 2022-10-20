package ru.web.springBootMvc.service;

import ru.web.springBootMvc.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User getUser(Long id);
    public void save(User user);
    public void update(Long id, User updateUser);
    public void delete(Long id);
}
