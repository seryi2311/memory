public class Keyboard extends Components{
    private int price = 2000;

    public Keyboard() {
        getAllInfo();
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void getAllInfo() {
        System.out.println("Цена - " + getPrice() +" в остальном обычная клавиатура!");
    }
}
