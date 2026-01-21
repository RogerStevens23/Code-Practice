package CodingBatPracticeClasses;

public class Logic1 {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        boolean result = false;
        if(isWeekend) {
            if(cigars >= 40)
                result = true;
        }
        else {
            if (cigars >= 40 && cigars <= 60)
                result = true;
        }
        return result;
    }
    public static int dateFashion(int you, int date) {
        if(you >= 8 && date >= 3 || date >= 8 && you >= 3)
            return 2;
        else if (you >= 3 && date > 2 || date >= 3 && you > 2)
            return 1;
        else return 0;
    }
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp >= 60 && temp <= 90 && !isSummer)
            return true;
        else if(temp < 59 || temp > 91 && !isSummer)
            return false;
        else return (temp > 59 && temp <= 100 && isSummer);
    }
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if(!isBirthday && speed <= 60 || isBirthday && speed <= 65)
            return 0;
        else if(!isBirthday && speed <= 80 || isBirthday && speed <= 85)
            return 1;
        else return 2;
    }
    public static int sortaSum(int a, int b) {
        if(a+b >= 10 && a+b <= 19)
            return 20;
        else return (a+b);
    }
    public static String alarmClock(int day, boolean vacation) {
        if (!vacation && day >= 1 && day <= 5)
            return "7:00";
        else if(!vacation && day == 0 || !vacation && day == 6 || vacation && day >= 1 && day <= 5)
            return "10:00";
        else return "off";
    }


}
