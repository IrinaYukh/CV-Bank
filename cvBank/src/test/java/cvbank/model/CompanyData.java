package cvbank.model;

import java.util.Objects;

public class CompanyData
{
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int id;
    private String password;
    private String confirmPassword;
    private String company;
    private String website;
    private String country;
    private String city;
    private String street;
    private String house;
    private String postcode;



    public CompanyData setStreet(String street)
    {
        this.street = street;
        return this;
    }
    public CompanyData setHouse(String house) {
        this.house = house;
        return this;
    }

    public CompanyData setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public CompanyData setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public CompanyData setCompany (String company) {
        this.company = company;
        return this;
    }

    public CompanyData setWebsite(String website) {
        this.website = website;
        return this;
    }

    public CompanyData setFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    public CompanyData setPassword(String password) {
        this.password = password;
        return this;
    }

    public CompanyData setId(int id) {

        this.id = id;
        return this;
    }

    public CompanyData setLastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    public CompanyData setPosition(String position)
    {
        this.position = position;
        return this;
    }

    public CompanyData setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public CompanyData setPhone(String phone)
    {
        this.phone = phone;
        return this;
    }

    public CompanyData setCity(String city)
    {
        this.city = city;
        return this;
    }

    public CompanyData setCountry(String country)
    {
        this.country = country;
        return this;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword()
    {
        return confirmPassword;
    }

    public String getCompany()
    {
        return company;
    }

    public String getWebsite()
    {
        return website;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getHouse() {
        return house;
    }



    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyData that = (CompanyData) o;
        return id == that.id &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "[First name: " + firstName + ", Last name: " + lastName + ", id: " + id + " ]";
    }





}
