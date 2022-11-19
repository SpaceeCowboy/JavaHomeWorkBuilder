public class Person {
    private final String name;
    private final String surname;
    private int age = -1;
    private String city;


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        personBuilder.setCity(this.city);
        return personBuilder;
    }


    public boolean hasAge() {
        if (age == -1) {
            System.out.println("Возраст неизвестен");
            return false;
        }
        System.out.println("Возраст:  " + age);
        return true;
    }

    public boolean hasAddress() {
        if (city == null) {
            System.out.println("Адрес неизвестен");
            return false;
        }
        System.out.println("Адрес: " + city);
        return true;
    }

    public int happyBirthday() {
        if (age != 0) {
            return age++;
        }
        System.out.println("Возраст неизвестен");
        return 0;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + surname;
    }

}


