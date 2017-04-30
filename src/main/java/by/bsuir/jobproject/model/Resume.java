package by.bsuir.jobproject.model;

import java.io.Serializable;

/**
 * Created by AR on 19.03.2017.
 */
public class Resume implements Serializable{
    private int id_resume;
    private int id_user;
    private int id_specialty;
    private int id_skill;
    private String resume_information;

    public int getId_resume() {
        return id_resume;
    }

    public void setId_resume(int id_resume) {
        this.id_resume = id_resume;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_specialty() {
        return id_specialty;
    }

    public void setId_specialty(int id_specialty) {
        this.id_specialty = id_specialty;
    }

    public int getId_skill() {
        return id_skill;
    }

    public void setId_skill(int id_skill) {
        this.id_skill = id_skill;
    }

    public String getResume_information() {
        return resume_information;
    }

    public void setResume_information(String resume_information) {
        this.resume_information = resume_information;
    }
}
