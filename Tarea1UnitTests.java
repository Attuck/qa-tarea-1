import org.junit.Test;
import static org.junit.Assert.*;

public class Tarea1UnitTests {

 @Test
 public void testDayOfWeek() {
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

 @Test
 public void testIsLeap() {
   assertFalse (Tarea1.isLeap(1883));
   assertFalse (Tarea1.isLeap(2007));
   assertTrue (Tarea1.isLeap(2000));
   assertTrue (Tarea1.isLeap(1600));
   assertTrue (Tarea1.isLeap(2004));
   assertTrue (Tarea1.isLeap(1996));
   assertFalse (Tarea1.isLeap(1800));
   assertFalse (Tarea1.isLeap(2100));
   assertFalse (Tarea1.isLeap(1581));
   assertFalse (Tarea1.isLeap(1583));
 }


 @Test
 public void testValidDate(){
       assertTrue (Tarea1.validDate(1,1,2004));
   assertTrue (Tarea1.validDate(2,1,2004));
   assertTrue (Tarea1.validDate(3,1,2004));
   assertTrue (Tarea1.validDate(4,1,2004));
   assertTrue (Tarea1.validDate(5,1,2004));
   assertTrue (Tarea1.validDate(6,1,2004));
   assertTrue (Tarea1.validDate(7,1,2004));
   assertTrue (Tarea1.validDate(8,1,2004));
   assertTrue (Tarea1.validDate(9,1,2004));
   assertTrue (Tarea1.validDate(10,1,2004));
   assertTrue (Tarea1.validDate(11,1,2004));
   assertTrue (Tarea1.validDate(12,1,2004));
   assertTrue (Tarea1.validDate(1,1,2001));
   assertTrue (Tarea1.validDate(2,1,2001));
   assertTrue (Tarea1.validDate(3,1,2001));
   assertTrue (Tarea1.validDate(4,1,2001));
   assertTrue (Tarea1.validDate(5,1,2001));
   assertTrue (Tarea1.validDate(6,1,2001));
   assertTrue (Tarea1.validDate(7,1,2001));
   assertTrue (Tarea1.validDate(8,1,2001));
   assertTrue (Tarea1.validDate(9,1,2001));
   assertTrue (Tarea1.validDate(10,1,2001));
   assertTrue (Tarea1.validDate(11,1,2001));
   assertTrue (Tarea1.validDate(12,1,2001));
   assertTrue (Tarea1.validDate(1,31,2004));
   assertTrue (Tarea1.validDate(2,29,2004));
   assertTrue (Tarea1.validDate(3,31,2004));
   assertTrue (Tarea1.validDate(4,30,2004));
   assertTrue (Tarea1.validDate(5,31,2004));
   assertTrue (Tarea1.validDate(6,30,2004));
   assertTrue (Tarea1.validDate(7,31,2004));
   assertTrue (Tarea1.validDate(8,31,2004));
   assertTrue (Tarea1.validDate(9,30,2004));
   assertTrue (Tarea1.validDate(10,31,2004));
   assertTrue (Tarea1.validDate(11,30,2004));
   assertTrue (Tarea1.validDate(12,31,2004));
   assertTrue (Tarea1.validDate(1,31,2001));
   assertTrue (Tarea1.validDate(2,28,2001));
   assertTrue (Tarea1.validDate(3,31,2001));
   assertTrue (Tarea1.validDate(4,30,2001));
   assertTrue (Tarea1.validDate(5,31,2001));
   assertTrue (Tarea1.validDate(6,30,2001));
   assertTrue (Tarea1.validDate(7,31,2001));
   assertTrue (Tarea1.validDate(8,31,2001));
   assertTrue (Tarea1.validDate(9,30,2001));
   assertTrue (Tarea1.validDate(10,31,2001));
   assertTrue (Tarea1.validDate(11,30,2001));
   assertTrue (Tarea1.validDate(12,31,2001));
 }

  @Test
  public void testNextDay() {
    // Enero [31]
    assertEquals (Tarea1.nextDay(1, 1, 2017),"1/2/2017");
    assertEquals (Tarea1.nextDay(1, 30, 2017),  "1/31/2017");
    assertEquals (Tarea1.nextDay(1, 31, 2017), "2/1/2017");
    assertEquals (Tarea1.nextDay(1, 32, 2017), null);
   // Febrero [28-29]
    assertEquals (Tarea1.nextDay(2, 1, 2017),"2/2/2017");
    assertEquals (Tarea1.nextDay(2, 28, 2017),"3/1/2017");
    assertEquals (Tarea1.nextDay(2, 28, 2016),"2/29/2016");
    assertEquals (Tarea1.nextDay(2, 29, 2016),"3/1/2016");
    assertEquals (Tarea1.nextDay(2, 29, 2017), null);
    // Marzo [31]
    assertEquals (Tarea1.nextDay(3, 1, 2017),"3/2/2017");
    assertEquals (Tarea1.nextDay(3, 30, 2017),  "3/31/2017");
    assertEquals (Tarea1.nextDay(3, 31, 2017), "4/1/2017");
    assertEquals (Tarea1.nextDay(3, 32, 2017), null);
    // Abril [30]
    assertEquals (Tarea1.nextDay(4, 1, 2017),"4/2/2017");
    assertEquals (Tarea1.nextDay(4, 29, 2017), "4/30/2017");
    assertEquals (Tarea1.nextDay(4, 30, 2017),  "5/1/2017");
    assertEquals (Tarea1.nextDay(4, 31, 2017), null);
    // Mayo [31]
    assertEquals (Tarea1.nextDay(5, 1, 2017),"5/2/2017");
    assertEquals (Tarea1.nextDay(5, 29, 2017), "5/30/2017");
    assertEquals (Tarea1.nextDay(5, 30, 2017),  "5/31/2017");
    assertEquals (Tarea1.nextDay(5, 31, 2017), "6/1/2017");
    assertEquals (Tarea1.nextDay(5, 32, 2017), null);
    // Junio  [30]
    assertEquals (Tarea1.nextDay(6, 1, 2017),"6/2/2017");
    assertEquals (Tarea1.nextDay(6, 29, 2017), "6/30/2017");
    assertEquals (Tarea1.nextDay(6, 30, 2017),  "7/1/2017");
    assertEquals (Tarea1.nextDay(6, 31, 2017), null);
    // Julio [31]
    assertEquals (Tarea1.nextDay(7, 1, 2017),"7/2/2017");
    assertEquals (Tarea1.nextDay(7, 29, 2017), "7/30/2017");
    assertEquals (Tarea1.nextDay(7, 30, 2017),  "7/31/2017");
    assertEquals (Tarea1.nextDay(7, 31, 2017), "8/1/2017");
    assertEquals (Tarea1.nextDay(7, 32, 2017), null);
    // Agosto [31]
    assertEquals (Tarea1.nextDay(8, 1, 2017),"8/2/2017");
    assertEquals (Tarea1.nextDay(8, 29, 2017), "8/30/2017");
    assertEquals (Tarea1.nextDay(8, 30, 2017),  "8/31/2017");
    assertEquals (Tarea1.nextDay(8, 31, 2017), "9/1/2017");
    assertEquals (Tarea1.nextDay(8, 32, 2017), null);
    // Setiembre [30]
    assertEquals (Tarea1.nextDay(9, 1, 2017),"9/2/2017");
    assertEquals (Tarea1.nextDay(9, 29, 2017), "9/30/2017");
    assertEquals (Tarea1.nextDay(9, 30, 2017),  "10/1/2017");
    assertEquals (Tarea1.nextDay(9, 31, 2017), null);
    // Octubre [31]
    assertEquals (Tarea1.nextDay(10, 1, 2017),"10/2/2017");
    assertEquals (Tarea1.nextDay(10, 29, 2017), "10/30/2017");
    assertEquals (Tarea1.nextDay(10, 30, 2017),  "10/31/2017");
    assertEquals (Tarea1.nextDay(10, 31, 2017), "11/1/2017");
    assertEquals (Tarea1.nextDay(10, 32, 2017), null);
    // Noviembre [30]
    assertEquals (Tarea1.nextDay(11, 1, 2017),"11/2/2017");
    assertEquals (Tarea1.nextDay(11, 29, 2017), "11/30/2017");
    assertEquals (Tarea1.nextDay(11, 30, 2017),  "12/1/2017");
    assertEquals (Tarea1.nextDay(11, 31, 2017), null);
    // Diciembre [31]
    assertEquals (Tarea1.nextDay(12, 1, 2017),"12/2/2017");
    assertEquals (Tarea1.nextDay(12, 29, 2017), "12/30/2017");
    assertEquals (Tarea1.nextDay(12, 30, 2017),  "12/31/2017");
    assertEquals (Tarea1.nextDay(12, 31, 2017), "1/1/2018");
    assertEquals (Tarea1.nextDay(12, 32, 2017), null);
  }





}
