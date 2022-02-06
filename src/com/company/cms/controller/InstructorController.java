package com.company.cms.controller;

public class InstructorController {

    public Boolean isValidUser(String username, String password){
        Boolean result = Boolean.FALSE;
        if(username.equalsIgnoreCase("Alisha") &&
            password.equalsIgnoreCase("password")){
            result = Boolean.TRUE;
        }
        return result;
    }
}
