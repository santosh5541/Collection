package CustomeLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CustomeLinkedList {
    public static void main(String[] args) {
        Employee emp = new Employee(122,"Santosh","Balkot");
        Employee emp2 = new Employee(666,"Nabin","Kapan");
        Employee emp3 = new Employee(999,"Prakash", "Banehswor");

        LinkedList<Employee> list = new LinkedList<Employee>();
        list.add(emp);
        list.add(emp2);
        list.add(emp3);

        // traverse each element of an object
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()){
            Employee employee = it.next();
            System.out.println("EmployeeId: "+employee.eid+" EmployeeName: "+employee.name+" Employee Address: "+employee.address);
        }
    }

}
