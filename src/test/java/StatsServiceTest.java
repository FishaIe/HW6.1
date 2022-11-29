import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TestSumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.SumOfAllSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AvrgSumTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float actual = service.AvrgSum(sales);
        float expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float actual = service.maxSales(sales);
        float expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float actual = service.minSales(sales);
        float expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowerThenAvrgSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float actual = service.LowerThenAvrgSales(sales);
        float expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void HigherThenAvrgSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        float actual = service.HigherThenAvrgSales(sales);
        float expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
