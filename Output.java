public class Output {

    public void startMessage() {
        System.out.println("Желаете что-нибудь купить?(да/нет)");
    }

    public void buyingMessage() {
        System.out.println("Введите 1, если процессор, 2 - память, 3 - устройства ввода,");
    }

    public void aboutInformation() {
        System.out.println("Сейчас я выведу информацию о товаре");
    }

    public void askAboutBuy() {
        System.out.println("Желаете купить?(да/нет)");
    }

    public void continueShoppingMessage() {
        System.out.println("Желаете продолжить покупки?(да/нет)");
    }

    public void endShoppingMessage(int totalPrice) {
        System.out.println("Спасибо за покупки, с вас: " + totalPrice);
    }
}
