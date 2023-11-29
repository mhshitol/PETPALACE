package com.PetPalace.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class User {
    private String name;
    @Id
    private  String email;
    private  int number;
    private String password;

    @Transient
    private String confirm_password;


    public User(){
        super();
    }

    public User(String name, String email, int number, String password, String confirm_password){
        this.name = name;
        this.email = email;
        this.number = number;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void  setNumber(int number){
        this.number = number;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setConfirm_pass(String confirm_password){
        this.confirm_password = confirm_password;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int  getNumber(){
        return number;
    }
    public String getPassword(){
        return password;
    }
    public String getConfirm_pass(){
        return confirm_password;
    }

}