package validator;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern STRING_PATTERN = Pattern.compile("^[\\p{L}]+$");
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
    private static final Pattern FUEL_CONSUMPTION_PATTERN = Pattern.compile("\\-?\\d+(\\.\\d{0,})?");

    public static boolean correctCompany(String name, String country) {
        boolean isCorrect = true;
        if (name.isEmpty() || country.isEmpty()|| !STRING_PATTERN.matcher(country).matches()) {
            isCorrect = false;
        }
        return  isCorrect;
    }

    public static boolean correctPerson(String name, String surname, String age, String phone, String mail) {
        boolean isCorrect = true;
        if (name.isEmpty() || surname.isEmpty() || age.isEmpty() || !NUMBER_PATTERN.matcher(age).matches() ||
                phone.isEmpty() || mail.isEmpty()) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public static boolean correctUser(String login, String password) {
        boolean isCorrect = true;
        if (login.isEmpty() || password.isEmpty()) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public static boolean correctRole(String role) {
        boolean isCorrect = true;
        if (!role.equals("User") || !role.equals("Admin")) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public static boolean correctId(String id) {
        boolean isCorrect = true;
        if (id.isEmpty() || !NUMBER_PATTERN.matcher(id).matches()) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public static boolean correctCar(String name, String year, String distance,
                                     String fuel, String fuelConsumption, String price) {
        boolean isCorrect = true;
        if (name.isEmpty() || year.isEmpty() || !NUMBER_PATTERN.matcher(year).matches() || distance.isEmpty() ||
                !NUMBER_PATTERN.matcher(distance).matches() || fuel.isEmpty() || fuelConsumption.isEmpty() ||
                !FUEL_CONSUMPTION_PATTERN.matcher(fuelConsumption).matches() || price.isEmpty() ||
                !NUMBER_PATTERN.matcher(price).matches()) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public static boolean correctFuel(String fuel) {
        boolean isCorrect = false;
        if (fuel.equals("Бензин") || fuel.equals("Дизель")) {
            isCorrect = true;
        }
        return isCorrect;
    }
}