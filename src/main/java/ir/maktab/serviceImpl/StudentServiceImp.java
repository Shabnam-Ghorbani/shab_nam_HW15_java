package ir.maktab.service;

import ir.maktab.exception.DuplicateUsernameException;
import ir.maktab.model.Student;
import ir.maktab.repository.StudentRepository;
import ir.maktab.validation.Validation;

import javax.xml.bind.ValidationException;

public class StudentServiceImp implements StudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public void save(Student student ){
        studentRepository.save(student);
    }

    @Override
    public boolean checkUsername(String username) throws DuplicateUsernameException {
        return studentRepository.checkUsername(username);
    }

    @Override
    public Student signIn(String username, String password) throws ValidationException {
        if (Validation.checkPassword(password))
            return studentRepository.findByUsernameAndPassword(username, password);
        return null;
    }

    @Override
    public void editStudent(Student student) {
        studentRepository.update(student);
    }

    @Override
    public void signOut(Student student) {
        studentRepository.remove(student);
    }
}
