package eu.happycoders.jep418;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Jep418Demo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress[] addresses = InetAddress.getAllByName("www.happycoders.eu");
    System.out.println("addresses = " + Arrays.toString(addresses));
  }
}
