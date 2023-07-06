package ch16_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece = LocalTime.of(0,17);
        LocalTime gunduz = LocalTime.of(17,30);

        Duration fark = Duration.between(gece, gunduz);

        System.out.println("fark = " + fark);//fark = PT17H13M

        System.out.println("fark.getSeconds() = " + fark.getSeconds());//fark.getSeconds() = 61980

        System.out.println("fark.toHours() = " + fark.toHours());//fark.toHours() = 17

        System.out.println("fark.toMinutes() = " + fark.toMinutes());//fark.toMinutes() = 1033


    }
}
