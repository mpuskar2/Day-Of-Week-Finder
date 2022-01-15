import java.util.Scanner;

public class Main {

    public static boolean isLeapYear = false;

    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int doomsDayOfWeek; //0 to 6 (0 is Sunday)
        int shift;
        int resultDay = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Program to find what day of the week a day is");

        System.out.print("Enter the day: ");
        day = input.nextInt();
        System.out.print("Enter the month (Ex. 1 for January): ");
        month = input.nextInt();
        System.out.print("Enter the year: ");
        year = input.nextInt();
        
        doomsDayOfWeek = specialDayFinder2000Up(year);

        /*
        Doomsdays: month/day
        1/3 or 1/4 leap year
        2/28 or 2/29 leap year
        3/14
        4/4
        5/9
        6/6
        7/11
        8/8
        9/5
        10/10
        11/7
        12/12
         */

        switch (month){
            case 1:
                if (!isLeapYear){
                    shift = (day - 3) % 7;
                }
                else{
                    shift = (day - 4) % 7;
                }
                resultDay = doomsDayOfWeek + shift;
                break;
            case 2:
                if (!isLeapYear){
                    shift = (day - 28) % 7;
                }
                else{
                    shift = (day - 29) % 7;
                }
                resultDay = doomsDayOfWeek + shift;
                break;
            case 3:
                shift = (day - 14) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 4:
                shift = (day - 4) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 5:
                shift = (day - 9) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 6:
                shift = (day - 6) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 7:
                shift = (day - 11) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 8:
                shift = (day - 8) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 9:
                shift = (day - 5) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 10:
                shift = (day - 10) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 11:
                shift = (day - 7) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            case 12:
                shift = (day - 12) % 7;
                resultDay = doomsDayOfWeek + shift;
                break;
            default:
                break;
        }

/*        if (month == 1){
            shift = (day - 3)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 2){
            shift = (day - 28)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 3){
            shift = (day - 14)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 4){
            shift = (day - 4)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 5){
            shift = (day - 9)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 6){
            shift = (day - 6)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 7){
            shift = (day - 11)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 8){
            shift = (day - 8)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 9){
            shift = (day - 5)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 10){
            shift = (day - 10)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 11){
            shift = (day - 7)%7;
            resultDay = doomsDayOfWeek + shift;
        }
        else if (month == 12){
            shift = (day - 12)%7;
            resultDay = doomsDayOfWeek + shift;
        }*/

        // Two checks to bring the day back between 0 and 6 if it isn't
        if (resultDay < 0){
            resultDay = resultDay + 7;
        }
        else if (resultDay > 6){
            resultDay = resultDay - 7;
        }

        // Printing the day
        printDay(resultDay);

    }

    public static int specialDayFinder2000Up (int year){
        // For the years 2000 and up
        int yearDiff = year - 2000;
        int leapYears = Math.floorDiv(yearDiff, 4);

        if (yearDiff % 4 == 0){
            isLeapYear = true;
        }

        // Special day in 2000 is Tuesday (2)
        // Mod 7 to make the number between 0 and 6
        return (2 + yearDiff + leapYears) % 7;
    }

    public static void printDay (int resultDay){
        if (resultDay == 0){
            System.out.println("This day is a Sunday");
        }
        else if (resultDay == 1){
            System.out.println("This day is a Monday");
        }
        else if (resultDay == 2){
            System.out.println("This day is a Tuesday");
        }
        else if (resultDay == 3){
            System.out.println("This day is a Wednesday");
        }
        else if (resultDay == 4){
            System.out.println("This day is a Thursday");
        }
        else if (resultDay == 5){
            System.out.println("This day is a Friday");
        }
        else if (resultDay == 6){
            System.out.println("This day is a Saturday");
        }
        else {
            System.out.println("Error");
        }
    }
}