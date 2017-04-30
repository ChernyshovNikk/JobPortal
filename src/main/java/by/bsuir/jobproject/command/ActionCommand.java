package by.bsuir.jobproject.command;


import by.bsuir.jobproject.exception.CommandException;

import javax.servlet.http.HttpServletRequest;


public interface ActionCommand {
    String execute(HttpServletRequest request) throws CommandException;
}
