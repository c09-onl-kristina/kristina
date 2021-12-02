import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class Lesson14 {
    public static void main(String[] args) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader("lesson14/src/main/resources/input.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("lesson14/src/main/resources/output.txt"));
        ) {
            String line = reader.readLine();
            while (line != null) {
                if (TextFormatter.isPalindrome(line)) {
                    writer.write(line);
                    writer.write('\n');
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                BufferedReader reader = new BufferedReader(new FileReader("lesson14/src/main/resources/input2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("lesson14/src/main/resources/output2.txt"));
        ) {
            String line = reader.readLine();
            String text = "";
            while (line != null) {
                text = text + line;
                line = reader.readLine();
            }
            String[] sentences = text.split("\\.");


            for (String sentence : sentences) {
                if (TextFormatter.numberOfWords(sentence) > 2 && TextFormatter.numberOfWords(sentence) < 6) {
                    writer.write(sentence);
                    writer.write(".");
                } else if (TextFormatter.hasPalindrome(sentence)) {
                    writer.write(sentence);
                    writer.write(".");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                BufferedReader readerBlackList = new BufferedReader(new FileReader("lesson14/src/main/resources/blackList.txt"));
                BufferedReader readerText = new BufferedReader(new FileReader("lesson14/src/main/resources/input2.txt"));
        ) {
            String line = readerText.readLine();
            String text = "";
            while (line != null) {
                text = text + line;
                line = readerText.readLine();
            }
            String[] sentences = text.split("\\.");

            String line2 = readerBlackList.readLine();
            ArrayList<String> words = new ArrayList<>();
            while (line2 != null) {
                words.add(line2.toLowerCase(Locale.ROOT));
                line2 = readerBlackList.readLine();
            }
            TextFormatter.checkText(words, sentences);

        } catch (Exception e) {
            e.printStackTrace();
        }


        Car car = new Car("Opel", new Engine("Opel engine", 4), new Tank("Gas", 62), 300, 50000);
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lesson14/src/main/resources/car.txt"));
        ) {
            oos.writeObject(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lesson14/src/main/resources/car.txt"));
        ) {
            Car myCar = (Car) ois.readObject();
            System.out.println(myCar.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        task5();


    }

    public static void task5() {
        Car car = new Car("Opel", new Engine("Opel engine", 4), new Tank("Gas", 62), 300, 50000);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("lesson14/src/main/resources/car.json"), car);
            Car newCar = objectMapper.readValue(new File("lesson14/src/main/resources/car.json"), Car.class);
            System.out.println(newCar.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}