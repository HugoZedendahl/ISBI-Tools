import java.math.*;
import java.util.HashMap;
public class App {
    private static int mode = 1;
    private static HashMap<String, Integer> searchVector = new HashMap<>();
    private static HashMap<Page, HashMap<String, Integer>> vectorTable = new HashMap<>();
    public static void main(String[] args) throws Exception {
        
        while (mode != 0){
            switch (mode) {
                case 1:

                    calculatePr(, getPages);
            
                default:
                    break;
            }
        }

    }

    private float calculatePr(Page[] pages, HashMap<Page, Integer> searchVector){
        /// calculate the page relevance using the ange of the dot product
        ///  
        populateVectorTable(pages);
        

    }

    private static void populateVectorTable(Page[] pages){
    //populate the vectortable with the pages
    }
}
