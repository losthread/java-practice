package arrays;

public class Enhancedfor 
{
  public static void main(String[] args) 
  {
    int[] nums = {3, 4, 2, 6, 8, 1};
    int sum = 0;

    for (int n : nums)
    {
      sum += n;
    }

    System.out.println("Sum: " + sum);
  } 
}