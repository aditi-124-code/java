package Assignment_2;
class MyClass {
    private String message;
    private int number;
    public MyClass() {
        this.message = "Default Message";
        this.number = 0;
    }

    public MyClass(String message) {
        this.message = message;
        this.number = 0;
    }

    public MyClass(String message, int number) {
        this.message = message;
        this.number = number;
    }

    
    public void display() {
        System.out.println("Message: " + this.message + ", Number: " + this.number);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass("Hello, World!");
