package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Staff {
    private static List<Employee> staffList;

    static{
        staffList = new ArrayList<>();
    }

    public Staff() {}

    public static void addEmployee (Employee employee){
        staffList.add(employee);
    }
    public static void removeEmployee (int index){
        try {
            staffList.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("сотрудника с таким номером не существует");
        }
    }

    public void sortStaffList (){
        Comparator<Employee> comp= new EmployeeNameComparator().thenComparing(new EmployeeAgeComparator());
        staffList.sort(comp);
    }
    public void printStaffList(){
        sortStaffList();
        for (Employee emp : staffList){
            System.out.println(emp.toString());
        }
    }

}
