// abstract class Animal{
//     abstract void sound();
// }
// class Cat extends Animal{
//     void sound(){
//         System.out.println("meow");
//     }
// }
// class abstraction {
//     public static void main(String[] args) {
//         Animal s1 = new Cat();
//         s1.sound();
//     }
// }


// abstract class Shape{
//     abstract void area();
// }
// class Circle extends Shape{
//     void area(){
//         System.out.println(" circle");
//     }

// }
// class Rectangle extends Shape{
//     void area(){
//         System.out.println("rectangle");
//     }

// }
// class abstraction{
//     public static void main(String[] args) {
//         Shape s1 = new Circle();
//         s1.area();
//     }
// }


// interfaces

interface Animal {
    void run();   
}
class Dog implements Animal{
    public void run(){
        System.out.println("running");
    }
}
class abstraction{
    public static void main(String[] args) {
        Animal s1 = new Dog();
        s1.run();
    }

}


