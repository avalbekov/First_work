public class Main {
    public static void main(String[] args) {
        int seconds = 100000;
        int secondsInMinute = 60;
        int secondsInHours = secondsInMinute * 60;
        int secondsInDays = secondsInHours * 24;

        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinute;
        int leftSeconds = ((seconds% secondsInDays) % secondsInHours) % secondsInMinute;

        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + leftSeconds);


    }
}