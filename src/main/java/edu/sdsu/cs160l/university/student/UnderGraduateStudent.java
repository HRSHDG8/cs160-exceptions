package edu.sdsu.cs160l.university.student;

public class UnderGraduateStudent extends Student {
    public UnderGraduateStudent(Long redId, String name, Double gpa, StudentLevel studentLevel, StudentMajor studentMajor) {
        super(redId, name, gpa, studentLevel, studentMajor);
    }

    @Override
    public StudentType studentType() {
        return StudentType.UNDER_GRAD;
    }
}
