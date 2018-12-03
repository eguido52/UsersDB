package edu.csumb.cst438.userdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users{
    @Id
    private String id;
    private String userName;
    private double credit;

    public Users(String userName, double credit)
    {
        this.userName = userName;
        this.credit = credit;
    }

    public String getId()
    {
        return this.id;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public double getCredit()
    {
        return this.credit;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setPrice(double credit)
    {
        this.credit = credit;
    }
}
