package userCrud.service;

import userCrud.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    void update(User user);

    boolean delete(int id);

    User get(int id);

    List<User> getAll();
}
