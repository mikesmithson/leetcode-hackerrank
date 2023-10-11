public class GoogleStock {
    public static long solution(int[] prices) {
        int maxProfit = 0;
        int minimumPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minimumPrice = Math.min(minimumPrice, price);
            maxProfit = Math.max(maxProfit, price - minimumPrice);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        GoogleStock stock = new GoogleStock();
        long solution = GoogleStock.solution(new int[]{7, 1, 5, 3, 6, 4});
        assert solution == 5;
        System.out.println("Profit = " + solution);
    }
}


