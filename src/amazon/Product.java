package amazon;

import java.util.Objects;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Category category;


    public Product(Category category, String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }
}
