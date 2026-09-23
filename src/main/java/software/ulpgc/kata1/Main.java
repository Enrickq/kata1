package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(
                "Enrique",
                LocalDate.of(2006, 7, 13)
        );

        LocalDate today = LocalDate.now();

        System.out.println("Nama: " + person.getName());
        System.out.println("Birth date: " + person.getBirthDate());
        System.out.println("Age: " + person.calculateAgeOn(today));
    }
}
