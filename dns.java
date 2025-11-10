import java.net.*;
import java.util.*;

public class CN12 {
    public static void main(String[] args) {
        String host;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Enter Host Name\n2. Enter IP address\nChoice = ");
        int choice = input.nextInt();
        input.nextLine(); // clear newline left over

        if (choice == 1) {
            System.out.print("\nEnter host name: ");
            host = input.nextLine();

            try {
                InetAddress address = InetAddress.getByName(host);
                System.out.println("IP address: " + address.getHostAddress());
                System.out.println("Host name : " + address.getHostName());
                System.out.println("Host name and IP address: " + address.toString());
            } catch (UnknownHostException ex) {
                System.out.println("Could not find " + host);
            }
        } else if (choice == 2) {
            System.out.print("\nEnter IP address: ");
            host = input.nextLine();

            try {
                InetAddress address = InetAddress.getByName(host);
                System.out.println("Host name : " + address.getHostName());
                System.out.println("IP address: " + address.getHostAddress());
                System.out.println("Host name and IP address: " + address.toString());
            } catch (UnknownHostException ex) {
                System.out.println("Could not find " + host);
            }
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        input.close();
    }
}
