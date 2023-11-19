package customer.sample.employees;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public Collection<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

}