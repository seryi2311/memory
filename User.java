import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {

    private BufferedReader getUserAnswer() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public Boolean userAnswerReturn() throws IOException {
            return checkCorrectAnswer().equals("да");
    }

    public String userChange() throws IOException {
        return  getUserAnswer().readLine();
    }

    public String checkCorrectAnswer() throws IOException {
        String answer = getUserAnswer().readLine();
        boolean doWhile = true;
        while (doWhile) {
            if (answer.equals("да") || answer.equals("нет")){
                doWhile = false;
            } else {
                System.out.println("Неверный ввод, повторите еще");
                answer = userChange();
            }
        }
        return answer;
    }
}
