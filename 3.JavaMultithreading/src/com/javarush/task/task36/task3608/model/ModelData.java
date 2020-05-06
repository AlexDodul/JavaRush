package com.javarush.task.task36.task3608.model;

import java.util.ArrayList;
import java.util.List;
import com.javarush.task.task36.task3608.bean.User;

public class ModelData {
    private List<User> users = new ArrayList<>();

    public void setUsers(List users){
        this.users = users;
    }
    public List<User> getUsers(){
        return users;
    }
}
