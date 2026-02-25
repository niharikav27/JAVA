// GETTER

// class Atm{
//     private int paisa;

//     public Atm(int r){
//         this.paisa = r;
//     }
//     public int getter(int a){
//         return paisa;
//     }
// }
// class encapsulation {
//     public static void main(String[] args) {
//         Atm s1 = new Atm(100);
//         System.out.println(s1.getter(20));
//     }
    
// }


// 1. Create a class `BankAccount` with a private balance variable. Write getter and setter methods to
// deposit and withdraw money.

class BankAccount{
    private int balance;

    public BankAccount(int r){
        this.balance = r;
    }
    public int getter(int a){
        return balance;
    }
}
class encapsulation {
    public static void main(String[] args) {
        BankAccount s1 = new BankAccount(100);
        System.out.println(s1.getter(20));
    }
    
}

// 2. Design a class `Student` with private variables `name` and `marks`. Write methods to set and get
// the values. Also, write a method to print student details.

class Student {
    private String name;
    private int marks;

    public void setName(String n) {
        name = n;
    }
    public void setMarks(int m) {
        marks = m;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Niharika");
        s.setMarks(85);
        s.printDetails();
    }
}


// 5. Create a class `Rectangle` with private fields `length` and `width`. Write setter methods to assign
// values and getter methods to return area and perimeter.

class Rectangle {
    private double length;
    private double width;

    public void setLength(double l) {
        length = l;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class encapsulation{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(3);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}