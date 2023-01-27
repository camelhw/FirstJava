package exercise.basic.banking1;

public class Bank {
	private Customer[] customers;
    private int numberOfCustomers;
    
    public Bank() {
    	customers = new Customer[10];
    }
    
    public Customer[] getCustomers() {
    	return this.customers;
    }
    
    public int getNumberOfCustomers() {  //실제 고객수 리턴 
    	return this.numberOfCustomers; 
    }
    
    public void addCustomer(Customer customer){
    	if(numberOfCustomers>=10) {
    		System.out.println("고객을 더 이상 등록 할 수 없습니다.");
    	}else {
    		customers[numberOfCustomers++] = customer;
    	}
    }
}
