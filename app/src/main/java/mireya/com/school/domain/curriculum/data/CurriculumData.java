package mireya.com.school.domain.curriculum.data;

public class CurriculumData {
    private String subject;
    private String year;

    public CurriculumData(String subject, String year) {
        this.subject = subject;
        this.year = year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
