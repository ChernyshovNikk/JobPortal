package by.bsuir.jobproject.command.impl.vacancy;


import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;


public class ToUpdateVacancyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = null;
        page = ConfigurationManager.getProperty("path.page.edit_user");

        return page;
    }
}