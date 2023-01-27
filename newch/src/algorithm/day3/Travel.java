package algorithm.day3;

import java.util.Scanner;

public class Travel{
	private String travelCode;
	private String cityName;
	private String flight;
	private String Traveltype;
	private int maxPeople;
	private int reserved;
	
	public void list() {
	System.out.println("=======<메뉴>=======");
	System.out.println("1.전체 여행 상품조회");
	System.out.println("2.개별 자유여행 상품 조회");
	System.out.println("3.패키지 여행 상품조회");
	System.out.println("4.여행 상품 예약");
	System.out.println("9.종료");
	Scanner sc = new Scanner(System.in);
	
	}
	
	
	
public void Travle(String code,String city,String flight,String type,String Maximum,String reservation) {
this.travelCode=travelCode;
this.cityName=cityName;
this.flight=flight;
this.Traveltype=Traveltype;
this.maxPeople=maxPeople;
this.reserved=reserved;
}



public void getTravelCode() {
}

public void setTravelCode(String travelCode) {
	this.travelCode = travelCode;
}



public String getCityName() {
	return cityName;
}



public void setCityName(String cityName) {
	this.cityName = cityName;
}



public String getFlight() {
	return flight;
}



public void setFlight(String flight) {
	this.flight = flight;
}



public String getTraveltype() {
	return Traveltype;
}



public void setTraveltype(String traveltype) {
	Traveltype = traveltype;
}



public int getMaxPeople() {
	return maxPeople;
}



public void setMaxPeople(int maxPeople) {
	this.maxPeople = maxPeople;
}



public int getReserved() {
	return reserved;
}



public void setReserved(int reserved) {
	this.reserved = reserved;
}
