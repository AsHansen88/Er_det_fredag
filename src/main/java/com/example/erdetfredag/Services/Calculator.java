package com.example.erdetfredag.Services;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Calculator {

  Calendar date = Calendar.getInstance();
  String dayNames[] = new DateFormatSymbols().getWeekdays();

  public boolean dayname() {

    if (date.equals(Calendar.FRIDAY)) {
      System.out.println("Jubii :)");
      return true;

    } else {
      System.out.println("Desværre :'(");
      return false;
    }
  }

}
