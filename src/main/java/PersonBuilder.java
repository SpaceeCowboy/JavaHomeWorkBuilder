public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;


    @Override
    public IPersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IPersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public IPersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IPersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public Person build() {
        if (age < -1) {
            throw new IllegalStateException("Указан некорректный возраст");
        } else if (name == null) {
            throw new IllegalStateException("Не указано имя");
        } else if (surname == null) {
            throw new IllegalStateException("Не указана фамилия");
        }
        return new Person(name, surname, age, city);
    }
}
