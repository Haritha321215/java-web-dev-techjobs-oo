package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.net.SocketOption;

import static org.junit.Assert.*;

public class JobTest {
    Job j1,j2,job;

    @Before
    public void setUp(){
        System.out.println("before test");
        j1=new Job();
        j2=new Job();
    }
    @Test
    public void testSettingJobId(){
        assertTrue(j2.getId()-j1.getId()==1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertFalse(job2.getId()==job3.getId());
    }
    @Test
    public void testToStringMethod(){
        Job toStringJob = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertEquals("\nID: "+toStringJob.getId()+"\nName: "+toStringJob.getName()+"\nEmployer: "+toStringJob.getEmployer()+
                "\nLocation: "+toStringJob.getLocation()+"\nPositionType: "+toStringJob.getPositionType()+
                "\nCoreCompetency: "+toStringJob.getCoreCompetency()+"\n",toStringJob.toString());
    }
    @Test
    public void testStartingEndingNewlines(){
        Job newLines = new Job("\nWeb Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertTrue(newLines.toString().charAt(0)==newLines.toString().charAt(newLines.toString().length()-1));
    }
    @Test
    public void testAssigningValuesToConstructor(){
        Job object = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertEquals("Web Developer",object.getName());
        assertEquals("LaunchCode",object.getEmployer().getValue());
        assertEquals("St. Louis",object.getLocation().getValue());
        assertEquals("Front-end developer",object.getPositionType().getValue());
        assertEquals("JavaScript",object.getCoreCompetency().getValue());
    }
    @Test
    public void testOnlyId(){
        Job object = new Job();


    }

}
