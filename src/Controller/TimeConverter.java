package Controller;

/**
 * TimeConverter is a class designed to take 'x' amount of seconds and converts them into Year, Month, Week, Day, Hour,
 * Minute, Seconds format.
 * */
public class TimeConverter {

    public String convertTime(double seconds){
        StringBuilder finTime = new StringBuilder();
        int days = 0;
        int hours = 0;
        int minutes = 0;

        if(seconds / 86400 >= 1)
        {
            days = (int)(seconds / 86400);
            seconds = seconds - (days * 86400);
            finTime.append(days + " days ");
        }
        if(seconds / 3600 >= 1)
        {
            hours = (int)(seconds / 3600);
            seconds -= hours * 3600;
            finTime.append(hours + " hours ");
        }
        if(seconds / 60 >= 1)
        {
            minutes = (int)(seconds / 60);
            seconds -= minutes * 60;
            finTime.append(minutes + " minutes ");
        }
        if(seconds > 0)
        {
            finTime.append(seconds + " seconds ");
        }

        return finTime.toString();
    }
}
