package ss4_class_object.exercise;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
        startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Reset time ");
        System.out.println("2. Stop time ");
        System.out.println("0. Exit");
        System.out.println("Start time: " + stopWatch.getStartTime());
        do {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    stopWatch.start();
                    System.out.println("Start time: " + stopWatch.getStartTime());
                    break;
                case 2:
                    stopWatch.stop();
                    System.out.println("Stop time: " + stopWatch.getEndTime());
                    System.out.println("Elapsed time: " + stopWatch.getElapsedTime());
                    break;
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }

}
