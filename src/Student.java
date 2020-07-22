public class Student {
    String id;
    String name;

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
        return "anupama";
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
