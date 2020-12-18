import org.junit.Test;
import static org.junit.Assert.*; 

public class MainTest {
  @Test public void testNothing(){}
 
  @Test public void testSomething(){
    assertEquals("This Number is not equal", 5, 2+3);

    String test = new String();
    assertNotNull("This is", test);
    
    assertTrue("Argument is not valid!", (3*7)>(4*5));
  } 
}