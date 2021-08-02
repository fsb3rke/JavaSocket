import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String b = input.next();
        if (b.equals("admin")) {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Password: ");
            String c = input2.next();
            if (c.equals("123")) {
                System.out.println("Welcome to server");
                ServerSocket s = new ServerSocket(1254);
                Socket s1 = s.accept();
                OutputStream s1out = s1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(s1out);
                dos.writeUTF("Welcome to Socket Programming");
                dos.close();
                s1out.close();
            }
        }
    }
}
