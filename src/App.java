import java.math.*;
import
public class App {
    private static int mode = 1;
    private static double a1, a2, b1, b2, c1, c2, d1, d2 = 0;
    public static void main(String[] args) throws Exception {
        
        while (mode != 0){
            switch (mode) {
                case 1:
                    calculatePr(getWeights, getPages);
            
                default:
                    break;
            }
        }

    }

    private float calculatePr(String weights, Page[] pages){
        double threshold = 0.00001;
        while (true){
        double a2 = 0.15 + 0.85 * c1;
        double b2 = 0.15 + 0.85 * (a1 / 2);
        double c2 = 0.15 + 0.85 * (a1 / 2 + b1 + d1);
        double d2 = 0.15;
        print("A:", round(a2, 3), ", B:", round(b2, 3), \", C:", round(c2, 3),", D:", round(d2, 3),)
        if abs(a2 - a1) < threshold and abs(b2 - b1) < threshold and \
        abs(c2 - c1) < threshold and abs(d2 - d1) < threshold:
        break
        a1, b1, c1, d1 = a2, b2, c2, d2
        }
        print("Average=", round((a1 + b1 + c1 + d1) / 4, 3))
    }
}
