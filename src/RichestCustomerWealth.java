public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = new int [][]{{1,2},{2,3},{2,3,4,7,8,23}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int [][] accounts) {
        int maxWealth = 0;
        for(int[] customer : accounts){
            int currentCustomerWealth = 0;
            for(int bank : customer){
                currentCustomerWealth +=bank;
            }
            if(currentCustomerWealth>maxWealth){
                maxWealth = currentCustomerWealth;
            }
        }
        return maxWealth;
    }
}
