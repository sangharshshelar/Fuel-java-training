package javadao;

public interface StudentInterface {

    void save(Student st);

    void delete(Student st);

    void update(Student st);

    Student getStud(int id);

}
