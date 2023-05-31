package sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// with the Hibernate framework, it reads these annotations and uses them to generate the necessary SQL
// statements and mapping configurations. This allows you to work with Java objects (entities) and perform 
// database operations without having to write explicit SQL queries

// @Entity is used to indicate that instances of this class will be stored in a corresponding table in the database
// @Table is used to specify the details of the database table associated with the entity

@Entity
@Table(name = "students")
public class Student {

    // @Id marks a value as the primary key
    // @GeneratedValue is creating a random value for the value of id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    public Student() {
        // default constructor needed because of hibernate?
    }

    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
