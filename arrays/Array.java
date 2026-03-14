package arrays;

public class Array {
   public static void main(String[] args) 
   {
      int[] nums = new int[]{3, 4, 2, 6};
      System.out.println(nums);
      System.out.println(nums[2]);

      for(int i = 0; i < nums.length; i++) 
      {
        System.out.println(nums[i]);
      }

      int[][] arr = new int[3][4];

      for(int i = 0; i < 3; i++) 
      {
        for(int j = 0; j < 4; j++) 
        {
          arr[i][j] = (int)(Math.random() * 100);
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }

   }
}
