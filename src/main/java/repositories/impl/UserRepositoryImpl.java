package repositories.impl;

import model.User;
import repositories.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    public UserRepositoryImpl(DaoImpl dao) {

    }

    @Override
    public int create(User user) {
        return 0;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }
}
