package by.bsuir.jobproject.model;

import java.io.Serializable;

/**
 * Created by AR on 19.03.2017.
 */
public class Company implements Serializable {

    private int id_company;
    private int id_country;
    private String company_name;
    private String company_information;

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_information() {
        return company_information;
    }

    public void setCompany_information(String company_information) {
        this.company_information = company_information;
    }

}
