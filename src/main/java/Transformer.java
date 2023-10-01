public class Transformer {
    String rubles;
    String rubles2;
    //добавлено два метода для вывода разных значений
    //сумма товаров может быть 101 рубль
    //а итоговый расчет на двоих человек должен показывать "заплатить по 101 рублю" (при сумме счета 202 рубля)
    public String getRublesWordForList (double sum) {
        double lastDigits = Math.floor(sum%100);
        if (lastDigits == 1.0 || lastDigits == 21 || lastDigits == 31 || lastDigits == 41 ||
                lastDigits == 51 || lastDigits == 61 || lastDigits == 71 || lastDigits == 81 || lastDigits == 91) {
            rubles = "рубль";
        } else if (lastDigits >= 2.0 && lastDigits <= 4.0 || lastDigits >= 22 && lastDigits <=24 ||
                lastDigits >= 32 && lastDigits <=34 || lastDigits >= 42 && lastDigits <=44 ||
                lastDigits >= 52 && lastDigits <=54 || lastDigits >= 62 && lastDigits <=64 ||
                lastDigits >= 72 && lastDigits <=74 || lastDigits >= 82 && lastDigits <=84 ||
                lastDigits >= 92 && lastDigits <=94) {
            rubles = "рубля";
        } else {
            rubles = "рублей";
        }
        return rubles;
    }
    public String getRublesWordForResult (double sum) {
        double lastDigits = Math.floor(sum%100);
        if (lastDigits == 1.0 || lastDigits == 21 || lastDigits == 31 || lastDigits == 41 ||
                lastDigits == 51 || lastDigits == 61 || lastDigits == 71 || lastDigits == 81 || lastDigits == 91) {
            rubles2 = "рублю";
        } else if (lastDigits >= 2.0 && lastDigits <= 4.0 || lastDigits >= 22 && lastDigits <=24 ||
                lastDigits >= 32 && lastDigits <=34 || lastDigits >= 42 && lastDigits <=44 ||
                lastDigits >= 52 && lastDigits <=54 || lastDigits >= 62 && lastDigits <=64 ||
                lastDigits >= 72 && lastDigits <=74 || lastDigits >= 82 && lastDigits <=84 ||
                lastDigits >= 92 && lastDigits <=94) {
            rubles2 = "рубля";
        } else {
            rubles2 = "рублей";
        }
        return rubles2;
    }
}