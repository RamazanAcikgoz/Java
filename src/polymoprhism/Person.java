package polymoprhism;

public class Person {
    private String name;
    private String surname;
    private String IdNo;
    private int dateOfBirthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    public int getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setDateOfBirthYear(int dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }

    @Override
    public String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNum='" + IdNo + '\'' +
                ", birthYear=" + dateOfBirthYear +
                '}';
    }
}
