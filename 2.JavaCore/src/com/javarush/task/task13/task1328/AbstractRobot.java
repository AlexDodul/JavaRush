package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    public abstract BodyPart attack();
    public abstract BodyPart defense();
    public abstract String getName();
    private static int hitCount;
}
