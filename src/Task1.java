public class Task1 {

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 1, 1,0};
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count = count + 1;
            } else {
                if (count > count2) {
                    count2 = count;
                }
                count = 0;

            }
            if(count > count2){
                count2 = count;
            }
        }

        System.out.print(count2);


    }


}
