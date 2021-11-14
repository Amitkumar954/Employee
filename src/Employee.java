import java.util.Scanner;

class Employee {
    int salary;
    int hours;
    Employee(int sal,int hour){
        salary=sal;
        hours=hour;
    }
    int AddSal(int s)
    {
        if (s<500)
            s+=10;
        return(s);
    }
    int AddWork(int h,int salary){
        if (h>6)
            salary+=5;
        return (salary);
    }
}
class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int hour = sc.nextInt();
        Employee obj1 = new Employee(salary, hour);
        int a = obj1.AddSal(salary);
        int b = obj1.AddWork(hour,a);
        System.out.println(b);
    }
}

