package com.company;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String monthName = "";
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"January");
        map.put(2,"February");
        map.put(3,"March");
        map.put(4,"April");
        map.put(5,"May");
        map.put(6,"June");
        map.put(7,"July");
        map.put(8,"August");
        map.put(9,"September");
        map.put(10,"October");
        map.put(11,"November");
        map.put(12,"December");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(month == entry.getKey()){
                monthName = entry.getValue();
                System.out.println(monthName);
            }

        }
    }
}
