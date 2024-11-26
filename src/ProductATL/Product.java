package PACKAGE_NAME.ProductATL;

import java.util.Objects;

class Product {
        private String name;
        private double price;
        private String category;
        private int id;

        public Product(String name, double price, String category, int id) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "id=" + id;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
