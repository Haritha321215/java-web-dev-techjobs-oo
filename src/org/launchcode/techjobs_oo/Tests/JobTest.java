package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job j1,j2,job;
    @Before
    public void setUp(){
        System.out.println("before class");
        j1=new Job();
        j2=new Job();
    }
    @Test
    public void testSettingJobId(){
        System.out.println("in testSettingJobId method");
        assertEquals(1,j1.getId());
        assertEquals(2,j2.getId());
        assertTrue(j2.getId()-j1.getId()==1);
    }
    public void testJobConstructorSetsAllFields(){
        job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
    }
    public void testJobsForEquality(){
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertFalse(job2.getId()==job3.getId());
    }
}
