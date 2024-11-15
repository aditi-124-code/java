package Assignment_2;
class StaticDemo {
    static int count;
    static void displayCount() {
        System.out.println("Count: " + count);
    }
    static {
        System.out.println("Static block executed.");
        count = 10; 
    }
    void incrementCount() {
        count++;
    }
    static class NestedStaticClass {
        void show() {
            System.out.println("Inside static nested class. Count: " + count);
        }
    }

    public static void main(String[] args) {
        StaticDemo.displayCount();
        StaticDemo obj = new StaticDemo();
        obj.incrementCount();
        StaticDemo.displayCount();
        StaticDemo.NestedStaticClass nestedObj = new StaticDemo.NestedStaticClass();
        nestedObj.show();
    }
}

