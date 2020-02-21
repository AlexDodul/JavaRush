package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth(){
        int count = 15;
        return count;
    }
    @Override
    String getDescription(){
        return "Я - курица." + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
