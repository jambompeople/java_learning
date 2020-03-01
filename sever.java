import java.net.*;
import java.io.*;
public class sever{
  public static void main(String[]args)throws IOException{
    ServerSocket ss = new ServerSocket(4999);
    Socket s = ss.accept();

    System.out.println("client conneted");

    InputStreamReader in = new InputStreamReader(s.getInputStream());
    BufferedReader bf = new BufferedReader(in);

    String str = bf.readLine();
    System.out.println("client: "+str);
  }
}
