package com.feralgoon;

import java.util.HashMap;
import java.util.Map;

public class TimeZoneDemo
{
    Map<String, Integer> timeZones = new HashMap<>();

    private void demo()
    {
        timeZones.put("EST", -5);
        timeZones.put("CST", -6);
        timeZones.put("MST", -7);
        timeZones.put("PST", -8);
        timeZones.put("GMT", 0);

        System.out.println(getTImeDiff("PST", "EST"));
        System.out.println(getTImeDiff("GMT", "CST"));
        System.out.println(getTImeDiff("EST", "MST"));
        System.out.println(getTImeDiff("GMT", "EST"));
    }

    private int getTImeDiff(String s, String t)
    {
        int diff = 0;
        int sVal = timeZones.get(s);
        int tVal = timeZones.get(t);

        diff = sVal-tVal;

        return diff;
    }

    public static void main(String[] args)
    {
        TimeZoneDemo timeZoneDemo = new TimeZoneDemo();

        timeZoneDemo.demo();
    }
}
