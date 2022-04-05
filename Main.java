class Main {
  public static void main(String[] args) {
    int z,x,c=2;
    for(z=0;z<9;z++)
    {
      for(x=0;x<9*2;x++)
      {
      if(x<(9-z)||x>(9+z)) 
      {
      System.out.print(" "); 
      }
        else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }
    for(z=0;z<3;z++)
    {
      for(x=0;x<9*2;x++)
      {
      if(x<(9-c)||x>(9+c)) 
      {
      System.out.print(" "); 
      }
        else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }
  }
}