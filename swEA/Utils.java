import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

class Utils{

    /*
     * file input stream return List<String>
     */

    private List<String> stream;

    public List<String> file_text_token(String file_name){
        
        try {
            stream = Files.readAllLines(Paths.get("./data/" + file_name), StandardCharsets.UTF_8);

        } catch (IOException e) {
            //TODO: handle exception
        }

        return stream;
    }

    public HashMap<Integer,String> testcaset_extract(List<String> stream){
        int key = 0;
        HashMap<Integer,String> hashMaps = new HashMap<>();
        for(String readLine : stream){
            if(readLine.length() == 1){
                key = Integer.parseInt(readLine);
            }else{
                hashMaps.put(key, readLine);
            }         
        }

        return hashMaps;
    }

    public int pattern_by_integer(List<String> values){

    }
}