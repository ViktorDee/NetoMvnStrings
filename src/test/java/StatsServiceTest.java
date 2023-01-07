import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldFindSumOfAll() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.allSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindSalesAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 15;
        int actualAvg = service.salesAverage(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);

    }

    @Test
    public void shouldFindMaxDayOfSales() {
        StatsService service = new StatsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldFindMinDayOfSales() {
        StatsService service = new StatsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 9;
        int actualMax = service.minSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldFindSalesBelowAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 5;
        int actualAvg = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void shouldFindSalesGreaterThanAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 5;
        int actualAvg = service.salesGreaterThanAverage(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }
}
