import java.util.Scanner;

class MatrimonyProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Groom details
        System.out.println("Enter Groom Details");
        System.out.print("Name: ");
        String groomName = sc.nextLine();

        System.out.print("Age: ");
        int groomAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Education: ");
        String groomEducation = sc.nextLine();

        // Bride details
        System.out.println("\nEnter Bride Details");
        System.out.print("Name: ");
        String brideName = sc.nextLine();

        System.out.print("Age: ");
        int brideAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Education: ");
        String brideEducation = sc.nextLine();

        // Matching Logic
        boolean ageMatch = groomAge >= 21 && brideAge >= 18;
        boolean educationMatch = groomEducation.equalsIgnoreCase(brideEducation);

        System.out.println("\n--- Matrimony Result ---");

        if (ageMatch && educationMatch) {
            System.out.println("Match Found!");
            System.out.println("Groom: " + groomName);
            System.out.println("Bride: " + brideName);
        } else {
            System.out.println("Sorry, Match Not Found.");
        }

        sc.close();
    }
}
