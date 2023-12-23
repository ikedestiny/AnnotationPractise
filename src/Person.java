public class Person {
    @VerifrySize(min = 3, max = 7)
    private String name;
    @VerifrySize
    private String surname;
    private String anotherName;

    public Person(String name, String surname, String anotherName) {
        this.name = name;
        this.surname = surname;
        this.anotherName = anotherName;
    }

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

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }
}
