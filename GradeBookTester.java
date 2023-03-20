import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;
	private GradeBook gradebook;
	
	@Before
	public void setUp() 	{
		//task #3 part 1
		gradebook = new GradeBook (10);
		gradeBook1 = new GradeBook (10);
		gradeBook2 = new GradeBook (10);
		gradeBook1.addScore(80);
		gradeBook1.addScore(88);
		gradeBook2.addScore(76);
		gradeBook2.addScore(88);
		gradeBook2.addScore(90);
		
	}

	@After
	public void tearDown() 
	{
		//task #3 part 2
		gradeBook1= null;
        gradeBook2 = null;
	}

	
	
	    public void testAddScore() {
	        gradebook.addScore(80);
	        gradebook.addScore(90);
	        assertEquals("80.0 90.0 ", gradebook.toString());
	        assertEquals(2, gradebook.getScoreSize());
	    }

	    @Test
	    public void testSum() {
	    	gradebook.addScore(80);
	    	gradebook.addScore(90);
	        assertEquals(170, gradebook.sum(), 0.0001);
	    }

	    @Test
	    public void testMinimum() {
	    	gradebook.addScore(80);
	    	gradebook.addScore(90);
	    	gradebook.addScore(70);
	        assertEquals(70, gradebook.minimum(), 0.0001);
	    }

	    @Test
	    public void testFinalScoreWithTwoScores() {
	    	gradebook.addScore(80);
	    	gradebook.addScore(90);
	        assertEquals(90, gradebook.finalScore(), 0.0001);
	    }

	    @Test
	    public void testFinalScoreWithNoScores() {
	        assertEquals(0, gradebook.finalScore(), 0.0001);
	    }

	    @Test
	    public void testFinalScoreWithOneScore() {
	    	gradebook.addScore(80);
	        assertEquals(80, gradebook.finalScore(), 0.0001);
	    }
	
}
