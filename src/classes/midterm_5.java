
package classes;

class list_of_nums{
    int list[]=new int[10];
    
    list_of_nums(int list[]){
        this.list=list;
    }
    
    int getmax(){
        int maxnum=list[0];
        for(int i=0;i<list.length;i++){
            if (maxnum<list[i]){
                maxnum=list[i];
            }
        }
        return maxnum;
    }
    
    int getmin(){
        int minnum=list[0];
        for(int i=0;i<list.length;i++){
            if (minnum>list[i]){
                minnum=list[i];
            }
        }
        return minnum;
    }
    
    
}

public class midterm_5 {
    public static void main(String args[]){
        int numlist[]={12,52,77,14,03,85,99,102,412,10};
        list_of_nums l1=new list_of_nums(numlist);
        System.out.println("Max number is: "+l1.getmax());
        System.out.println("Min number is: "+l1.getmin());
    }
}
