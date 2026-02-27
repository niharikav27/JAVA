class Student {
    String name;
    int rollNumber;
    int marks;

    void display() {
        System.out.println(name + " " + rollNumber + " " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "A";
        s1.rollNumber = 1;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "B";
        s2.rollNumber = 2;
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "C";
        s3.rollNumber = 3;
        s3.marks = 88;

        s1.display();
        s2.display();
        s3.display();
    }
}