package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country{
    public int getCountOfEggsPerMonth(){
        //int count = 13;
        return 13;
    }
    @Override
    String getDescription(){
        return "Я - курица." + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
