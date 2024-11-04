public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < weekDays.length; i++) {
            if (i > 4) {
                break;
            } else {
                System.out.println(weekDays[i]);
            }
        }
    }
}