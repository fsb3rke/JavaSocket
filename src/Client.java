import javax.swing.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("localhost", 1254);
        InputStream s1Is = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1Is);
        String str = new String(dis.readUTF());
        JOptionPane.showMessageDialog(null, "Socket Programming", str, JOptionPane.YES_NO_CANCEL_OPTION);
        dis.close();
        s1Is.close();
        s1.close();
    }
}
