import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int v,b;
     Scanner z = new Scanner(System.in);
        System.out.println("Podaj tekst z zamianą na duże");
        String x = z.next();
        System.out.println("Podaj tekst z zamianą na małe ");
        String c=z.next();
        for(v=0;v<x.length();v++)
        {
        x=(x.toUpperCase());
          }
    for(b=0;b<c.length();b++)
        {
        c=(c.toLowerCase());
          }
        System.out.println(x);
    System.out.println(c);
    System.out.println(v);
    System.out.println(b);

        z.close();
  }
}