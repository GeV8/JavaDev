public class Clothes {
    private final String name;
    private final String type;
    private final int size;
    private final double price;
    private final String color;

    public Clothes(String name, String type, int size, double price, String color) {
        execute(price, size);
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.color = color;
    }



    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() { //
        return color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


    private void execute(double price, int size){
        if(price<0){
            throw new IllegalArgumentException("Ціна не може бути менше за нуль");
        }
        if(size<0){
            throw new IllegalArgumentException("Розмір не може бути меншим за нуль");
        }
    }

}
