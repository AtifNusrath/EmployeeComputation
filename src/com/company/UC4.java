package com.company;

public class UC4 {
           public static void main(String[] args)
        {
            final int PART_TIME = 0;
            final int FULL_TIME = 1;
            final int WAGE_PER_HR = 20;
            int empType = (int) (Math.random() * 10) % 2;
            int workingHours =0;
            switch (empType)
            {
                case FULL_TIME:
                    System.out.println("Employee is Present Full time");
                    workingHours = 8;
                    break;
                case PART_TIME:
                    System.out.println("Employee is Present Part time");
                    workingHours = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Employee Daily Wage is " + wage);
        }
    }


