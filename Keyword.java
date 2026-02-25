// SUPER KEYWORD

class Parent{
    String color = "green";
}
class Child extends Parent{
    String color = "red";
    void print(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class Keyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();

    }
}


