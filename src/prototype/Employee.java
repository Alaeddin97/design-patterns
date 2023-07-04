package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Prototype{
    private Integer id;
    private String firstName;
    private String lastName;
    private List<Address> addresses=new ArrayList<>();

    public Employee() {
    }

    public Employee(Employee source) {
        this.id=source.id;
        this.firstName=source.firstName;
        this.lastName=source.lastName;
        for(Address address:source.addresses){
            this.addresses.add(new Address(address.getStreet(),address.getCity(),address.getCountry()));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public Object clone() throws NotCloneableObject {
        Class<?>[] interfaces = this.getClass().getInterfaces();
        for(Class<?> clazz:interfaces) {
            if(Prototype.class.equals(clazz)){
                System.out.println("Object does implement Prototype interface");
                return new Employee(this);
            }
        }
            return new NotCloneableObject("Object does not implement Prototype interface");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
