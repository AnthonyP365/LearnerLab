package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(1L, "instructor");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(1L, "instructor");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(1L, "instructor");
        Student student = new Student(1L, "student");

        instructor.teach(student, 5);

        Assert.assertEquals(5, student.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(1L, "instructor");
        Student student0 = new Student(1L, "student0");
        Student student1 = new Student(2L, "student1");
        Learner[] learners = {student0, student1};

        instructor.lecture(learners, 10);

        Assert.assertEquals(5, student0.getTotalStudyTime(), 0.001);
        Assert.assertEquals(5, student1.getTotalStudyTime(), 0.001);
    }
}
