package sample;

import java.util.*;

public class Staff implements Iterable<Employee>{
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
    @Override
    public Iterator<Employee> iterator() {
        return staffList.iterator();
    }

    public void printStaffList(){
        sortStaffList();
        for (Employee emp : this){
            System.out.println(emp.toString());
        }
    }
}
