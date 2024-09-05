import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permision(22,36));
        System.out.println(permision(generateRandomAge(),7));
        System.out.println(permision(generateRandomAge(),16));
        System.out.println(permision(generateRandomAge(),6));
        System.out.println(permision(generateRandomAge(),26));
    }

    public static int generateRandomAge(){
        Random random = new Random(100);
        return random.nextInt();
    }

    public static String permision(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";

        } else if (age <= 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }


}