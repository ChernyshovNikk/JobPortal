package by.bsuir.jobproject.command.impl.resume;


import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;


public class ToCreateResumeCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = null;
        page = ConfigurationManager.getProperty("path.page.add_resume");

        return page;
    }
}
