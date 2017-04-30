package by.bsuir.jobproject.command.impl.employer;

import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.service.impl.EmployerServiceImpl;
import by.bsuir.jobproject.service.impl.ResumeServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by NotePad.by on 30.04.2017.
 */
public class DeleteEmployerCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = ConfigurationManager.getProperty("path.page.employers");

        EmployerServiceImpl employerService = new EmployerServiceImpl();
        int employerId = Integer.parseInt(request.getParameter("employer_id"));
        try {
            employerService.deleteEntity(employerId);
            request.setAttribute("employers", employerService.getAllEntities());
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
