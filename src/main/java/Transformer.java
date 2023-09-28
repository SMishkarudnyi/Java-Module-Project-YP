public class Transformer {
    double sum;
    String rubles;
    String rubles2;

    //добавлено два метода для вывода разных значений
    //сумма товаров может быть 101 рубль
    //а итоговый расчет на двоих человек должен показывать "заплатить по 101 рублю" (при сумме счета 202 рубля)
    public String getRublesWord4List (double sum) {
        if (Math.floor(sum%10) == 1.0) {
            rubles = "рубль";
        } else if (Math.floor(sum%100) == 2.0) {
            rubles = "рубля";
        } else if (Math.floor(sum%10) == 3.0) {
            rubles = "рубля";
        } else if (Math.floor(sum%10) == 4.0) {
            rubles = "рубля";
        } else {
            rubles = "рублей";
        }
        return rubles;
    }

    public String getRublesWord4Result (double sum) {
        if (Math.floor(sum%100) == 1.0) {
            rubles2 = "рублю";
        } else if (Math.floor(sum%100) == 2.0) {
            rubles2 = "рубля";
        } else if (Math.floor(sum%100) == 3.0) {
            rubles2 = "рубля";
        } else if (Math.floor(sum%100) == 4.0) {
            rubles2 = "рубля";
        } else {
            rubles2 = "рублей";
        }
        return rubles2;
    }
}
