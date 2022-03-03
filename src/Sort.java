import java.util.Scanner;

public class Sort {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); //initialize scanner
        System.out.print("Enter Numbers to sort: ");
        int[] nums = new int[0];  // NEED TO FIX
        String str = sc.nextLine();

        for (int i = 0;i < str.length(); i++){
            nums[i]=(str.charAt(i));
        }

        System.out.println("Bubble Sort: " + BubbleSort(nums));


    }

    static int[] BubbleSort(int[] nums){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i< nums.length; i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return nums;
    }
}

