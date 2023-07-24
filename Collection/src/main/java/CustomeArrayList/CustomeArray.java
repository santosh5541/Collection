package CustomeArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomeArray {
    public static void main(String[] args) {
        Student st1 =new Student(20,"santosh","new baneshwor");
        Student st2 = new Student(50,"Rojina karki","Biratnagar");
        Student st3 = new Student(63,"Nabin","Kapan");
       // passing object value inside an ArrayList
        ArrayList<Student> ei = new ArrayList<Student>();
        ei.add(st1);
        ei.add(st2);
        ei.add(st3);

        // to update a value of index 1

        Student updatevalue = new Student(90,"Manish","Balkot");
        ei.set(1,updatevalue);

        //displaying all object value using for each loop
        for(Student s : ei){
            System.out.println("Name:"+s.name+" RollNo:"+s.rollno+" Address:"+s.address);
        }



        // to remove object value from list
     //   ei.remove(st1);



    }


}
