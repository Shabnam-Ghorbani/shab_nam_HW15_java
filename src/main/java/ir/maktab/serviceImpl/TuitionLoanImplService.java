package ir.maktab.service;

import ir.maktab.model.TuitionLoan;
import ir.maktab.repository.TuitionLoanRepository;

public class TuitionLoanImplService implements TuitionLoanService {
    private static TuitionLoanRepository tuitionLoanRepository = new TuitionLoanRepository();

    @Override
    public void regisLoan(TuitionLoan tuitionLoan) {
        tuitionLoanRepository.regisLoan(tuitionLoan);
    }

    @Override
    public TuitionLoan showAmountFindByLevelOfStudy(String level) {
        tuitionLoanRepository.showAmountFindByLevelOfStudy(level);
        return null;
    }

    @Override
    public void removeTuitionLoan(TuitionLoan tuitionLoan) {
        tuitionLoanRepository.removeTuitionLoan(tuitionLoan);
    }
}
