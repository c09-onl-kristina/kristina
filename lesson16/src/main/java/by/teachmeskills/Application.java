package by.teachmeskills;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


public class Application {
    Shop shop = new Shop();

    public void start() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Вывод всех товаров - 1");
            System.out.println("Добавление товара - 2");
            System.out.println("Удаление товара - 3");
            System.out.println("Редактирование товара - 4");
            System.out.println("Выход - 0");
            try {
                int num = in.nextInt();
                if (num < 0 || num > 4) {
                    throw new Exception();
                } else {
                    if (num == 1) {
                        printProducts();
                    } else if (num == 2) {
                        addProduct();
                    } else if (num == 3) {
                        removeProduct();
                    } else if (num == 4) {
                        editProduct();
                    } else {
                        break;
                    }
                }
                in.nextLine();
            } catch (Exception e) {
                System.out.println("Неверный ввод, введите число от 0 до 4");
                break;
            }
        }
        in.close();
    }

    public void editProduct() {
        System.out.println("Введите id товара");
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int myId = in.nextInt();
                LinkedList<Product> products = shop.getAllProducts();

                Product found = null;
                for (Product product : products) {
                    if (product.getId() == myId) {
                        found = product;
                        break;
                    }
                }
                if (found != null) {
                    System.out.println("Введите название товара");
                    found.setName(in.next());
                    System.out.println("Введите цену товара");
                    found.setPrice(in.nextInt());
                    shop.editProduct(found);
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Неверные данные, попробуйте ещё");
                continue;
            }
            System.out.println("Товар отредактирован");
            break;
        }
    }

    public void addProduct() {
        int id;
        String name;
        int price;
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите id товара");
                id = in.nextInt();
                System.out.println("Введите название товара");
                name = in.next();
                System.out.println("Введите цену товара");
                price = in.nextInt();
            } catch (Exception e) {
                System.out.println("Неверные данные, попробуйте ещё");
                continue;
            }
            shop.addProduct(new Product(id, name, price, System.currentTimeMillis()));
            System.out.println("Товар добавлен");
            break;
        }
    }

    public void removeProduct() {
        int id;
        while (true) {
            System.out.println("Введите id товара");
            Scanner in = new Scanner(System.in);
            try {
                id = in.nextInt();
                shop.removeProduct(id);
            } catch (Exception e) {
                System.out.println("Неверные данные, попробуйте ещё");
                continue;
            }
            shop.removeProduct(id);
            System.out.println("Обьекта с id " + id + "больше нет в списке");
            break;
        }
    }

    public void printProducts() {
        System.out.println("Сортировать товары по возрастанию цены - 1");
        System.out.println("Сортировать товары по убыванию цены - 2");
        System.out.println("Показать сначала новые - 3");
        System.out.println("Выход - 0");
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int num = in.nextInt();
                LinkedList<Product> products = shop.getAllProducts();
                if (num == 1) {
                    products.sort(Comparator.comparingInt(Product::getPrice));
                    System.out.println(products);
                } else if (num == 2) {
                    products.sort(Comparator.comparingInt(Product::getPrice).reversed());
                    System.out.println(products);
                } else if (num == 3) {
                    products.sort(Comparator.comparingLong(Product::getCreated).reversed());
                    System.out.println(products);
                } else if (num == 0) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Неверные данные, попробуйте ещё");
            }
        }
    }
}
