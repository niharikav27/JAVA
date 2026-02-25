// METHOD OVERLOADING

// class polymorphism {
//     void add(){
//         System.out.println("hello");
//     }
//     void add(int a){
//         System.out.println(a);
//     }
//     void add(int a,int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         polymorphism s1 = new polymorphism();
//         s1.add(5, 6);
//     }

// }

// METHOD OVERRIDING

class Animal{
    void sound(){
        System.out.println("animal");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("dog");
    }    
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat");
    }
}
class polymorphism {
    public static void main(String[] args) {
        Animal s1 = new Cat();
        s1.sound();
    }      
}

