package cvbank.model;

import java.util.Objects;

public class LanguageData
{
    private String language;

    public LanguageData setLanguage(String language)
    {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageData that = (LanguageData) o;
        return Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {

        return Objects.hash(language);
    }

    @Override
    public String toString()
    {
        return "LanguageData{" +
                "language='" + language + '\'' +
                '}';
    }
}
