package core.model;

import javafx.beans.property.*;


public abstract class Part {

    private final IntegerProperty partId;
    private final StringProperty name;
    private final DoubleProperty price;
    private final IntegerProperty inStock;
    private final IntegerProperty min;
    private final IntegerProperty max;

    //full constructor
    public Part() {
        partId = new SimpleIntegerProperty();
        name = new SimpleStringProperty();
        price = new SimpleDoubleProperty();
        inStock = new SimpleIntegerProperty();
        min = new SimpleIntegerProperty();
        max = new SimpleIntegerProperty();
    }

    //getters
    public Integer getPartId() {
        return partId.get();
    }

    public IntegerProperty partIdProperty() {
        return partId;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public double getPrice() {
        return price.get();
    }

    public DoubleProperty priceProperty() {
        return price;
    }

    public int getInStock() {
        return inStock.get();
    }

    public IntegerProperty inStockProperty() {
        return inStock;
    }

    public int getMin() {
        return min.get();
    }

    public IntegerProperty minProperty() {
        return min;
    }

    public int getMax() {
        return max.get();
    }

    public IntegerProperty maxProperty() {
        return max;
    }


    public void setPartId(int partId) {
        this.partId.set(partId);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public void setInStock(int inStock) {
        this.inStock.set(inStock);
    }

    public void setMin(int min) {
        this.min.set(min);
    }

    public void setMax(int max) {
        this.max.set(max);
    }


    public static String isValidPart(String name, int inv, double price, String error) {
        if (name == null) {
            error = error + "Name field is required.";
        } else if (inv < 1) {
            error = error + "The inventory number cannot be less than 1.";
        } else if (price <= 0) {
            error = error + "Price cannot be less than or equal to $0";
        }
        return error;
    }
}