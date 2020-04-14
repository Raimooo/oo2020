import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class apple {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));
        String line;
        ArrayList<Integer> applesArray = new ArrayList<Integer>();
        int sum = 0;
        int right = 0;
        int left = 0;
        int answer = 0;
        float middle;
        String realAnswer;

        line = reader.readLine();

        while(line != null){
            applesArray.add(Integer.valueOf(line));
            line = reader.readLine();
        }

        reader.close();
        
        int size = applesArray.get(0);

        for(int i=1; i <= size; i++){
            sum += applesArray.get(i);
        }

        middle = (float)sum / 2;

        while(answer < size & left <= middle){
            answer++;
            left += applesArray.get(answer);
        }

        int rightanswer = size;

        while(rightanswer > 0 & right <= middle){
            right += applesArray.get(rightanswer);
            rightanswer--;
        }
        if(answer == rightanswer){
            realAnswer = Integer.toString(rightanswer);
        } else{
            if(left > right){
                realAnswer = Integer.toString(rightanswer);
            } else if(left < right){
                realAnswer = Integer.toString(answer);
            } else{
                realAnswer = rightanswer + " või " + answer;
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        writer.write(realAnswer);
        writer.close();
    }

}