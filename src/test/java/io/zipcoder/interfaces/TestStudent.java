package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testInheritance() {
        Student student = new Student(1L, "anthony");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testImplementation() {
        Student student = new Student(1L, "anthony");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn() {
        Student student = new Student(1L, "anthony");
        student.learn(5.0);
        Assert.assertEquals(5.0, student.getTotalStudyTime(), 0.001);
    }
}
