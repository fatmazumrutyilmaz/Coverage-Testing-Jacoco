import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TestUtil {
  Util c;

  @Rule
  public ExpectedException exception=ExpectedException.none();

  @Before
  public void setUp() { 
    c = new Util(); 
  }

  @Test
  public void example() { 
    assertTrue(true); 
  }
  @Test
  public void testLength1(){
    assertFalse(c.compute(1));
  }
  @Test
  public void testLength2(){
    assertFalse(c.compute(1,2));
  }
  @Test
  public void testThrowsRuntimeException(){
    exception.expect(RuntimeException.class);
    c.compute(1,2,4,5,0);
  }
  @Test
  public void testSumMod(){
    assertTrue(c.compute(2,3,4));
  }
  @Test
  public void testSumNotMod(){
    assertFalse(c.compute(2,5,10));
  }

}