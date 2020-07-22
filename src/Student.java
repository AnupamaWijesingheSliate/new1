public class Student {
    String id;
    String name;

    public Student(String village) {
        this.village = village;
    }

    String village;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
