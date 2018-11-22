package cvbank.model;

import java.util.Objects;

public class SkillsData
{
    private String skills;
    private int item;

    public String getSkills() {
        return skills;
    }

    public int getItem()
    {
        return item;
    }

    public SkillsData setItem (int item)
    {
        this.item = item;
        return this;
    }

    public SkillsData setSkills(String skills) {
        this.skills = skills;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillsData that = (SkillsData) o;
        return Objects.equals(skills, that.skills);
    }

    @Override
    public int hashCode() {

        return Objects.hash(skills);
    }

    @Override
    public String toString() {
        return "SkillsData{" +
                "skills='" + skills + '\'' +
                ", item=" + item +
                '}';
    }
}
