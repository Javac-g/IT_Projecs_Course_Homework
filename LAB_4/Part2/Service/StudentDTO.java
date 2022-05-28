package LAB_4.Part2.Service;

public class StudentDTO {
    Integer id;
    String name;
    String group;
    Grades grades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name ="Name: " + name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = "Group" +  group;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }
}
