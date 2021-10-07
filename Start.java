import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		boolean buying = false;
		int totalPrice = 0;
		String userChange;
		Output output = new Output();
		User user = new User();

		output.startMessage();

		if(user.userAnswerReturn()) {
			buying = true;
		}
		while (buying) {
			output.buyingMessage();
			userChange = user.userChange();
			switch (userChange) {
				case ("1"):
					output.aboutInformation();
					Cpu cpu = new Cpu();
					output.askAboutBuy();
					if (user.userAnswerReturn()) {
						totalPrice += cpu.getPrice();
					}
					output.continueShoppingMessage();
					buying = user.userAnswerReturn();
					break;
				case ("2"):
					output.aboutInformation();
					Memory memory = new Memory();
					output.askAboutBuy();
					if (user.userAnswerReturn()) {
						totalPrice += memory.getPrice();
					}
					output.continueShoppingMessage();
					buying = user.userAnswerReturn();
					break;
				case ("3"):
					output.aboutInformation();
					Keyboard keyboard = new Keyboard();
					output.askAboutBuy();
					if (user.userAnswerReturn()) {
						totalPrice += keyboard.getPrice();
					}
					output.continueShoppingMessage();
					buying = user.userAnswerReturn();
					break;
			}
		}
		output.endShoppingMessage(totalPrice);
	}
}
