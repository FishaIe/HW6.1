public class StatsService {
    public int SumOfAllSales(int[] sales) {

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float AvrgSum(int[] sales) {

        float AvSum = SumOfAllSales(sales) / 12;
        return AvSum;
    }

    public int maxSales(int[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {

        int minMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int LowerThenAvrgSales(int[] sales) {

        int counter = 0;

        for (int sale : sales) {
            if (sale < AvrgSum(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int HigherThenAvrgSales(int[] sales) {

        int counter = 0;

        for (int sale : sales) {
            if (sale > AvrgSum(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
