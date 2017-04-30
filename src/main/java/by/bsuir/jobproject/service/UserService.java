package by.bsuir.jobproject.service;

import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.model.User;

/**
 * Created by AR on 16.04.2017.
 */
public interface UserService extends Service<User>{
    User findUser(String login, String password) throws ServiceException;


}
