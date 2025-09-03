public class Main {
    public static void main(String[] args) {
        int[] prices = {1200, 2500, 1800, 600};
        double total = 0;
        
        for (int price : prices) {
            total += price;
        }
        
        if (total > 5000) {
            total *= 0.9; 
        }

        if (total < 2000) {
            total += 100;
        }

        System.out.println("Final payable amount:"+total);
    }
}
