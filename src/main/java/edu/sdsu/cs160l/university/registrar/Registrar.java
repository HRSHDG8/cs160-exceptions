package edu.sdsu.cs160l.university.registrar;

import edu.sdsu.cs160l.university.course.*;
import edu.sdsu.cs160l.university.criteria.StudentStrategy;
import edu.sdsu.cs160l.university.exceptions.ClassFullException;
import edu.sdsu.cs160l.university.exceptions.NoSuchCourseException;
import edu.sdsu.cs160l.university.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.university.student.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Thoughts, does a university have a single registrar office or multiple?
 */
public class Registrar {
    private static Registrar REGISTRAR;
    private final Map<String, Course> courseList;

    private Registrar() {
        courseList = new HashMap<>();
        courseList.put("CS150", CourseFactory.getCourse("CS150"));
        courseList.put("CS160", CourseFactory.getCourse("CS160"));
        courseList.put("CS210", CourseFactory.getCourse("CS210"));
        courseList.put("CS340", CourseFactory.getCourse("CS340"));
    }

    public static Registrar getInstance(){
        if(REGISTRAR==null){
            REGISTRAR = new Registrar();
        }
        return REGISTRAR;
    }

    public void enrollStudentToClass(Student student, String courseName) throws NoSuchCourseException, ClassFullException, StudentAlreadyEnrolledException {
        //TODO check if courseName is a valid courseName if not throw a new NoSuchCourseException
        // you may use the isValidCourse function


        Course course = courseList.get(courseName);
        course.addStudent(student);
    }

    public boolean isStudentValid(Student student, StudentStrategy studentStrategy){
       return studentStrategy.isValid(student);
    }

    private boolean isNotValidCourse(String courseName) {
        return !courseList.containsKey(courseName);
    }
}
