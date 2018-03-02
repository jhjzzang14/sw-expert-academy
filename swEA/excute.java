import java.util.HashMap;
import java.util.List;

class excute{
    public static void main(String[] args) {
        Utils utils = new Utils();
        List<String> result = utils.file_text_token("input.txt");

        // for(String readLine : result){
        //     System.out.println(readLine);

        //     break;
        // }
        
       HashMap<Integer, String> hashMap = utils.testcaset_extract(result);

       System.out.println(hashMap.get(1));
    }
}