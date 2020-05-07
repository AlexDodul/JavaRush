package com.javarush.task.task36.task3608.model;

import java.util.ArrayList;
import java.util.List;
import com.javarush.task.task36.task3608.bean.User;

public class ModelData {
    private List<User> users = new ArrayList<>();

    private User activeUser;


    private boolean displayDeletedUserList;

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }



    public void setUsers(List users){
        this.users = users;
    }
    public List<User> getUsers(){
        return users;
    }
}
