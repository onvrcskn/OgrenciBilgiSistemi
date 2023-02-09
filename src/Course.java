public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;

    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println("Öğretmen başarıyla eklendi.");
        }
        else {
            System.out.println("Öğretmen - Ders uyumsuzluğu ");
        }
    }
    void printTeacher(Teacher teacher) {
        System.out.println("Ders Öğretmeni :\t" + this.teacher.name);
    }
}
