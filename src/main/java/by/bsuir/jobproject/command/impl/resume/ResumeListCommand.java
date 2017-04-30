package by.bsuir.jobproject.command.impl.resume;

import by.bsuir.jobproject.command.ActionCommand;
import by.bsuir.jobproject.exception.CommandException;
import by.bsuir.jobproject.exception.ServiceException;
import by.bsuir.jobproject.model.Resume;
import by.bsuir.jobproject.model.User;
import by.bsuir.jobproject.service.impl.ResumeServiceImpl;
import by.bsuir.jobproject.service.impl.UserServiceImpl;
import by.bsuir.jobproject.util.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by NotePad.by on 30.04.2017.
 */
public class ResumeListCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String page = ConfigurationManager.getProperty("path.page.resumes");

        ResumeServiceImpl resumeService = new ResumeServiceImpl();
        try {
            ArrayList<Resume> resumes;
            resumes = resumeService.getAllEntities();
            request.setAttribute("resumes", resumes);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        return page;
    }
}
