public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno=mpno;
        this.branch=branch;
       // System.out.println("Yeni öğretmen tanımlandı. ");
    }
    void print(){
        System.out.println("Adı :\t"+this.name);
        System.out.println("Telefon No :\t"+this.mpno);
        System.out.println("Bölümü :\t"+this.branch);

    }

}
