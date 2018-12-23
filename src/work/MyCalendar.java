package work;
/*

 * MyCalendar

 * function

 * 1. isYoon(int year) : 년도를 입력하면 윤년인지 여부를 boolean 형태로 리턴

 * 2. drawCalendar(int year, int month) : 년도와 월을 입력하면 해당 년월 달력을 출력

 * 3. drawYearCalendar(int year) : 해당 년도의 달력을 전부 출력

 * 4. dayOfWeek(int year, int month, int day) : 입력 날짜가 어느 요일인지를 String으로 리턴

 * 5. ddi(int year) : 해당 년도가 어느 띠의 해인지 String으로 리턴

 * 6. nDayAfter(int year, int month, int day, int num) : 오늘 날짜로 부터 num 뒤의 날이 무슨 요일인지 String 으로 반환
 
 * 7. private totalDay(int year, int month, int day) : 내부적으로 날짜 계산용

 * */

public class MyCalendar {

 private int monthDay[]; //월별 일수

 private String days[];  //요일

 private String ddi[]; //띠

 public MyCalendar() {
  this.monthDay = new int[]{ 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  this.days = new String[]{ "일", "월", "화", "수", "목", "금", "토" };
  this.ddi = new String[] { "원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양" };
 }
 public static boolean isYoon(int year) { //매개변수만으로 결과값을 낼 수 있으므로 클래스 메서드로 선언
  return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
 }

 public void drawCalendar(int year, int month) {
  int total = totalDay(year, month);  
  total += 1;
  total %= 7;
  System.out.println("     " + year + "년" + month + "월 달력");
  System.out.println("   일    월    화   수    목    금   토");
  for (int i = 1; i <= monthDay[month-1]+total; i++) {
   if (i <= total) {
    System.out.print("   ");
   } else {
    System.out.printf("%3d", i - total);
   }
   if (i % 7 == 0) {
    System.out.println();
   }
  }
  System.out.println();
 }

 public void drawYearCalendar(int year) {
  for (int i = 1; i <= 12; i++) {
   drawCalendar(year, i);
  }
 }

 public String dayOfWeek(int year, int month, int day) {
  return days[totalDay(year, month, day) % 7];
 }

 public String ddi(int year) {
  return ddi[year % 7];
 }
 
 public String nDayAfter(int year, int month, int day, int num) { 
  return days[(totalDay(year, month, day) + num) % 7];
 }
 
 private int totalDay(int year, int month, int day) { //이 함수 하나로도 사용 가능, 오버로딩 안해도 괜찮음
   monthDay[1] = isYoon(year) ? 29 : 28; 
  int total = (365 * (year - 1)) + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);
  for (int i = 0; i < month - 1; i++) {
   total += monthDay[i];
  }
  total += day;
  return total;
 }

 private int totalDay(int year, int month) {
   monthDay[1] = isYoon(year) ? 29 : 28;
  int total = (365 * (year - 1)) + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);
  for (int i = 0; i < month - 1; i++) {
   total += monthDay[i];
  }
  return total;
 }

 

 public static void main(String[] args) {

  MyCalendar cal = new MyCalendar();

  System.out.println("1804년은 윤년이다 : "+MyCalendar.isYoon(1804));
  System.out.println("2019년은 "+cal.ddi(2019)+"띠");
  System.out.println("2018년 12월 14일의 요일은?"+cal.dayOfWeek(2018, 12, 14));
  System.out.println("2018년 12월 14일 부터 7일 뒤의 요일은?"+cal.nDayAfter(2018, 12, 14, 7));
  cal.drawCalendar(2018, 2);
  cal.drawYearCalendar(2017);

 }

} 

