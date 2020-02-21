package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth(){
        int count = 5;
        return count;
    }
    @Override
    String getDescription(){
        return "Я - курица." +  " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
