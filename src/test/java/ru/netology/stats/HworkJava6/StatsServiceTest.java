package ru.netology.stats.HworkJava6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void withinTheValuesMin() {
        StatsService service = new StatsService();
        int[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(minSales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void withinTheValuesMax() {
        StatsService service = new StatsService();
        int[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(maxSales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void checkingTheAdditionSales() {
        StatsService service = new StatsService();
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.salesAmount(salesAmount);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void checkingTheAverageValue() {
        StatsService service = new StatsService();
        int[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMeaning = 15;
        int actualMeaning = service.average(average);
        Assertions.assertEquals(expectedMeaning, actualMeaning);

    }

    @Test
    public void checkingMonthsOfLowSales() {
        StatsService service = new StatsService();
        int[] lowSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.monthsWithBelowAverageSales(lowSales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void checkingMonthsOfHighSales() {
        StatsService service = new StatsService();
        int[] highSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.MonthsAboveAverageSales(highSales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
