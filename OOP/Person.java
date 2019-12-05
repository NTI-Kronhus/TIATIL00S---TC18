public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void printInfo(){
        System.out.println("Namn: " + this.name);
        System.out.println("Längd: " + this.height + " cm");
        System.out.println("Vikt: " + this.weight + " kg");
        System.out.println("Ålder: " + this.age + " år");
    }

    public String toString(){
        String str = "";
        str += "Namn: " + this.name + "\n";
        str += "Längd: " + this.height + " cm" + "\n";
        str += "Vikt: " + this.weight + " kg" + "\n";
        str += "Ålder: " + this.age + " år";
        return str;
    }


}
