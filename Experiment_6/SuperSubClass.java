// To referr to a member of super class
class SuperClass {
    int num = 100;
}

class SubClass extends SuperClass {
    int num = 110;

    void printNumber() {
        System.out.println(super.num); 
    }
}

public class SuperSubClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.printNumber(); 
    }
}

//To call super class constructor from sub class constructer
// class SuperClass {
//     SuperClass() {
//         System.out.println("Constructor of SuperClass");
//     }
// }

// class SubClass extends SuperClass {
//     SubClass() {
//         super(); // Calls the constructor of SuperClass
//         System.out.println("Constructor of SubClass");
//     }
// }

// public class Question1 {
//     public static void main(String[] args) {
//         SubClass obj = new SubClass();
//     }
// }