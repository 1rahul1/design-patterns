
package Structural.Facade;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void insert() {
        System.out.println("Employee created successfully.");
    }

    @Override
    public void delete() {
        System.out.println("Employee deleted successfully.");
    }

    @Override
    public void updateByID() {
        System.out.println("Employee updated successfully.");
    }

}
