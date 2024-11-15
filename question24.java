package Assignment_2;
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        String candidateName = "John Doe";
        int age = 50; 

        try {
            checkEligibility(candidateName, age);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate " + name + " is too old.");
        } else if (age < 20) {
            throw new TooYounger("Candidate " + name + " is too young.");
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }
}

