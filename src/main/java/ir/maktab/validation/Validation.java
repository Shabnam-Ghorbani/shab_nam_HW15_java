package ir.maktab.validation;

import javax.xml.bind.ValidationException;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StudentPasswordValidation {
    public static void checkPassword(String password) throws ValidationException {
        if (!Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>]).{8,20}$",
                password))
            throw new ValidationException("Your password is not valid");
    }

    public static void checkUsername(String username) throws ValidationException {
        if (!Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>]).{8,20}$", username))
            throw new ValidationException("Your userName is not valid");
    }

    public static void checkName(String name) throws ValidationException {
        if (!Pattern.matches("^[A-Z]'?[- a-zA-Z]( [a-zA-Z])*$", name))
            throw new ValidationException("Your name is not valid");
    }

    public static void checkFamily(String familyName) throws ValidationException {
        if (!Pattern.matches("^[A-Z]'?[- a-zA-Z]( [a-zA-Z])*$", familyName))
            throw new ValidationException("Your Family is not valid");
    }

    public static boolean checkNationalCode(String nationalCode) {
        if (!nationalCode.matches("^\\d{10}$"))
            return false;
        int check = Integer.parseInt(nationalCode.substring(9, 10));
        int sum = IntStream.range(0, 9)
                .map(x -> Integer.parseInt(nationalCode.substring(x, x + 1)) * (10 - x)).sum() % 11;
        return (sum < 2 && check == sum) || (sum >= 2 && check + sum == 11);
    }

    public static void checkMotherName(String motherName) throws ValidationException {
        if (!Pattern.matches("[A-Z][a-z]*", motherName))
            throw new ValidationException("mother name is not valid");
    }

    public static void checkFatherName(String fatherName) throws ValidationException {
        if (!Pattern.matches("[A-Z][a-z]*", fatherName))
            throw new ValidationException("father name is not valid");
    }

    public static void checkStudentNumber(String studentNumber) throws ValidationException {
        if (!Pattern.matches("\\d{10}", studentNumber))
            throw new ValidationException("your studentNumber is not valid");
    }

    public static void checkDataOfBirth(String dateOfBirth) throws ValidationException {
        if (!Pattern.matches(" ^\\\\d{4}-\\\\d{2}-\\\\d{2}$", dateOfBirth))
            throw new ValidationException("your DataOfBirth is not valid");
    }

    public static void checkStudentDormitory(String studentDormitory) throws ValidationException {
        if (!Pattern.matches("[A-Z][a-z]*", studentDormitory))
            throw new ValidationException("studentDormitory is not valid");
    }

    public static void checkYearOfArrival(String yearOfArrival) throws ValidationException {
        if (!Pattern.matches(" ^\\\\d{4}-\\\\d{2}-\\\\d{2}$", yearOfArrival))
            throw new ValidationException("your yearOfArrival is not valid");
    }

}



