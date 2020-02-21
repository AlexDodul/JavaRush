package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {
    public int getCountOfEggsPerMonth(){
        int count = 14;
        return count;
    }
    @Override
    String getDescription(){
        return "Я - курица." + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
