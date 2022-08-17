public class IfElse {
    public static void main(String[] args) {
        int grade = 65;

        if(grade >= 80) {
            System.out.println("Great Job, You pass");
        }else if(grade >= 70) {
            System.out.println("You got an A");
        }else if (grade >= 60) {
            System.out.println("You got a C");
        }else if (grade >= 50) {
            System.out.println("You got a D");
        }else {
            System.out.println("Study hard next time");
        }

        int credits = 56;
        double GPA = 1.5;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        }else {
            System.out.println("Sorry, you need at least 40 credits and a minimum of 2.0");
        }
    }
}
