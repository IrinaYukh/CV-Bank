package cvbank.model;

import java.util.Objects;

public class ResumeData
{
    private String cvTitle;
    private String firstName;
    private String lastName;
    private String birthday;
    private String summary;
    private String about;
    private String phone;
    private String email;
    private String residence;
    private String preferArea;
    private String preferPosition;
    private String salaryFrom;
    private String salaryTill;
    private String linkedIn;
    private String gitHub;
    private String portfolio;
    private String recommendation;

    public ResumeData setCvTitle(String cvTitle) {
        this.cvTitle = cvTitle;
        return this;
    }

    public ResumeData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ResumeData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ResumeData setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public ResumeData setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public ResumeData setAbout(String about) {
        this.about = about;
        return this;
    }

    public ResumeData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ResumeData setEmail(String email) {
        this.email = email;
        return this;
    }

    public ResumeData setResidence(String residence) {
        this.residence = residence;
        return this;
    }

    public ResumeData setPreferArea(String preferArea) {
        this.preferArea = preferArea;
        return this;
    }

    public ResumeData setPreferPosition(String preferPosition) {
        this.preferPosition = preferPosition;
        return this;
    }

    public ResumeData setSalaryFrom(String salaryFrom) {
        this.salaryFrom = salaryFrom;
        return this;
    }

    public ResumeData setSalaryTill(String salaryTill) {
        this.salaryTill = salaryTill;
        return this;
    }

    public ResumeData setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
        return this;
    }

    public ResumeData setGitHub(String gitHub) {
        this.gitHub = gitHub;
        return this;
    }

    public ResumeData setPortfolio(String portfolio) {
        this.portfolio = portfolio;
        return this;
    }

    public ResumeData setRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }


    public String getCvTitle() {
        return cvTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSummary() {
        return summary;
    }

    public String getAbout() {
        return about;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getResidence() {
        return residence;
    }

    public String getPreferArea() {
        return preferArea;
    }

    public String getPreferPosition() {
        return preferPosition;
    }

    public String getSalaryFrom() {
        return salaryFrom;
    }

    public String getSalaryTill() {
        return salaryTill;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getGitHub() {
        return gitHub;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getRecommendation() {
        return recommendation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResumeData that = (ResumeData) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(linkedIn, that.linkedIn) &&
                Objects.equals(gitHub, that.gitHub);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, birthday, phone, email, linkedIn, gitHub);
    }

    @Override
    public String toString() {
        return "ResumeData{" +
                "cvTitle='" + cvTitle + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", summary='" + summary + '\'' +
                ", about='" + about + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", residence='" + residence + '\'' +
                ", preferArea='" + preferArea + '\'' +
                ", preferPosition='" + preferPosition + '\'' +
                ", salaryFrom='" + salaryFrom + '\'' +
                ", salaryTill='" + salaryTill + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", gitHub='" + gitHub + '\'' +
                ", portfolio='" + portfolio + '\'' +
                ", recommendation='" + recommendation + '\'' +
                '}';
    }
}


