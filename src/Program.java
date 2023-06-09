import sample.FixedSalaryEmployee;
import sample.HourlyEmployee;
import sample.Staff;

public class Program {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Staff.addEmployee(new FixedSalaryEmployee("Иванов","Иван", "Иванович", 35, 50000));
        Staff.addEmployee(new FixedSalaryEmployee("Петров","Иван", "Васильевич", 35, 50000));
        Staff.addEmployee(new FixedSalaryEmployee("Иванов","Петр", "Иванович", 45, 60000));
        Staff.addEmployee(new HourlyEmployee("Иванова","Аглая", "Петровна", 50, 1000));
        Staff.addEmployee(new HourlyEmployee("Мороз","Дарья", "Сергеевна", 25, 500));
        Staff.addEmployee(new HourlyEmployee("Кузьмина","Елена", "Степановна", 30, 600));

        staff.printStaffList();

    }
}
