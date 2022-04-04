class Main {
  public static void main(String[] args) {
    int z,x,c;
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
    
  }
}