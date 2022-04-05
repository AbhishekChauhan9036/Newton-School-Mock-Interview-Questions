public class Main{

    public static void main(String[] args) {
        String s="Mohan Is Going to Market";

        String arr[]=s.split(" ");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" -> "+arr[i].length());
        }
    }
}