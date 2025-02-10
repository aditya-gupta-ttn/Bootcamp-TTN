package Assignment4;


interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA: show method");
    }
}


interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB: show method");
    }
}


class Question3MultipleInheritence implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        System.out.println("Overridden show method in MultipleInheritance");
        InterfaceA.super.show();
        InterfaceB.super.show();
    }

    public static void main(String[] args) {
        Question3MultipleInheritence obj = new Question3MultipleInheritence();
        obj.show();
    }
}


