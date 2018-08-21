package userCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userCrud.model.User;
import userCrud.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void update(User user) {
        repository.save(user);
    }

    public boolean delete(int id) {
        return repository.delete(id);
    }

    public User get(int id) {
        return repository.get(id);
    }

    public List<User> getAll() {
        return repository.getAll();
    }
}
