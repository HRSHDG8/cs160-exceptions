package edu.sdsu.cs160l.university.application;

import edu.sdsu.cs160l.university.student.Applicant;
import edu.sdsu.cs160l.university.student.Student;

public interface UniversityApplication {
    void submitScore(Applicant s, float score);
    void submitDocuments(Applicant s,String documents);
    boolean checkStatus(Applicant applicant);
}
