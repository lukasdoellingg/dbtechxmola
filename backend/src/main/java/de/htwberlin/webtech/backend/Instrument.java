package de.htwberlin.webtech.backend;

public class Instrument {

    private Long id;
    private String symbol;
    private String name;
    private String type;
    private double price;
    private String source;

    public Instrument(Long id, String symbol, String name, String type, double price, String source) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.type = type;
        this.price = price;
        this.source = source;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
