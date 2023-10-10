package n1ex3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
    	String pathRead = new File("./src/n1ex3/countries.txt").getAbsolutePath();
        File countries = new File(pathRead);
        Scanner sc = new Scanner(countries);

        HashMap<String, String> countryCapitals = new HashMap<String, String>();
        String line, country, capital = "";
        int space, last;

        //file to hashmap
        while (sc.hasNextLine()) {
            try{
                line = sc.nextLine();
                last = line.length();
                space = line.indexOf(" ");
                country = line.substring(0, space);
                capital = line.substring(space+1, last);
                countryCapitals.put(country, capital);
            }
            catch (Exception e) {
                if (sc.hasNextLine())
                    sc.nextLine();
            }
            
        }
        sc.close();

        //game
        String playerName = Input.readString("Introdueix el teu nom:");

        Random rand = new Random();
        ArrayList<String> keys = new ArrayList<String>(countryCapitals.keySet());
        int size = keys.size();
        String answer, correctAnswer;
        int score = 0;
        
        for(int i = 0; i < 10; ++i) {
            int randomPosition = rand.nextInt(size);
            String randomCountry = keys.get(randomPosition);
            answer = Input.readString("Which is " + randomCountry + " capital city?");
            correctAnswer = countryCapitals.get(randomCountry);

            if (answer.equalsIgnoreCase(correctAnswer)){
                score += 1;
                System.out.println("Correct!");
            }
            else {
                System.out.println("wrong answer... The capital city of " + randomCountry + " is " + correctAnswer);
            }
            size--;
            keys.remove(randomPosition);
        }

        //create file
        File resultFile = new File("C:/Users/david/OneDrive/Documentos/GitHub/Java-backend/S1.03/n1ex3/src/resultFile.txt");
        try {
            if (!resultFile.createNewFile()){
                System.out.println("The file already exists");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //write to file
        try {
        	String pathWrite = new File("./src/n1ex3/resultFile.txt").getAbsolutePath();
            FileWriter writer = new FileWriter(pathWrite);
            writer.write(playerName + " " + score + " punts");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
