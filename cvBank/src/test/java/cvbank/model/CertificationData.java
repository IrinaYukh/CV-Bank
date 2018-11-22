package cvbank.model;

import java.util.Objects;

public class CertificationData
{
    private String description;
    private String graduationYear;


    public CertificationData setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public CertificationData setGraduationYear(String graduationYear)
    {
        this.graduationYear = graduationYear;
        return this;
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
        CertificationData that = (CertificationData) o;
        return Objects.equals(description, that.description) &&
                Objects.equals(graduationYear, that.graduationYear);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description, graduationYear);
    }

    @Override
    public String toString() {
        return "CertificationData{" +
                "description='" + description + '\'' +
                ", graduationYear='" + graduationYear + '\'' +
                '}';
    }
}
