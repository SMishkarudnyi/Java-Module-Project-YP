import java.util.Scanner;

public class Goods {
    double price;
    String name;
    String list = "";
    String stopWord = "Завершить";
    double sum = 0;
    Transformer forma = new Transformer();

    public void showGoods() {
        System.out.println("\nДобавлены следующие товары: " + list);
    }

    public void showPrice(){
        String sumText = "\nСтоимость добавленных товаров: %.2f %s.";
        System.out.println(String.format(sumText, sum, forma.getRublesWord4List(sum)));
    }

    public double showResult(double sum, int count){
        double result = sum / (double) count;
        return (double) result;
    }

    public void addGood(Scanner scanner) {
        while (true) {
            System.out.println("Введите название товара или слово \"Завершить\", чтобы перейти к расчету:");

            scanner.nextLine();
            name = scanner.nextLine();


            if (name.equalsIgnoreCase(stopWord)) {
                break;
            }
            list = list + "\n" + name;

            System.out.println("Введите стоимость товара в формате X,XX");
            double price = 0.0;
            while (true) {
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    if (price >= 0.0) {
                    sum = sum + price;
                        break;
                    } else {
                        System.out.println("Стоимость не может быть отрицательной. Введите корректное значение");
                    }


                } else if (scanner.hasNextInt()) {
                    System.out.println("Введено некорректное значение. Введите стоимость в формате X,XX.");
                } else {
                    scanner.next();
                    System.out.println("Введен текст вместо числа. Укажите стоимость в формате X,XX.");
                }
            }

        }
    }
}
