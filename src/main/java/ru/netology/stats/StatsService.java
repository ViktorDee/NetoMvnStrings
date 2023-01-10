package ru.netology.stats;

public class StatsService {

    public int allSalesSum(int[] sales) {
        int salesSum = 0;
        for (int sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public int salesAverage(int[] sales) {
        int salesAvg = allSalesSum(sales);
        return salesAvg / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
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
            month++;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int monthsBelowAvg = 0;
        int salesAvg = salesAverage(sales);

        for (int sale : sales) {
            if (sale < salesAvg) {
                monthsBelowAvg++;
            }
        }
        return monthsBelowAvg;
    }

    public int salesGreaterThanAverage(int[] sales) {
        int monthsGreaterThanAvg = 0;
        int salesAvg = salesAverage(sales);

        for (int sale : sales) {
            if (sale > salesAvg) {
                monthsGreaterThanAvg++;
            }
        }
        return monthsGreaterThanAvg;
    }
}
