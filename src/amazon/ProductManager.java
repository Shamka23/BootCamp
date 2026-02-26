package amazon;

import java.util.*;

public class ProductManager {
    private static final Set<Product> products = new HashSet<>();

    public static void main(String[] args) {
        addProduct(Category.FOOD, "Apple");
        addProduct(Category.FOOD, "Bread");
        addProduct(Category.ELECTRONICS, "Laptop");
        addProduct(Category.ELECTRONICS, "Smartphone");

        printAllProducts();
    }

    public static void addProduct(Category category, String name) {
        Product product = new Product(category, name);
        products.add(product);
    }

    public static void removeProduct(Category category, String name) {
        products.remove(new Product(category, name));
    }

    public List<Product> findProductsByCategory(Category category) {
        List<Product> list = new ArrayList<>();

        if (category == null) {
            return list;
        }

        for (Product product : products) {
            if (product.getCategory() == category) {
                list.add(product);
            }
        }
        return list;
    }

    public static Map<Category, List<Product>> groupProductsByCategory() {
        Map<Category, List<Product>> map = new HashMap<>();
        for (Product product : products) {
            if (map.containsKey(product.getCategory())) {
                map.get(product.getCategory()).add(product);
            } else {
                List<Product> list = new ArrayList<>();
                list.add(product);
                map.put(product.getCategory(), list);
            }
        }
        return map;
    }

    public static void printAllProducts() {
        Map<Category, List<Product>> map = groupProductsByCategory();
        for (Map.Entry<Category, List<Product>> entry : map.entrySet()) {
            System.out.println("Категория: " + entry.getKey() +
                    "\n" + "Продукты: \n" + getProductNames(entry.getValue()));

        }
    }

    public static String getProductNames(Collection<Product> list) {
        StringBuilder result = new StringBuilder();
        for (Product product : list) {
            result.append("- ").append(product.getName()).append("\n");
        }
        return result.toString();
    }
}
