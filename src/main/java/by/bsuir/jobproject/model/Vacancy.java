package by.bsuir.jobproject.model;

import java.io.Serializable;

/**
 * Created by AR on 17.03.2017.
 */
public class Vacancy implements Serializable {

    private int vacancy_id;
    private int company_id;
    private String vacancy_name;
    private String vacancy_requirements;
    private String vacancy_payment;

    public int getVacancy_id() {
        return vacancy_id;
    }

    public void setVacancy_id(int vacancy_id) {
        this.vacancy_id = vacancy_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getVacancy_name() {
        return vacancy_name;
    }

    public void setVacancy_name(String vacancy_name) {
        this.vacancy_name = vacancy_name;
    }

    public String getVacancy_requirements() {
        return vacancy_requirements;
    }

    public void setVacancy_requirements(String vacancy_requirements) {
        this.vacancy_requirements = vacancy_requirements;
    }

    public String getVacancy_payment() {
        return vacancy_payment;
    }

    public void setVacancy_payment(String vacancy_payment) {
        this.vacancy_payment = vacancy_payment;
    }
}
