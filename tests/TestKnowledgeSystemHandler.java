package test.hknet.res;

import hk.examples.res.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestKnowledgeSystemHandler {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSum() {
        //fail("Not yet implemented");
        long a = 5;
        long b = 6;
        long actual = a + b;
        long expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void testKnowledgeSystemHandler() {

        KnowledgeSystem knowledgeSystem = new KnowledgeSystem("Accounts", 8);
        
        Employee np = new Employee("1213425", "np");
        
        Project project = new Project("DW434", "Make By Measuring");
        
        InstanceOfProject need = new InstanceOfProject(project, np );
        knowledgeSystem.addProject(need);
        
        InstanceOfProject nextNeed = new InstanceOfProject(project, np);
        knowledgeSystem.addProject(nextNeed);
        knowledgeSystem.addProject(nextNeed);
        knowledgeSystem.addProject(nextNeed);
        knowledgeSystem.addProject(nextNeed);
        //Test the system
        assertEquals(knowledgeSystem.getNumberOfProjectsNeeded(),5);
    }

}
