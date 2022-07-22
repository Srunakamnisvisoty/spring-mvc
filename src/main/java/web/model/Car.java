package web.model;

public class Car {

    private Long id;
    private int number;
    private int age;

    public Car(Long id, int number, int age) {
        this.id = id;
        this.number = number;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

}
