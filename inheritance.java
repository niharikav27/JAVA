// single level inheritance
// class Animal{
//     void eat(){
//         System.out.println("food");
//     }
// }
// class Dog extends Animal {
//     void bark(){
//         System.out.println("barking");
//     }    
// }
// class inheritance {
//     public static void main(String[] args) {
//         Dog s1 = new Dog();
//         s1.bark();
//         s1.eat();
//     }
// }


// multilevel inheritance
class Animal{
    void eat(){
        System.out.println("food");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("barking");
    }    
}
class Puppy extends Dog{
    void play(){
        System.out.println("ball");
    }
}
class inheritance {
    public static void main(String[] args) {
        Puppy s1 = new Puppy();
        s1.bark();
        s1.eat();
        s1.play();
    }
}
