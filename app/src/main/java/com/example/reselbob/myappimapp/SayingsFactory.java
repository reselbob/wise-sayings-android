package com.example.reselbob.myappimapp;

import java.util.ArrayList;
import java.util.List;

public class SayingsFactory {
    private List<String> list = new ArrayList<String>();
    private static SayingsFactory ref;
    private int currentIndex = 0;
    private SayingsFactory()
    {
        list.add("Be Kind To Strangers");
        list.add("Always Be Honest");
        list.add("The Truth is the Best");
        list.add("Tip Well Always");
    }

    public static SayingsFactory getInstance()
    {
        if (ref == null) ref = new SayingsFactory();
        return ref;
    }

    public String getNextSaying(){
        if(currentIndex == list.size()) currentIndex = 0;
        String rtn = list.get(currentIndex);
        currentIndex++;
        return rtn;
    }
}
