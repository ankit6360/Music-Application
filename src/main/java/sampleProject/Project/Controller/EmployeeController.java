import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")

public  Class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //Get method
        @GetMapping
public List<Employee> getAllEmployees(){
            return employeeService.getAllEmployees();
        }
@GetMapping("/{id}")
public List<Employee> getAllEmployees(@PathVariable long id){
        return employeeService.getAllEmployeeById();
        }

        //Post method
        @PostMapping
public employee createEmployee (@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        }

        }