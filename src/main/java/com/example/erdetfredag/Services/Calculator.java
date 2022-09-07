package com.example.erdetfredag.Services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calculator {

  LocalDate today= LocalDate.now();

  public boolean dayname() {

    if (today.getDayOfWeek().equals(DayOfWeek.FRIDAY) ) {
      System.out.println("Jubii :)");
      return true;

    } else {
      System.out.println("Desværre :'(");
      return false;

    }

  }
}