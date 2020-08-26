/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;
import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
/**
 *
 * @author sarun
 */
public class BankFacade {
    /**
     * @param args the command line arguments
     */
    static private CustomerIf CusAcc1;
    static private CustomerIf CusAcc2;
    
    public static void main(String[] args) {
       BankFacade AC = new BankFacade();
       //AC.doDeposit(500,CusAcc1,67890);
       //.doDeposit(1000,CusAcc2,98765);
       //AC.doDeposit(1500,CusAcc2,43210);
       
       //AC.getBankAccount(CusAcc1,12345);
       //AC.getBankAccount(CusAcc1,67890);
       //AC.getBankAccount(CusAcc2,98765);
       //AC.getBankAccount(CusAcc2,43210);
       
       AC.getBanCustomer("A guy");
       //AC.getBanCustomer("B guy");
    }
    
    public BankFacade() {
        ArrayList<AccountIf> cust1Accounts = new ArrayList();//cus1
        CusAcc1 = new BankCustomer("A guy", cust1Accounts);
        cust1Accounts.add(new BankAccount(12345));
        cust1Accounts.add(new BankAccount(67890));
        ArrayList<AccountIf> cust2Accounts = new ArrayList();//cus2
        CusAcc2 = new BankCustomer("B guy", cust2Accounts);
        cust2Accounts.add(new BankAccount(98765));
        cust2Accounts.add(new BankAccount(43210));
}
    
    public void doDeposit(double amt, CustomerIf cust, int accNo) {
        cust.getAccount(accNo).deposit(amt);
    }
    
    public void getBankAccount(CustomerIf cust, int accNo) {
        AccountIf acc = cust.getAccount(accNo);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    }
    
    public void getBanCustomer(String custName) {
    if (CusAcc1.getCustomerName().equals(custName)) {
        ArrayList<AccountIf> accounts = CusAcc1.getllAccounts();
        System.out.println("Customer and account information");
        System.out.println("Name = " + CusAcc1.getCustomerName());
        System.out.println("Has " + CusAcc1.getNumAccounts() + " accounts");
        for(AccountIf account : accounts) {
            System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
        }
    } else if (CusAcc2.getCustomerName().equals(custName)) {
        ArrayList<AccountIf> accounts = CusAcc2.getllAccounts();
        System.out.println("Customer and account information");
        System.out.println("Name = " + CusAcc2.getCustomerName());
        System.out.println("Has " + CusAcc2.getNumAccounts() + " accounts");
        for(AccountIf account : accounts) {
            System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
        }
    }
    
    }
}