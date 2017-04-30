package by.bsuir.jobproject.command.impl.user;

import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.service.UserService;
import by.bsuir.jobproject.service.impl.UserServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by AR on 29.04.2017.
 */
public class DeleteUserCommand implements ActionCommand {
    
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = ConfigurationManager.getProperty("path.page.users");

        UserService userService = new UserServiceImpl();
        int userId = Integer.parseInt(request.getParameter("user_id"));
        try {
            userService.deleteEntity(userId);
            request.setAttribute("users", userService.getAllEntities());
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
