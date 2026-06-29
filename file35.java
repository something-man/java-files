class A {
    void displayA() {
        System.out.println("Class A");
    }
}

class B {
    void displayB() {
        System.out.println("Class B");
    }
}


class file35 extends A, B {
    public static void main(String[] args) {
        file35 obj = new file35();
        obj.displayA();
        obj.displayB();
    }
}