public class JavaBusinessCard
{
   public static void main(String arg[])
   {
   
      String [] info = {"Lorem", "Ipsum ipsum", "Lorem Ipsum Lorem"};
      
      int maxLen = calcLongestString(info, 3);
      
      
      drawPipes(maxLen, info,3);
      
   }
   public static void drawPipes(int maxLen, String text[], int arrayLength)
   {
      drawLine(maxLen+2);
      for(int i = 0; i<arrayLength;i++)
      {
         while(text[i].length()<maxLen)
         {
            text[i]+= " ";
         }
         text[i] = "|" + text[i] + "|";
         System.out.println(text[i]);
      }
      drawLine(maxLen+2);
   }
   public static void drawLine(int count)
   {
      //Draws a line with desired length
      for(int i=0;i<count;i++)
      {
         System.out.print("-");
      }
      System.out.print("\n");
   }
   public static int calcLongestString(String [] textArray, int arrayLength)
   {
      //Calculates longest string in array and returns that length
      String longestString = textArray[0];
      
      for(int i = 0; i<arrayLength; i++)
      {
         int currentStringLength = textArray[i].length();
         int longestStringLength = longestString.length();
         
         if(currentStringLength >= longestStringLength)
         {
            longestString = textArray[i];
         }
      }
      //System.out.println("The longest string is "+longestString);
      return longestString.length();
   }
}