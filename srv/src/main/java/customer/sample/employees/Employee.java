package customer.sample.employees;
 
import org.springframework.stereotype.Component;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
import javax.persistence.Entity;
 
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.ConstructorResult;
import javax.persistence.Id;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
 
import java.security.Timestamp;
import java.sql.Time;
import java.util.Date;
import javax.persistence.ColumnResult;
import lombok.Getter;
import lombok.Setter;
 
 
@JsonIgnoreProperties(ignoreUnknown = true)
@SqlResultSetMapping(name = "employee_mapping", classes =
@ConstructorResult(targetClass = Employee.class, columns = {
@ColumnResult(name = "id", type = Long.class),
@ColumnResult(name = "first_name", type = String.class),
@ColumnResult(name = "gender", type = String.class),
@ColumnResult(name = "mobile", type = String.class),
}))
 

@Entity
@Getter
@Setter
public class Employee {
    @Id
    private Long id;
    private String first_name;
    private String gender;
    private String mobile;

    public Employee(Long id, String first_name,String gender,String mobile)
    {
    this.id = id;
    this.first_name = first_name;
    this.gender = gender;
    this.mobile = mobile;
    }
}