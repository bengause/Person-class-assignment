package pplpackage;

public class MyDate {

	private int year;
	private String month;
	private int day;
	
	public MyDate(){
		
	}
	
	public MyDate(int year, String month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(String month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
}
