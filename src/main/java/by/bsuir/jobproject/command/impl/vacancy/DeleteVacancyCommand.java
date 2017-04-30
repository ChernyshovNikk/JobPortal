package by.bsuir.jobproject.command.impl.vacancy;

import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.service.impl.VacancyServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by AR on 29.04.2017.
 */
public class DeleteVacancyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {

        String page = ConfigurationManager.getProperty("path.page.vacancies");

        VacancyServiceImpl vacancyService = new VacancyServiceImpl();
        int vacancyId = Integer.parseInt(request.getParameter("vacancy_id"));
        try {
            vacancyService.deleteEntity(vacancyId);
            request.setAttribute("vacancies", vacancyService.getAllEntities());
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
