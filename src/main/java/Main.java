public class Main {
    public static void main(String[] args) {
        Person father = new PersonBuilder()
                .setName("Иван")
                .setSurname("Иванов")
                .setAge(30)
                .setCity("Moscow")
                .build();
        Person son = father.newChildBuilder()
                .setAge(1)
                .setName("Саша")
                .build();
        System.out.println(father);
        System.out.println(son);


    }
}
