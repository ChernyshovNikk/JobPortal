package by.bsuir.jobproject.command.impl.vacancy;


import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.model.Vacancy;
import by.bsuir.jobproject.service.impl.VacancyServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


public class ReadAllVacanciesCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = ConfigurationManager.getProperty("path.page.vacancies");
        VacancyServiceImpl vacancyService = new VacancyServiceImpl();
        try {
            ArrayList<Vacancy> vacancies;
            vacancies = vacancyService.getAllEntities();
            request.setAttribute("vacancies", vacancies);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
