
package classes;

class employee{
    String name;
    int age;
    String address;
    double salary;
    String position;
    
    employee(String name,int age,String address,double salary,String position){
        this.name=name;
        this.age=age;
        this.address=address;
        this.salary=salary;
        this.position=position;
    }
    
    void display(){
        System.out.println();
        System.out.println("Name of employee: "+this.name);
        System.out.println("Age of employee: "+this.age);
        System.out.println("Address of employee: "+this.address);
        System.out.println("Salary of employee: "+this.salary);
        System.out.println("Position of employee: "+this.position);
    }
    
}

public class midterm_10 {
    public static void main(String args[]){
        employee e1=new employee("Ram",21,"Ktm",20000,"Manager");
        employee e2=new employee("Hari",19,"Bkt",10000,"Intern");
        e1.display();
        e2.display();
    }
}
