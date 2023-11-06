package Task2;

public class Main {
    public static class CustomerException extends RuntimeException {
        public CustomerException(String message) {
            super(message);
        }
    }

    public static class ProductException extends RuntimeException {
        public ProductException(String message) {
            super(message);
        }
    }

    public static class AmountException extends RuntimeException {
        public AmountException(String message) {
            super(message);
        }
    }

    private final static Client[] people = {
            new Client("Павел", 20, "+1-222-333-44-55"),
            new Client("Андрей", 30, "+2-333-444-55-66"),
    };
    private final static Item[] items = {
            new Item("Мяч", 100),
            new Item("Сэндвич", 1000),
            new Item("Стол", 10000),
            new Item("Автомобиль", 100000),
            new Item("Ракета", 10000000)
    };

    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }

    public static Order buy(Client who, Item what, int howMuch) {
        if (!isInArray(people, who))
            throw new CustomerException("Неизвестный клиент: " + who);
        if (!isInArray(items, what))
            throw new ProductException("Неизвестный товар: " + what);
        if (howMuch < 0 || howMuch > 100)
            throw new AmountException("Неправильное количество: " + howMuch);
        return new Order(who, what, howMuch);
    }

    private static Order[] orders = new Order[5];

    public static void main(String[] args) {
        Object[][] info = {
                {people[0], items[0], 1}, //успешно
                {people[1], items[1], -1}, //неверное количество -1
                {people[0], items[2], 150}, //неверное количество > 100
                {people[1], new Item("Цветок", 10), 1}, //товара нет
                {new Client("Фёдор", 40, "+3-444-555-66-77"), items[3], 1}, //клиента нет
        };
        int orderCapacity = 0;
        int i = 0;
        while (orderCapacity != orders.length - 1 || i != info.length) {
            System.out.print(i + 1 + ") ");
            try {
                orders[orderCapacity] = buy((Client) info[i][0], (Item) info[i][1], (int) info[i][2]);
                orderCapacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[orderCapacity++] = buy((Client) info[i][0], (Item) info[i][1], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Создано заказов: " + orderCapacity);
            }
            ++i;
        }
//        for (Order order : orders) {
//            order.toString();
//        }

    }
}
