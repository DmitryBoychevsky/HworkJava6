package ru.netology.stats.HworkJava6;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;  // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {  // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int salesAmount(int[] sales) {
        int totalAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            totalAmount += sales[i];
        }
        return totalAmount;    // сумма продаж всех месяцев
    }

    public int average(int[] sales) {
        int averageValue = 0;

        for (int i = 0; i < sales.length; i++) {
            averageValue += sales[i];
        }
//      return averageValue / 12;
        return averageValue / sales.length; // среднее значение всех продаж в месяц
    }

    public int monthsWithBelowAverageSales(int[] sales) {
        int lowMonths = average(sales);
        int numberMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < lowMonths) {
                numberMonths++;
            }
        }
        return numberMonths;   // продажи ниже среднего

    }

    public int MonthsAboveAverageSales(int[] sales) {
        int highMonths = average(sales);
        int numberMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > highMonths) {
                numberMonths++;
            }
        }
        return numberMonths;   // продажи выше среднего
    }


}




