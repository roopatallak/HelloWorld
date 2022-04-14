import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReadSample
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "demo.txt";
        FileReader fr;

        try {
            fr = new FileReader(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        BufferedReader br = new BufferedReader(fr);


            String line;
        HashMap<String, Integer> subjects = new HashMap<String, Integer>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] eachSubj = line.split(" ");
                if (eachSubj.length == 2) {
                    System.out.println("Subjects are : " + eachSubj[0]);
                    System.out.println("Marks are : " + eachSubj[1]);
                    subjects.put(eachSubj[0], Integer.parseInt(eachSubj[1]));
                }
                else {
                    System.out.println("File format not correct");
                }

            }
        if (! subjects.isEmpty()) {
            int count = 0;
            int totalMarks = 0;
            System.out.println("Subjects in Hash Map are : ");
            for (Map.Entry<String, Integer> e: subjects.entrySet()
            ) {
                System.out.println("Subjs are " + e.getKey());
                count++;
                totalMarks += e.getValue();
            }
            System.out.println("Total marks are : " + totalMarks + "Total num of subjects are : " + count);
            double avg = totalMarks / count;
            System.out.println("Average is : " + avg);
            if (avg > 80.0) {
                System.out.println("Congratulations!! Student Passed with honors");
            }
            else {
                System.out.println("Student could do with better grades");
            }

        }

    }
}