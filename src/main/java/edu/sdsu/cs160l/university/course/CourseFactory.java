package edu.sdsu.cs160l.university.course;

import edu.sdsu.cs160l.university.student.StudentLevel;

public class CourseFactory {
    /**
     * A factory method is typically static and hides creation complexity form end user
     */
    public static Course getCourse(String courseName){
        switch (courseName){
            case "cs160":
                return new CS160();
            case "cs210":
                return new CS210();
            case "cs340":
                return new CS340();
            default:
                throw new UnsupportedOperationException("No course of the name "+ courseName +" found.");
        }
    }

    public static Course getRecommendedCourseByLevel(StudentLevel level){
        switch (level){
            case freshman:
                return new CS150();
            case sophomore:
                return new CS160();
            case junior:
                return new CS210();
            case senior:
                return new CS340();
            default:
                throw new UnsupportedOperationException("No course recommendation for level "+ level +" found.");
        }
    }
}
