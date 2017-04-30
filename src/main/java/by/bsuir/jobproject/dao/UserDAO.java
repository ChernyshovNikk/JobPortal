package by.bsuir.jobproject.dao;

import by.bsuir.jobproject.model.User;

/**
 * Created by AR on 16.04.2017.
 */
public interface UserDAO extends CrudDAO<User> {
    User findUser(String login, String password);
}
