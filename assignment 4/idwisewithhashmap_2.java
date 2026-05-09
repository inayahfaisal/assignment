import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class idwisewithhashmap_2 {

    public static void main(String[] args) {

        File f1 = new File("E:\\inayah\\SalesEVESession.txt");
        Scanner inp;
        String dl;
        HashMap<String,Double> hm = new HashMap<>();

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine();

            double qty, amt, uPrice;


            while (inp.hasNextLine()) {
              dl = inp.nextLine();
              if (dl.trim().length() == 0)continue;

                String[] parts = dl.split("\t");
                String productName = parts[1];
                 qty = Double.parseDouble(parts[3]);
                 uPrice = Double.parseDouble(parts[2]);
                 amt = qty * uPrice;
              

               if (hm.containsKey(productName))
                {
                    amt += hm.get(productName);
                }
                hm.put(productName, amt);
            }
            }

             catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            }

             System.out.println("Product Wise Sum");
            for (Map.Entry<String, Double> me : hm.entrySet()){
                 System.out.println(me.getKey() + " --- " + me.getValue());
            }
    }
}

