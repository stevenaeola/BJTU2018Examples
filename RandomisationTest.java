
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class RandomisationTest
{
    private Randomisation randomis2;
    /**
     * Default constructor for test class RandomisationTest
     */
    public RandomisationTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
         randomis2 = new Randomisation();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void position() throws Exception
    {

        Position position1 = randomis2.getRandomPosition();
        assertTrue(position1.getX()>=0);
        assertTrue(position1.getX()<10);
        assertTrue(position1.getY()>=0);
        assertTrue(position1.getY()<10);
    }

    @Test
    public void positionInList() throws Exception
    {
        ArrayList positions = new ArrayList<Position>();
        positions.add(new Position(2,3));
        positions.add(new Position(1,1));
        positions.add(new Position(0,9));
        positions.add(new Position(5,6));

        Position position1 = randomis2.chooseFromList(positions);
        positions.contains(position1);
    }

    @Test(expected = InvalidPositionException.class)
    public void positionFails () throws Exception
    {
        Position p = new Position (1,11);
    }
}
