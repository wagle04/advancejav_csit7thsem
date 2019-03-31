
package classes;
import java.util.*;

class account{
    
    double acc_no;
    double amount;
    
    Scanner scan=new Scanner(System.in);
    void input(){
        System.out.println("Enter account number: ");
        acc_no=scan.nextDouble();
        System.out.println("Enter amount: ");
        amount=scan.nextDouble();
    }
    void display(){
        System.out.println("Account number: "+this.acc_no);
        System.out.println("Amount: "+this.amount);
    }
    
    static account transfer(account a1,account a2,double transferamount){
        a1.amount-=transferamount;
        a2.amount+=transferamount;
        return a2;
    }
}

public class midterm_8 {
    public static void main(String args[]){
        account a1=new account();
        account a2=new account();
        a1.input();
        a2.input();
        a1.display();
        System.out.println();
        a2.display();
        System.out.println();
        a2=account.transfer(a1,a2,200);
        System.out.println("After transferring 200 from a1 to a2:");
        a1.display();
        a2.display();
    }
}
