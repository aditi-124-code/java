package Assignment_2;

class MyClass {
    private String message;
    public MyClass(String message) {
        this.message = message;
    }
    public void displayMessage() {
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("Hello, World with Parameters!"); 
        obj.displayMessage(); 
    }
}

