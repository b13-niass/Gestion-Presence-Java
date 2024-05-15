package repositories;

import model.User;

import java.util.List;

public interface UserRepository {
    int create(User user);

    List<User> findAll();

    int update(User user);

    int delete(User user);
}
