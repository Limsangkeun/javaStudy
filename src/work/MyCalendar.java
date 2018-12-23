package work;
/*

 * MyCalendar

 * function

 * 1. isYoon(int year) : �⵵�� �Է��ϸ� �������� ���θ� boolean ���·� ����

 * 2. drawCalendar(int year, int month) : �⵵�� ���� �Է��ϸ� �ش� ��� �޷��� ���

 * 3. drawYearCalendar(int year) : �ش� �⵵�� �޷��� ���� ���

 * 4. dayOfWeek(int year, int month, int day) : �Է� ��¥�� ��� ���������� String���� ����

 * 5. ddi(int year) : �ش� �⵵�� ��� ���� ������ String���� ����

 * 6. nDayAfter(int year, int month, int day, int num) : ���� ��¥�� ���� num ���� ���� ���� �������� String ���� ��ȯ
 
 * 7. private totalDay(int year, int month, int day) : ���������� ��¥ ����

 * */

public class MyCalendar {

 private int monthDay[]; //���� �ϼ�

 private String days[];  //����

 private String ddi[]; //��

 public MyCalendar() {
  this.monthDay = new int[]{ 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  this.days = new String[]{ "��", "��", "ȭ", "��", "��", "��", "��" };
  this.ddi = new String[] { "������", "��", "��", "����", "��", "��", "��", "�䳢", "��", "��", "��", "��" };
 }
 public static boolean isYoon(int year) { //�Ű����������� ������� �� �� �����Ƿ� Ŭ���� �޼���� ����
  return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
 }

 public void drawCalendar(int year, int month) {
  int total = totalDay(year, month);  
  total += 1;
  total %= 7;
  System.out.println("     " + year + "��" + month + "�� �޷�");
  System.out.println("   ��    ��    ȭ   ��    ��    ��   ��");
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
 
 private int totalDay(int year, int month, int day) { //�� �Լ� �ϳ��ε� ��� ����, �����ε� ���ص� ������
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

  System.out.println("1804���� �����̴� : "+MyCalendar.isYoon(1804));
  System.out.println("2019���� "+cal.ddi(2019)+"��");
  System.out.println("2018�� 12�� 14���� ������?"+cal.dayOfWeek(2018, 12, 14));
  System.out.println("2018�� 12�� 14�� ���� 7�� ���� ������?"+cal.nDayAfter(2018, 12, 14, 7));
  cal.drawCalendar(2018, 2);
  cal.drawYearCalendar(2017);

 }

} 

