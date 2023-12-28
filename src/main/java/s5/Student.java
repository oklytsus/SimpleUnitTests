package s5;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;


    private int admissionYear;

    public Student(String firstName, String lastName, String birthDate, int admissionYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.admissionYear = admissionYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

}

