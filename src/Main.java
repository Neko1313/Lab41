import java.util.ArrayList;
import java.util.regex.*;
public class Main {
    //Функция, содержащая регулярное выражение, и проверяющая строки на его основе
    static boolean isCorrect(String temp){
        String regex = "^[A-Z][a-z]+\s" + "[A-Z][a-z]+\s"+"[A-Z][a-z]+\s" + "[0-9]+\s" + "(1[5-9][0-9][0-9]|20[01][0-9]|202[0123])+\s" + "[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(temp);
        return matcher.matches();
    }
    public static void main(String[] args) {

        //Создание массива и строк на проверку
        ArrayList<String> persData = new ArrayList<>();
        String personalData = "Mark Idiot Rusmos 23 2013 292";
        String incorrect = "mark idiot dd 2 1234 12";
        persData.add(personalData);
        persData.add(incorrect);

        //Проверка строк с помощью функции
        for(String data: persData){
            if(isCorrect(data)){
                System.out.println(data + ": " + "That one is perfect");
            }
            else{
                System.out.println(data + ": " + "Well, that one is too bad");
            }
        }
    }
}