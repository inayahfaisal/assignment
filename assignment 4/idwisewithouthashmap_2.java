import java.io.*;
import java.util.*;

public class idwisewithouthashmap_2 {

    public static void main(String[] args) {

        try {

            File file = new File("E:\\inayah\\SalesEVESession.txt");
            Scanner sc = new Scanner(file);

            sc.nextLine();

            String[] ids = new String[1000];
            double[] sums = new double[1000];

            int count = 0;

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                String[] data = line.split("\t");

                String id = data[5];

                double unitPrice = Double.parseDouble(data[2]);
                int qty = Integer.parseInt(data[3]);

                double total = unitPrice * qty;

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (ids[i].equals(id)) {
                        sums[i] += total;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    ids[count] = id;
                    sums[count] = total;
                    count++;
                }
            }

            System.out.println("ID Wise Sum");

            for (int i = 0; i < count; i++) {
                System.out.println(ids[i] + " = " + sums[i]);
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

