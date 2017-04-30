package by.bsuir.jobproject.command;


import by.bsuir.jobproject.exception.CommandException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by AR on 29.03.2017.
 */
public interface ActionCommand {
    String execute(HttpServletRequest request) throws CommandException;
}
