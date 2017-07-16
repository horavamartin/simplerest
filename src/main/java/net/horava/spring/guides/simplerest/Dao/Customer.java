package net.horava.spring.guides.simplerest.Dao;

/**
 * @author Martin Horava
 */
public class Customer {

    public static final String TABLE = "customer";

    private Long id;

    private String firstName;

    private String lastName;

    public Long getId() {
        return id;
    }

    public Customer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


}
