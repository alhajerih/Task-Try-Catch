import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";


        for(int i =0; i<5; i++) {
            try {

                System.out.println("Enter the username:");
                String username = scanner.nextLine();

                System.out.println("Enter the password:");
                String password = scanner.nextLine();

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Login successfully");
                    break;


                }else {
                    throw new Exception("Invalid credentials. Attempts remaining: " + (4 - i));

                }




            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());

            }
            // new try catch block to handle the new throw Exception
            try {
                if(i==4) {
                    throw new Exception("Maximum attempts exceeded");
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }


        }



                scanner.close();





    }
}