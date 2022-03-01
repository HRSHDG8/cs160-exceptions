package edu.sdsu.cs160l.university.course;

import edu.sdsu.cs160l.university.exceptions.ClassFullException;
import edu.sdsu.cs160l.university.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.university.student.Student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Course is now converted to an abstract class so that each course can track students enrolled in that course.
 * Each course should now limit the no of enrollments (3 in this case)
 */
public abstract class Course {
    private Set<Student> studentToBeEnrolled;
    private final static Integer CLASS_SIZE = 3;

    public Course() {
        this.studentToBeEnrolled = new HashSet<>();
    }

    public void addStudent(Student studentToBeEnrolled) throws StudentAlreadyEnrolledException, ClassFullException {
        //TODO check if studentToBeEnrolled is null if yes throw new NullPointerException

        //TODO check if studentToBeEnrolled is not already enrolled in the class if yes create and throw a StudentAlreadyPresentException,
        // you may leverage the studentAlreadyPresent function below

        //TODO check is class is already full if yes create and throw a ClassFullException
        // you may leverage the isClassFull function below

        //TODO if all the checks pass, add the student to the the course list "studentsEnrolled"

    }

    private boolean studentAlreadyPresent(Student student) {
        return studentToBeEnrolled.contains(student);
    }

    private boolean isClassFull() {
        return studentToBeEnrolled.size() >= CLASS_SIZE;
    }

    public abstract String courseName();

    public abstract List<String> courseDescription();

    public abstract Set<String> prerequisites();
}
