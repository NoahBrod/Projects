package Person;

public class Person {
    private Long id;
    private String firstname;
    private String lastname;
    private Long phone;
    private String email;


    public Person(Long id, String firstname, String lastname, Long phone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    public Person() {
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getPhone() {
        return this.phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", lastname='" + getLastname() + "'" +
            ", phone='" + getPhone() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
}
