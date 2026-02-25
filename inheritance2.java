// class Employee{
//     void work(){
//         System.out.println("Employee is working");
//     }
// }
// class Manager extends Employee{
//     void attendMeeting(){
//         System.out.println("Manager is attending meeting");
//     }
// }
// class inheritance2 {
//     public static void main(String[] args) {
//         Manager s1 = new Manager();
//         s1.work();
//         s1.attendMeeting();
//     }
    
// }



class Person{
    void displayName(){
        System.out.println("name");
    }
}
class Student extends Person{
    void displayClass(){
        System.out.println("class");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("discipline checking");
    }
}
class inheritance2 {
    public static void main(String[] args) {
        Monitor m = new Monitor() ;
        m.checkDiscipline();
        m.displayName();
        m.displayClass();
    }
    
}
