import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] start = sc.nextLine().split(":");
        String[] end = sc.nextLine().split(":");

        int startHour = Integer.parseInt(start[0]);
        int startMinute = Integer.parseInt(start[1]);
        int startSecond = Integer.parseInt(start[2]);
        int startTotalSecond = startHour * 3600 + startMinute * 60 + startSecond;

        int endHour = Integer.parseInt(end[0]);
        int endMinute = Integer.parseInt(end[1]);
        int endSecond = Integer.parseInt(end[2]);
        int endTotalSecond = endHour * 3600 + endMinute * 60 + endSecond;

        int newTotalSecond = endTotalSecond - startTotalSecond;
        if (newTotalSecond <= 0) {
            newTotalSecond += 24 * 3600;
        }

        int newHour = newTotalSecond / 3600;
        int newMinute = (newTotalSecond % 3600) / 60;
        int newSecond = newTotalSecond % 60;

        String ans = String.format("%02d:%02d:%02d", newHour, newMinute, newSecond);
        System.out.println(ans);
    }
}