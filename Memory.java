public class Memory extends Components{
    private int price = 2700;
    private int amountOfMemory = 4;
    private String type = "DDR4";

    public Memory() {
        getAllInfo();
    }

    public int getAmountOfMemory() {
        return amountOfMemory;
    }

    public String getType() {
        return type;
    }

    public void getAllInfo() {
        System.out.println("Цена - " + getPrice() +", Количество память(гб) " + getAmountOfMemory()
                               + ", Тип - " + getType());
    }

    @Override
    public int getPrice() {
        return price;
    }
}
