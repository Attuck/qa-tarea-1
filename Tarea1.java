public class Tarea1{
  public static int FIRST_YEAR_CHECK = 1582;
  public static int FIRST_DAY_CHECK = 1;
  public static int DAYS_30 = 30;
  public static int DAYS_31 = 31;
  public static int[] DAYS_PER_MONTH = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
  //un cero al inicio para hacer concordar el indice con el numero del mes
  public static int JANUARY = 1;
  public static int FEBRUARY = 2;
  public static int MARCH = 3;
  public static int APRIL = 4;
  public static int MAY = 5;
  public static int JUNE = 6;
  public static int JULY = 7;
  public static int AUGUST = 8;
  public static int SEPTEMBER = 9;
  public static int OCTOBER = 10;
  public static int NOVEMBER = 11;
  public static int DECEMBER = 12;
  
  public static void main(String[] args){
  }
  
  /**
   * In a handwritten note in a collection of astronomical tables, 
   * Carl Friedrich Gauss described a method for calculating the day of the 
   * week for 1 January in any given year. He never published it. 
   * It was finally included in his collected works in 1927.
   * 
   */ 
  public static int dayOfWeekJan1st(int year){
    int dayOfWeek = (1 + 5 * ((year-1) % 4) + 4 * ((year-1) % 100) + 6 * ((year-1) % 400)) % 7;

    return dayOfWeek;
  }

  
  public static int dayOfWeek(final int month, final int dayOfMonth, final int year){
    int dayOfYear = dayOfYear(month, dayOfMonth,year);
    int dayOfWeek = (dayOfWeekJan1st(year) + (dayOfYear-1)) % 7;
    return dayOfWeek;
  }
  
  
  public static int dayOfYear(final int month, final int dayOfMonth, final int year){
    
    if(validDate(month, dayOfMonth, year)){
      int dayOfYear = dayOfMonth;
      for(int monthIndex = 1; monthIndex < month; monthIndex ++){ //recorre todos los meses antes del provisto
        if(monthIndex == FEBRUARY){
          if(isLeap(year)){
            dayOfYear += DAYS_PER_MONTH[FEBRUARY]+1; //un dia mas en bisiesto
          }else{
            dayOfYear += DAYS_PER_MONTH[FEBRUARY];
          }
        }else{
          dayOfYear += DAYS_PER_MONTH[monthIndex];
        }
      }
      return dayOfYear;
    }else{
      return -1;
    }
    
  }
  
  public static boolean isLeap(final int year){
    //un año es bisiesto si es divisible entre 400 ó si es divisible entre 4 pero no entre 100
    return (year % 400 == 0) || ( year % 4 == 0 && year % 100 != 0 );
  }
  
  public static boolean validDate(final int month, final int dayOfMonth, final int year){
    if(FIRST_YEAR_CHECK <= year &&  JANUARY <= month && month <=  DECEMBER && FIRST_DAY_CHECK <= dayOfMonth){
      if(month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month == OCTOBER || month == DECEMBER){
        return dayOfMonth <= DAYS_31; //revisa que el dia esté entre 1 y 31 para los meses que tienen 31 dias
      }else if(month == FEBRUARY){
        if(isLeap(year)){ //revisa que el dia esté entre 1 y 28 o 29 para Febrero dependiendo de si el año es bisiesto
          return dayOfMonth <= DAYS_PER_MONTH[FEBRUARY]+1;
        }else{          
          return dayOfMonth <= DAYS_PER_MONTH[FEBRUARY];
        }
      }else{
        return dayOfMonth <= DAYS_30;  //revisa que el dia esté entre 1 y 30 para los meses que tienen 30 dias
      }
    }
    return false;
  }
}