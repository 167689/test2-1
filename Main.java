import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int c,b;
    char v='q';
     Scanner z = new Scanner(System.in);
       for(c=0;c<10000;c++)
        {
           String x = z.next();
          
          if (x.contains("q"))
          {
            b=x.length()-1;
             if (x.contains("q"))
          {
            b=x.length()-1;
            
          }
             else
          {
        System.out.println(x);
          }}
          else
          {
        System.out.println(x);
          }
          }

        z.close();
  }
}