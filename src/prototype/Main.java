package prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setFirstName("Micheal");
        employee.setLastName("Jordan");
        List<Address>addresses=new ArrayList<>(Arrays.asList(
                new Address("11 Charles de Gaulle","Paris","France"),
                new Address("39 Boulevard Jean Racine","Méru","France")
        ));
        System.out.println();System.out.println();
        employee.setAddresses(addresses);
        System.out.println("employee = " + employee);
        System.out.println();
        Employee clonedEmployee=(Employee) employee.clone();
        clonedEmployee.getAddresses().get(0).setStreet("111 Les Champs-Elysées");

        System.out.println("clonedEmployee = " + clonedEmployee);
        System.out.println("employee==clonedEmployee: "+ (employee==clonedEmployee));

    }
}
