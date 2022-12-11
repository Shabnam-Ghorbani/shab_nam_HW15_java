package ir.maktab;

import ir.maktab.model.Student;
import ir.maktab.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.creat(new Student());

    }
}
