public interface IPersonBuilder {
    IPersonBuilder setName(String name);

    IPersonBuilder setSurname(String surname);

    IPersonBuilder setAge(int age);

    IPersonBuilder setCity(String city);

    Person build();
}
