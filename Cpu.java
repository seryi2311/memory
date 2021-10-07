public class Cpu extends Components{
    private final int price = 22700;
    private int numberOfCores = 8;
    private int NumberOfThreads = 8;
    private int frequency = 8;

    public Cpu() {
        getAllInfo();
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfThreads() {
        return NumberOfThreads;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    @Override
    public void getAllInfo() {
        System.out.println("Цена - " + getPrice() +", Тактовая частота - " + getFrequency()
                               + ", Количество потоков - " + getNumberOfThreads() + ", Количество ядер - " + getNumberOfCores());
    }

    @Override
    public int getPrice() {
        return price;
    }
}
