package cvbank.model;

import java.util.Objects;

public class EducationData
{
    private String institutionName;
    private String degree;
    private String graduationYear;
    private String description;

    public EducationData setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
        return this;
    }

    public EducationData setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public EducationData setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    public EducationData setDescription(String description) {
        this.description = description;
        return this;
    }


    public String getInstitutionName() {
        return institutionName;
    }

    public String getDegree() {
        return degree;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationData that = (EducationData) o;
        return Objects.equals(institutionName, that.institutionName) &&
                Objects.equals(degree, that.degree) &&
                Objects.equals(graduationYear, that.graduationYear);
    }

    @Override
    public int hashCode() {

        return Objects.hash(institutionName, degree, graduationYear);
    }

    @Override
    public String toString() {
        return "EducationData{" +
                "institutionName='" + institutionName + '\'' +
                ", degree='" + degree + '\'' +
                ", graduationYear='" + graduationYear + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
