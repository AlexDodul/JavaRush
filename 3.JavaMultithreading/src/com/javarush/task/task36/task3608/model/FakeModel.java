package com.javarush.task.task36.task3608.model;
import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeModel implements Model {

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData(){
        return modelData;
    }
    @Override
    public void loadUsers(){
        modelData.setUsers(Arrays.asList(new User("Alex", 01, 80), new User("Anna", 02, 80), new User("Gusya", 03, 10)));
    }
}
