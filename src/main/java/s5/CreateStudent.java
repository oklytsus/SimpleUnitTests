package s5;

import java.util.ArrayList;
import java.util.List;

public class CreateStudent {

    public static List<Student> createStudentCollection() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "Petrenko", "1998-05-15", 2018));
        students.add(new Student("Anna", "Ivanovich", "2000-03-20", 2019));
        students.add(new Student("Oleg", "Sidorenko", "1999-11-10", 2017));
        students.add(new Student("Natalya", "Prokopenko", "2000-07-05", 2018));
        students.add(new Student("Mariya", "Vasilenko", "1997-09-25", 2019));
        return students;
    }
}

