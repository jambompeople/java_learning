import java.net.*;
import java.io.*;
import java.util.*;
public class client{
  public static void main(String[]args)throws IOException{
    Socket s = new Socket("localhost",4999);

    PrintWriter pr = new PrintWriter(s.getOutputStream());
    Scanner ip = new Scanner(System.in);
    System.out.println("please put what you want to text here");
    String input = ip.nextLine();
    pr.println(input);
    pr.flush();
  }
}
