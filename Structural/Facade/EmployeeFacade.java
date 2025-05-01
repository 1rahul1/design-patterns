package Structural.Facade;

public class EmployeeFacade {
    private EmployeeDao employeeDao;

    public EmployeeFacade() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    public void insert() {
        employeeDao.insert();
    }
}
