package Assignment_2;

interface InterfaceA {
    void methodA1();
    void methodA2();
}
interface InterfaceB {
    void methodB1();
    void methodB2();
}

interface InterfaceC {
    void methodC1();
    void methodC2();
}
interface CombinedInterface extends InterfaceA, InterfaceB, InterfaceC {
    void newMethod();
}
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("Method from ConcreteClass.");
    }
}
class ImplementationClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void methodA1() {
        System.out.println("Method A1");
    }

    @Override
    public void methodA2() {
        System.out.println("Method A2");
    }

    @Override
    public void methodB1() {
        System.out.println("Method B1");
    }

    @Override
    public void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    public void methodC1() {
        System.out.println("Method C1");
    }

    @Override
    public void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method from CombinedInterface");
    }
}

// Methods taking each interface as an argument
class InterfaceMethods {
    public void useInterfaceA(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    public void useInterfaceB(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    public void useInterfaceC(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }



