public class Tarea1{
  
  public static int FIRST_YEAR_CHECK = 1582;
  public static int FIRST_DAY_CHECK = 1;
  public static int 30_DAYS = 30;
  public static int 31_DAYS = 31;
  public static int 28_DAYS = 28;
  public static int[] DAYS_PER_MONTH = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
  //un cero al inicio para hacer concordar el indice con el numero del mes
  private enum MONTHS {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
  }
  
  /**
   * In a handwritten note in a collection of astronomical tables, 
   * Carl Friedrich Gauss described a method for calculating the day of the 
   * week for 1 January in any given year. He never published it. 
   * It was finally included in his collected works in 1927.
   * 
   */ 
  public static int dayOfWeekJan1st(int year){
    int dayOfWeek = (year*365 + ((year-1) % 4) - ((year-1) % 100) + ((year-1) % 400)) % 7;
    return dayOfWeek;
  }
  
   
  public static int dayOfWeek(final int month, final int dayOfMonth, final int year){
    int dayOfYear = this.dayOfYear(month, dayOfMonth,year);
    int dayOfWeek = (this.dayOfWeekJan1st(year) + dayOfYear) % 6;
    return dayOfWeek;
  }
  
  public static int dayOfYear(final int month, final int dayOfMonth, final int year){
    if(validDate(month, dayOfMonth, year)){
      int dayOfYear = dayOfMonth;
      for(int monthIndex = 1; monthIndex <month; monthIndex ++){ //recorre todos los meses antes del provisto
        if(i == MONTHS.FEBRUARY){
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
    if(FIRST_YEAR_CHECK <= year &&  MONTHS.JANUARY <= month && month <=  MONTHS.DEC && FIRST_DAY_CHECK <= dayOfMonth){
      if(month == MONTHS.JANUARY || month == MONTHS.MARCH || month == MONTHS.MAY || month == MONTHS.JULY || month == MONTHS.AUGUST || month == MONTHS.OCTOBER || month == MONTHS.DECEMBER){
        return dayOfMonth <= 31_DAYS; //revisa que el dia esté entre 1 y 31 para los meses que tienen 31 dias
      }else if(month == MONTHS.FEBRUARY){
        if(isLeap(year)){ //revisa que el dia esté entre 1 y 28 o 29 para Febrero dependiendo de si el año es bisiesto
          return dayOfMonth <= DAYS_PER_MONTH[MONTHS.FEBRUARY]+1;
        }else{          
          return dayOfMonth <= DAYS_PER_MONTH[MONTHS.FEBRUARY];
        }
      }else{
        return dayOfMonth <= 30_DAYS;  //revisa que el dia esté entre 1 y 30 para los meses que tienen 30 dias
      }
    }
    return false;
  }