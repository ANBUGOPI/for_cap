package customer.sample.employees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
// @Repository
@Transactional
public class EmployeeDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Collection<Employee> getAllEmployees() {
        try {
            List<Employee> results = new ArrayList<Employee>();
            if (entityManager != null) {
                StoredProcedureQuery spEmployees = entityManager
                        .createStoredProcedureQuery("GET_ALL_EMPLOYEES", "employee_mapping");
                spEmployees.execute();
                @SuppressWarnings("unchecked")
                List<Employee> tempResults = spEmployees.getResultList();
                results.addAll(tempResults);
            }

            return results;
        } catch (Exception exception) {
            throw exception;
        }
    }
}