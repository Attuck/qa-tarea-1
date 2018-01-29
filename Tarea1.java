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
  public static int DAYS_OF_WEEK = 7;

  public static void main(String[] args){
    System.out.println("Iniciando programa");
    System.out.println(nextDay(2, 28, 2016));
    System.out.println(dayOfWeek(2, 28, 2016));
    System.out.println(dayOfYear(2, 28, 2016));
    System.out.println(validDate(2, 28, 2016));
    System.out.println(isLeap(2016));
    
  }

  
  /**
   * Método de Carl Friedrich Gauss basado en sus estudios de movimientos estelares
   * para encontrar el día de la semana del 1 de enero de cualquier año.
   *
   * @return un número del 0 al 6 donde el 0 es domingo y el 6 es sábado y así los demás días
   */
  public static int dayOfWeekJan1st(int year){
    int dayOfWeek = (1 + 5 * ((year-1) % 4) + 4 * ((year-1) % 100) + 6 * ((year-1) % 400)) % DAYS_OF_WEEK;
    return dayOfWeek;
  }
  
  /**
   * 
   * @return un número del 0 al 6 donde el 0 es domingo y el 6 es sábado y así los demás días
   */
  public static int dayOfWeek(final int month, final int dayOfMonth, final int year){
    int dayOfYear = dayOfYear(month, dayOfMonth,year);
    int dayOfWeek = (dayOfWeekJan1st(year) + (dayOfYear-1)) % DAYS_OF_WEEK; //con el día de la semana del 1 de enero, se encuentra cualquiera sumando el día del año y haciendo módulo con 7(días de la semana)
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

  /**
  * R3 (dia siguiente): Dada una fecha válida, determinar la fecha del día siguiente.
  *
  * @return Se retorna un String con el siguiente formato: dd/mm/yyyy
  */
 public static String nextDay(final int month, final int dayOfMonth, final int year){
  if(validDate(month, dayOfMonth, year)){
   int daysPerMonth = DAYS_PER_MONTH[month];
   int nextDay = 0, nextMonth = month, nextYear = year;
   if (isLeap(year) && month == FEBRUARY) 
     daysPerMonth += 1; //29 días en febrero bisiesto
   if (dayOfMonth < daysPerMonth) {
    nextDay = dayOfMonth+1;
   } else {
    nextDay = 1;
    if  (month == DECEMBER) {
     nextMonth = JANUARY;
     nextYear = year+1;
    } else {
     nextMonth = month+1;
    }
   }
   return "" + nextMonth + "/" +  nextDay+ "/" + nextYear;

  }else{
   return null;
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
