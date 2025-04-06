package Structural.Proxy;

public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create() {
        System.out.println("Logging: Employee creation started.");
        employeeDao.create();
        System.out.println("Logging: Employee creation finished.");

        // Additional logic can be added here, such as security checks or caching
    }

}
