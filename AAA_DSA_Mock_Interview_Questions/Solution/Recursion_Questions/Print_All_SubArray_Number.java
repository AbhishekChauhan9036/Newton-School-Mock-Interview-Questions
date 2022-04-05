public class Main{
     public static void printSubArray(int [] input, int currIndex){

        if(currIndex==input.length)
            return;

        String result = "";
        for (int i = currIndex; i <input.length ; i++) {
            result += " " + input[i] + " ";
            System.out.println(result+" ");
        }
        printSubArray(input, currIndex+1);
    }

    public static void main(String[] args) {
        int [] input = {4, 6, 8};
        printSubArray(input, 0);
    }
}