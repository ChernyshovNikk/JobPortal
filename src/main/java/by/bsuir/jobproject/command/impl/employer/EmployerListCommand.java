package by.bsuir.jobproject.command.impl.employer;

import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.model.Employer;
import by.bsuir.jobproject.model.Resume;
import by.bsuir.jobproject.service.impl.EmployerServiceImpl;
import by.bsuir.jobproject.service.impl.ResumeServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by NotePad.by on 30.04.2017.
 */
public class EmployerListCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = ConfigurationManager.getProperty("path.page.employers");

        EmployerServiceImpl employerService = new EmployerServiceImpl();
        try {
            ArrayList<Employer> employers;
            employers = employerService.getAllEntities();
            request.setAttribute("employers", employers);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
