package com.java.buddies.poo.dates;

import com.java.buddies.poo.dates.model.Date;
import com.java.buddies.poo.dates.model.Day;
import com.java.buddies.poo.dates.service.FormatterService;

public class Application {
    public static void main(String[] args) {
        FormatterService service = new FormatterService();

        String formattedDate = service.mapDate("20240908");
        System.out.println(formattedDate);
        String[]items = formattedDate.split(";");
        String descriptionDay = items[0];
        String numberDay = items[1];
        String month = items[2];
        String year = items[3];

        Day day = new Day(descriptionDay,numberDay);
        Date date = new Date(day, month, year);
        System.out.println(date);



    }
}
