/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.dal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * @author pgn
 */
public class FileReaderTester
{

    /**
     * Example method. This is the code I used to create the users.txt files.
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
        File ratings = new File("data/ratings.txt");   
        Set<Integer> uniqueIds = new HashSet<>();
        Stream<String> lines = Files.lines(ratings.toPath());
        lines.forEach((String t) ->
        {
            String[] rating = t.split(",");
            int id = Integer.parseInt(rating[1]);
            uniqueIds.add(id);
        });
        TreeSet<Integer> sorted = new TreeSet<>(uniqueIds);
        
        File users = new File("data/users.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(users.toPath(), StandardOpenOption.CREATE, StandardOpenOption.WRITE))
        {
            File source = new File("C:\\Users\\pgn\\Desktop\\Netflix Data\\load_employees.txt");
            List<String> emplyees = Files.readAllLines(source.toPath());
            Iterator<Integer> it = sorted.iterator();
            for (int i = 0; it.hasNext() && i < emplyees.size(); i++)
            {
                String[] cols = emplyees.get(i).split(",");
                String firstName = cols[2].replace("\'", "");
                String lastName = cols[3].replace("\'", "");
                bw.write(Integer.toString(it.next()) + "," + firstName + " " + lastName);
                bw.newLine();
            }
        }
    }
}
