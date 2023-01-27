package exercise.basic.banking1;

import newch.Account;

public class BankingTest {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Customer hong = new Customer("111-111", "홍길동");
		hong.addAccount(new Account("청약저축", 10000));
		hong.addAccount(new Account("종합적금", 20000));
		hong.addAccount(new Account("1억만들기펀드", 30000));
		hong.addAccount(new Account("1억만들기펀드1", 30000));
		hong.addAccount(new Account("1억만들기펀드2", 30000));
		bank.addCustomer(hong);

		Customer ja = new Customer("111-111", "홍길자");
		ja.addAccount(new Account("입출금통장", 10000));
		ja.addAccount(new Account("CMA", 20000));
		bank.addCustomer(ja);

		Customer[] customers = bank.getCustomers();
		for (int j = 0; j < bank.getNumberOfCustomers(); j++) {
			System.out.println("-----------------------------------------");
			System.out.printf("주민등록번호: %7s, 성명:%3s, 보유계좌수:%d\n", customers[j].getSsn(), customers[j].getName(),
					customers[j].getNumberOfAccounts());
			// System.out.printf("주민등록번호: %3$7s, 성명:%1$3s, 보유계좌수:%2$d\n", hong.getName(),
			// hong.getNumberOfAccounts(), hong.getSsn());
			System.out.println("-----------------------------------------");
			Account[] accounts = customers[j].getAccounts();
			int total = 0;
			for (int i = 0; i < customers[j].getNumberOfAccounts(); i++) {
				total += accounts[i].getBalance();
				System.out.printf("%d. 계좌명:%s, 잔액:%d원\n", i + 1, accounts[i].getAccountName(),
						accounts[i].getBalance());
			}
			System.out.println("-----------------------------------------");
			System.out.printf("전체 총잔액 : %d원\n", total);
			System.out.println("-----------------------------------------");
			System.out.println("\n\n");
		}

	}
}
