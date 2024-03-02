import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre os dados do Contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime date = LocalDateTime.parse(sc.nextLine(), sdf);
        System.out.println("Valor do Contrato: ");
        double totalValue = sc.nextDouble();
        Contract contract = new Contract(numero, date, totalValue);
        System.out.println("Entre o numero de parcelas: ");
        int installment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService(), contract);


        sc.close();
    }
}