package by.bsuir.jobproject.command.impl;


import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.model.User;
import by.bsuir.jobproject.service.impl.UserServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;


public class RegisterCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = ConfigurationManager.getProperty("path.page.login");

        UserServiceImpl userService = new UserServiceImpl();

        try {
            User user = new User();
            user.setUser_login(request.getParameter("login"));
            user.setUser_password(request.getParameter("password"));
            user.setUser_email(request.getParameter("email"));
            user.setUser_status("jobseeker");
            userService.addEntity(user);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
