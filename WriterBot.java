package Prog3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.InvalidParameterException;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

public class WriterBot {
    public static void main(String[] args) {
        try{
            Long x = System.currentTimeMillis();
            int k = Integer.parseInt(args[0]);
            if(k < 0){
                throw new InvalidParameterException();
            }
            int len = Integer.parseInt(args[1]);
            if(len < 0){
                throw new InvalidParameterException();
            }
            BufferedReader br = new BufferedReader(new FileReader(args[2]));
            StringBuilder string = new StringBuilder();
            CustomHashTable hashTable = new CustomHashTable();
            String reader;
            while (( reader = br.readLine()) != null) {
                string.append(reader);
                string.append('\n');
            }
            br.close();
            if(string.length() < k){
                throw new InvalidParameterException();
            }
            char[] chars = new char[k];
            for (int count = 0; count + k < string.length(); count++) {
                for (int index = 0; index < chars.length; index++) {
                    chars[index] = Character.toLowerCase(string.charAt(count + index));
                }
                hashTable.insert(Character.toLowerCase(string.charAt(count + k)), chars);
            }
            int count = ThreadLocalRandom.current().nextInt(0, 101);
            chars = new char[k];
            for (int index = 0; index < chars.length; index++) {
                chars[index] = Character.toLowerCase(string.charAt(count + index));
            }
            StringBuilder result = new StringBuilder();
            result.append(chars);
            while (result.length() < len) {
                try {
                    char c = hashTable.getElement(chars);
                    result.append(c);
                    for (int index = 0; index < chars.length - 1; index++) {
                        chars[index] = chars[index + 1];
                    }
                    chars[chars.length - 1] = c;
                } catch (NoSuchElementException e) {
                    result.append(". ");
                    count = ((count + 1) % string.length());
                    for (int index = 0; index < chars.length; index++) {
                        chars[index] = Character.toLowerCase(string.charAt((count + index) % string.length()));
                    }
                }
            }
            System.out.println("The runtime was " + (System.currentTimeMillis()-x) + "ms");
            FileWriter output = new FileWriter(args[3]);
            output.write(result.toString());
            output.close();
            System.out.println("output file is name: "+ args[3] + ".txt");
        } catch (Exception e){
            System.out.println("Operations stopped due to error: " + e.toString());
        }
    }
}
