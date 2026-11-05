import java.math.*;
import java.util.HashMap;
import java.util.ArrayList;
public class App {
    private static int mode = 1;
    private static Tools tools = new Tools();
    private static ArrayList<Page> rawPages = new ArrayList<>();
    private static HashMap<String, Integer> searchVector = new HashMap<>();
    private static HashMap<Page, HashMap<String, Integer>> weightedWordValues  = new HashMap<>();
    private static HashMap<Page, HashMap<Page, Integer>> vectorTable = new HashMap<>();
    private static HashMap<Page, HashMap<Page, Integer>> weightedVectorTable = new HashMap<>();


    public static void main(String[] args) throws Exception {
        if (!loadSession()){
            // a function or method here to create a new session from scratch
        }
        
        while (mode != 0){
            System.out.println("enter a number to choose a mode of operations");
            System.out.println("your options are:");
            switch (mode) {
                case 0:
                    enterSearchVector();
                    break;

                case 1:
                    calculatePr(getPages(), searchVector);
                    break;
                case 2:
                    calculateWeightedPr(getPages(), searchVector);
                    break;
                case 3:
                    calculateWeightedLinkedPr(getPages(), searchVector);
                    break;
                case 7:
                    saveSession();
                    break;
                case 8:
                    populatePages();
                    break;
                case 9: 
                    calculateTFIDFTermWeights();
                    break;
                default:
                    System.out.println("oops, enter a proper value");
                    break;
            }
        }

    }

    private static Double calculatePr(Page[] pages, HashMap<Page, Integer> searchVector){
        /// calculate the page relevance without term weights
        ///  
        populateVectorTable(pages);
        

    }

    private static Double calculateWeightedPr(Page[] pages, HashMap<Page, Integer> searchVector){
        /// calculate the page relevance with term weights
        ///  
        populateVectorTable(pages);
        

    }
    private static Double calculateWeightedLinkedPr(Page[] pages, HashMap<Page, Integer> searchVector){
        /// calculate the page relevance with term weights and page links
        ///  
        populateVectorTable(pages);
        

    }

    private static void enterSearchVector(){
        //have the user enter their search query and set it up as e search vector
    }

    private Double calculateTFIDFTermWeights(){
    // calculate the TF-IDFTermWeights of all words in all pages
    }

    private static void populateVectorTable(Page[] pages){
    //populate the vectortable with the pages
    }

    private static void populatePages(){
    //populate the raw pages using the file chooser from tools, this should also overwrite 
    }

    private static boolean loadSession(){
        // use tools to reset session to a previous session
    }

    private static Page[] getPages(){
    //get the current collection of pages/load pages if not populated
    }
}
