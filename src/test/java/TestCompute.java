import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void testSize(){
    MessageQueue mq=mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c=new Compute(mq);
    assertEquals(-1,c.countNumberOfOccurrences(""));
  }
  @Test
  public void testContains(){
    MessageQueue mq=mock(MessageQueue.class);
    when(mq.size()).thenReturn(1);
    when(mq.contains("a")).thenReturn(false);
    c=new Compute(mq);
    assertEquals(0,c.countNumberOfOccurrences("a"));
  }
  @Test
  public void testCounter(){
    MessageQueue mq=mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("abc")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("abc");
    when(mq.getAt(1)).thenReturn("bbb");
    when(mq.getAt(2)).thenReturn("abc");
    c=new Compute(mq);
    assertEquals(2,c.countNumberOfOccurrences("abc"));
  }
}