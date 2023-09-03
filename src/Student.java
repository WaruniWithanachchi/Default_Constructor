class Student {
    int id;
    String name;

    Student()
    {

    }

    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();


        s1.id = 1;
        s1.name = "Alice";
        s2.id = 2;
        s2.name = "Bob";

        s1.display();
        s2.display();
    }
}
