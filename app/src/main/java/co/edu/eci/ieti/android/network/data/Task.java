package co.edu.eci.ieti.android.network.data;

import java.util.Date;

public class Task {
    private String id, description, responsable, status,email;
    private Date dueDate;

    public Task(String id,String description, String responsable, String email, String status, Date dueDate) {
        this.id=id;
        this.description = description;
        this.responsable = responsable;
        this.email = email;
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getId(){
        return id;
    }

    public void  setId(String id){
        this.id=id;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
