package exercise.basic.banking1;

import newch.Account;

public class Customer {
	   private String ssn;
	   private String  name; 
	   private Account[] accounts ;
	   private int numberOfAccounts;  //실제 고객의 계좌 개수
	   
	   public Customer(String ssn,String  name ) {
		   this.ssn = ssn;
		   this.name = name;
		   this.accounts = new Account[5]; //고객당 5개의 계좌까지 개설 가능	   
	   }
	   
	   public String getSsn() {
		   return this.ssn;
	   }
	   public void setSsn(String ssn) {
		   this.ssn = ssn;
	   }
	   public String getName() {
		   return this.name;
	   }
	   public void setName(String name) {
		   this.name = name;
	   }
	   public Account[] getAccounts() {
		   return this.accounts;
	   }
	   public int getNumberOfAccounts() { //실제 고객의 계좌 개수 리턴
		   return this.numberOfAccounts;
	   }
	   public void addAccount(Account account ) { //고객이 계좌를 개설할때마다 Account 배열에 추가
		   if(numberOfAccounts>=5) {
			   System.out.println("계좌를 더 이상 개설할 수 없습니다.!!");
		   }else {
		    this.accounts[numberOfAccounts++]= account;
		    //numberOfAccounts++
	   }
	   
	   }
	 
	}
