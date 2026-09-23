package software.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public int calculateAgeOn(LocalDate date) {
        if (date.isBefore(birthDate)) {
            throw new IllegalArgumentException("Date cannot be before birth date");
        }
        return Period.between(birthDate, date).getYears();
    }
}
