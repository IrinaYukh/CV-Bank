package cvbank.model;

import java.util.Objects;

public class CandidateData
{
    private  String firstName;
    private String lastName;
    private String email;
    private  String phone;
    private  String password;
    private String confirmPassword;

    private int id;


    public CandidateData setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public CandidateData setEmail(String email) {
        this.email = email;
        return this;
    }

    public CandidateData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CandidateData setFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;

    }

    public CandidateData setPhone(String phone)
    {
        this.phone = phone;
        return this;
    }

    public CandidateData setPassword(String password)
    {
        this.password = password;
        return this;
    }

    public CandidateData setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateData candidateData = (CandidateData) o;
        return id == candidateData.id &&
                Objects.equals(firstName, candidateData.firstName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, id);
    }


    @Override
    public String toString() {
        return "Name: " + firstName + ", id: " + id + " ; ";
    }
}
