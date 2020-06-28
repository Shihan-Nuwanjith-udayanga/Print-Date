import java.util.*;
class Date{
	private int year;
	private int month;
	private int day;
	
	public void setMonth(int month){
		if(month<=12 && month>=1){
			this.month=month;
		}
	}
	public void setYear(int year){
		if(year>=1){
			this.year=year;
		}
	}
	public void setDay(int day){
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:if(day<31 && day>=1){
				this.day=day;
			}break;
			case 2:if(day<=29 && day>=1){
				this.day=day;
			}break;
		}
	}
	
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	
	public void setDate(int y, int m, int d){
		year=y;
		month=m;
		day=d;
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
}
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input a Year : ");
		int year=input.nextInt();
		System.out.print("Input a Month : ");
		int month=input.nextInt();
		System.out.print("Input a Day : ");
		int day=input.nextInt();
		
		Date d1=new Date();
		d1.setYear(year);
		d1.setMonth(month);
		d1.setDay(day);
		d1.printDate();
	}
}
