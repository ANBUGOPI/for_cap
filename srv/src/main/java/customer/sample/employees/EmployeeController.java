package customer.sample.employees;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(value = "/Employees")
public class EmployeeController {
    @Autowired
    EmployeeService EmployeeService;
 
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<?> getCompaniesSelect() {
        return new ResponseEntity<>(EmployeeService.getAllEmployees(), HttpStatus.OK);
    }
 
}