import java.util.Formatter;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Goods goods = new Goods ();
        Transformer transform = new Transformer();

        System.out.println("Укажите количество человек, на которых нужно разделить счет:");
        int countOfPersons = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                countOfPersons = scanner.nextInt();
                if (countOfPersons>1){
                    break;
                } else {
                    System.out.println("Введено некорректное значение. Количество человек должно быть больше 1.");
                }

            } else {
                scanner.next();
                System.out.println("Введено некорректное значение. Количество человек должно быть выражено числом и быть больше 1.");
            }
        }

        goods.addGood(scanner);
        goods.showGoods();
        double sum = goods.sum;
        goods.showPrice();

        scanner.close();


        String rublesRes = transform.getRublesWord4Result(goods.showResult(sum, countOfPersons));
        String resultText = "Каждый должен заплатить по %.2f %s.";
        System.out.println(String.format(resultText, goods.showResult(sum, countOfPersons), rublesRes));
    }
}

