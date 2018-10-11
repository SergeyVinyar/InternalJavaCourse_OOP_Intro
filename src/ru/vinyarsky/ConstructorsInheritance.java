package ru.vinyarsky;

public class ConstructorsInheritance {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Hello");
    }
}

class ParentClass {

    ParentClass(int param) {
        System.out.println("Constructor from a parent class");
    }

}

class ChildClass extends ParentClass {

    ChildClass(String param) {
        super(10);
        System.out.println("Constructor from a child class");
    }


}