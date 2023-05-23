import java.util.Scanner;
import java.text.*;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o preço por produto");
        double precoDeCompra = scan.nextDouble();
        int dia = 1;
        double precoFinal = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");
        while (true){
            System.out.println("Coloque o valor do preço final do dia "
                + dia + " (qualquer numero negativo:)");
            precoFinal = scan.nextDouble();
            if (precoFinal < 0.0) break;
            double ganhos = precoFinal - precoDeCompra;
            if (ganhos > 0.0){
                System.out.println("Após o" + dia + ", ganhaste "
                + df.format(ganhos) + "por produto.");
            }
            else if (ganhos < 0.0)
            {
                System.out.println("Após o dia " + dia + ", perdeste "
                + df.format(-ganhos) + "por produto..");
            }
            else{
                System.out.println("Após o dia " + dia + ", você tem" +
                "não lucrou ");
            }
            dia += 1;
        }
        scan.close();
    }
}
