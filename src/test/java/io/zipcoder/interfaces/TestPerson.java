package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Long id = 5L;
        String name = "Anthony";

        Person person = new Person(id, name);

        Assert.assertEquals(id, person.getId());
        Assert.assertEquals(name, person.getName());
    }

    @Test
    public void testSetName() {
        Long id = 5L;
        String name = "";
        Person person = new Person(id, name);

        person.setName("Anthony");

        Assert.assertEquals("Anthony", person.getName());
    }

}
