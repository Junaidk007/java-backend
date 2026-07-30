class Student {
    
    String name;
    String course;
    int age;


    String getName() {
        return this.name;
    }

    String getCourse() {
        return this.course;
    }

    int getAge() {
        return this.age;
    }

    void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
        System.out.println("Age: " + this.age);
    }
    
}

public class Students {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Junaid";
        s1.course = "Computer Science";
        s1.age = 21;

        s1.getDetails();

    }
}