public class FindGreatestNumber {
    public static void main(String[] args) {
        int [] array = {1,4,36,35};
        int max = array[0];
        for(int i = 1; i< array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
