package cvbank.model;

import java.util.Objects;

public class JobData
{
    private String company;
    private String position;
    private String yearFrom;
    private String yearTill;
    private String description;

    public JobData setCompany(String company) {
        this.company = company;
        return this;
    }

    public JobData setPosition(String position) {
        this.position = position;
        return this;
    }

    public JobData setYearFrom(String yearFrom) {
        this.yearFrom = yearFrom;
        return this;
    }

    public JobData setYearTill(String yearTill) {
        this.yearTill = yearTill;
        return this;
    }

    public JobData setDescription(String description) {
        this.description = description;
        return this;
    }


    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getYearFrom() {
        return yearFrom;
    }

    public String getYearTill() {
        return yearTill;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobData jobData = (JobData) o;
        return Objects.equals(company, jobData.company) &&
                Objects.equals(position, jobData.position) &&
                Objects.equals(yearFrom, jobData.yearFrom) &&
                Objects.equals(yearTill, jobData.yearTill);
    }

    @Override
    public int hashCode() {

        return Objects.hash(company, position, yearFrom, yearTill);
    }

    @Override
    public String toString() {
        return "JobData{" +
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", yearFrom='" + yearFrom + '\'' +
                ", yearTill='" + yearTill + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
