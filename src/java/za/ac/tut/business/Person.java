package za.ac.tut.business;

public class Person {

    private String nameSurname;
    private String gender;

    public Person(String nameSurname, String gender) {
        this.nameSurname = nameSurname;
        this.gender = gender;
    }

   

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
