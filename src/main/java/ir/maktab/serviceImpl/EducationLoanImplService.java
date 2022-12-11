package ir.maktab.service;

import ir.maktab.model.EducationLoan;
import ir.maktab.model.TuitionLoan;
import ir.maktab.repository.EducationLoanRepository;

public class EducationLoanImplService implements EducationLoanService {
    private static EducationLoanRepository educationLoanRepository = new EducationLoanRepository();

    @Override
    public void regisLoan(EducationLoan educationLoan) {
        educationLoanRepository.regisLoan(educationLoan);
    }

    @Override
    public TuitionLoan showAmountFindByLevelOfStudy(String level) {
        return educationLoanRepository.showAmountFindByLevelOfStudy(level);
    }

    @Override
    public void removeTuitionLoan(EducationLoan educationLoan) {
        educationLoanRepository.removeTuitionLoan(educationLoan);
    }
}
