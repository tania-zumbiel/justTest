public class Actors {
    String name;
    String lastname;
    int age;


    public Actors() {
        System.out.println("CONSTRUCTOR CALLED");
    }

    public Actors(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    void play(){
    System.out.println("It is playing now");
    }
    void act(){
        System.out.println("It is acting now");
    }
    void retire(){
        System.out.println("It is retiring now");

    }
}
