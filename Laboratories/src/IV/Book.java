package IV;

class Book implements Priceable {
    protected double price;
    protected String name;
    protected int amount;

    Book() {
        this.price = 0;
        this.name = "Null";
        this.amount = 0;
    }

    Book(double price, String name) {
        this.price = price;
        this.name = name;
        this.amount = 0;
    }

    Book(double price, String name, int amount) {
        this.price = price;
        this.name = name;
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    public double getAmount()
    {
        return amount;
    }
    public String toString()
    {
        return "Цена: "+ this.price+" Название: "+this.name+" Количество: "+this.amount;
    }
}