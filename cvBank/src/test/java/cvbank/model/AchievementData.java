package cvbank.model;

import java.util.Objects;

public class AchievementData
{
    private String description;
    private String graduationYear;

    public AchievementData setDescription(String description) {
        this.description = description;
        return this;
    }

    public AchievementData setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AchievementData that = (AchievementData) o;
        return Objects.equals(description, that.description) &&
                Objects.equals(graduationYear, that.graduationYear);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description, graduationYear);
    }

    @Override
    public String toString() {
        return "AchievementData{" +
                "description='" + description + '\'' +
                ", graduationYear='" + graduationYear + '\'' +
                '}';
    }
}
