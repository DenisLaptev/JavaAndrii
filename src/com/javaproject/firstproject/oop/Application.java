package com.javaproject.firstproject.oop;

public class Application {
    public static int i;
    public static int i1 = 23;

    public static void main(String[] args) {

        Human[] humans = new Human[4];
        humans[0] = new Teacher("Teacher1Name","Teacher1LastName",50,"Physics");
        humans[1] = new Teacher("Teacher2Name","Teacher2LastName",40,"Mathematics");
        humans[2] = new Student("Student1Name","Student1LastName",20,"PhysicsFaculty",1);
        humans[3] = new Student("Student2Name","Student2LastName",22,"ProgrammingFaculty",3);

        for (int j = 0; j < humans.length; j++) {
            System.out.println(humans[j]);
        }

        for (int j = 0; j < humans.length; j++) {
            humans[j].doSomething();
        }



/*
        System.out.println("i=" + i);
        i = 10;
        System.out.println("i=" + i);


        Human human = new Human();
        System.out.println("human.firstName=" + human.firstName);
        System.out.println("human.lastName=" + human.lastName);
        System.out.println("human.age=" + human.age);

        System.out.println("-----------------------");
        human.age = 10;
        System.out.println("human.firstName=" + human.firstName);
        System.out.println("human.lastName=" + human.lastName);
        System.out.println("human.age=" + human.age);

        System.out.println("-----------------------");
        Human human1 = new Human("Vasja", "Ivanov", 23);
        System.out.println("human1.firstName=" + human1.firstName);
        System.out.println("human1.lastName=" + human1.lastName);
        System.out.println("human1.age=" + human1.age);

        System.out.println("-----------------------");
        Human human2 = new Human("Vasja");
        System.out.println("human2.firstName=" + human2.firstName);
        System.out.println("human2.lastName=" + human2.lastName);
        System.out.println("human2.age=" + human2.age);


*//*
        System.out.println("-----------------------");
        Human human3 = new Human("Vasja","Ivanov");
        System.out.println("human2.firstName=" + human2.firstName);
        System.out.println("human2.lastName=" + human2.lastName);
        System.out.println("human2.age=" + human2.age);*//*
        System.out.println("-----------------------");

        human.doSomething();


        System.out.println("human=" + human);

        Object obj = new Object();
        obj.toString();*/
    }
}
