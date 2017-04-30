package by.bsuir.jobproject.command.impl;


import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;


public class ToLoginCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return ConfigurationManager.getProperty("path.page.login");
    }
}
