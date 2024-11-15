package Assignment_2;

class MyClass {
    private String message;

    public MyClass() {
        this.message = "Hello, World!";
    }

    public void displayMessage() {
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage(); 
    }
}

