import org.junit.Test;
import static org.junit.Assert.*;

public class Tarea1UnitTests {
  
  @Test
  public void pruebaDayOfWeek() {
    assertEquals (Tarea1.dayOfWeek(1,1,2004),4);
    assertEquals (Tarea1.dayOfWeek(2,1,2004),0);
    assertEquals (Tarea1.dayOfWeek(3,1,2004),1);
    assertEquals (Tarea1.dayOfWeek(4,1,2004),4);
    assertEquals (Tarea1.dayOfWeek(5,1,2004),6);
    assertEquals (Tarea1.dayOfWeek(6,1,2004),2);
    assertEquals (Tarea1.dayOfWeek(7,1,2004),4);
    assertEquals (Tarea1.dayOfWeek(8,1,2004),0);
    assertEquals (Tarea1.dayOfWeek(9,1,2004),3);
    assertEquals (Tarea1.dayOfWeek(10,1,2004),5);
    assertEquals (Tarea1.dayOfWeek(11,1,2004),1);
    assertEquals (Tarea1.dayOfWeek(12,1,2004),3);
    assertEquals (Tarea1.dayOfWeek(1,1,2001),1);
    assertEquals (Tarea1.dayOfWeek(2,1,2001),4);
    assertEquals (Tarea1.dayOfWeek(3,1,2001),4);
    assertEquals (Tarea1.dayOfWeek(4,1,2001),0);
    assertEquals (Tarea1.dayOfWeek(5,1,2001),2);
    assertEquals (Tarea1.dayOfWeek(6,1,2001),5);
    assertEquals (Tarea1.dayOfWeek(7,1,2001),0);
    assertEquals (Tarea1.dayOfWeek(8,1,2001),3);
    assertEquals (Tarea1.dayOfWeek(9,1,2001),6);
    assertEquals (Tarea1.dayOfWeek(10,1,2001),1);
    assertEquals (Tarea1.dayOfWeek(11,1,2001),4);
    assertEquals (Tarea1.dayOfWeek(12,1,2001),6);
    assertEquals (Tarea1.dayOfWeek(1,31,2004),6);
    assertEquals (Tarea1.dayOfWeek(2,29,2004),0);
    assertEquals (Tarea1.dayOfWeek(3,31,2004),3);
    assertEquals (Tarea1.dayOfWeek(4,30,2004),5);
    assertEquals (Tarea1.dayOfWeek(5,31,2004),1);
    assertEquals (Tarea1.dayOfWeek(6,30,2004),3);
    assertEquals (Tarea1.dayOfWeek(7,31,2004),6);
    assertEquals (Tarea1.dayOfWeek(8,31,2004),2);
    assertEquals (Tarea1.dayOfWeek(9,30,2004),4);
    assertEquals (Tarea1.dayOfWeek(10,31,2004),0);
    assertEquals (Tarea1.dayOfWeek(11,30,2004),2);
    assertEquals (Tarea1.dayOfWeek(12,31,2004),5);
    assertEquals (Tarea1.dayOfWeek(1,31,2001),3);
    assertEquals (Tarea1.dayOfWeek(2,28,2001),3);
    assertEquals (Tarea1.dayOfWeek(3,31,2001),6);
    assertEquals (Tarea1.dayOfWeek(4,30,2001),1);
    assertEquals (Tarea1.dayOfWeek(5,31,2001),4);
    assertEquals (Tarea1.dayOfWeek(6,30,2001),6);
    assertEquals (Tarea1.dayOfWeek(7,31,2001),2);
    assertEquals (Tarea1.dayOfWeek(8,31,2001),5);
    assertEquals (Tarea1.dayOfWeek(9,30,2001),0);
    assertEquals (Tarea1.dayOfWeek(10,31,2001),3);
    assertEquals (Tarea1.dayOfWeek(11,30,2001),5);
    assertEquals (Tarea1.dayOfWeek(12,31,2001),1);
  }
}