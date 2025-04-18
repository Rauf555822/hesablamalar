package main.java.ders27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tarixi daxil edin (dd.MM.yyyy)");
        String date = scanner.nextLine();
        LocalDate tarix = LocalDate.parse(date, dateFormatter);

        System.out.println("Vaxti daxil edin (HH:mm)");
        String time = scanner.nextLine();
        LocalTime vaxt = LocalTime.parse(time, timeFormatter);

        LocalDate tarixPlus = tarix.plusDays(7);
        LocalTime vaxtMinus = vaxt.minusHours(2);
        LocalDateTime dateTime = LocalDateTime.of(tarix, vaxt);

        System.out.println("Daxil edilen tarix: " + tarix);
        System.out.println("+7 gun: " + tarixPlus);
        System.out.println("Daxil edilen vaxt: " + vaxt);
        System.out.println("-2 saat: " + vaxtMinus);
        System.out.println("tarix ve vaxt: " + dateTime);
    }
}

