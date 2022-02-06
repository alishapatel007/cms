package com.company.cms.controller;

import java.util.HashMap;
import java.util.Map;

public class InstructorController {

    static Map<String,String> instructors = new HashMap<>();

    public static void addInstructors(){
        instructors.put("alisha", "password");
    }

    public Boolean isValidUser(String username, String password){
        Boolean result = Boolean.FALSE;
        String cred = instructors.get(username);
        if(null != cred &&
            password.equalsIgnoreCase(cred)){
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean registerUser(String username, String password){
        addInstructors();
        Boolean isRegistrationSuccess = Boolean.FALSE;
        String user = instructors.get(username);
        if(null == user){
            instructors.put(username, password);
            isRegistrationSuccess = Boolean.TRUE;
        }
        return  isRegistrationSuccess;
    }
}
