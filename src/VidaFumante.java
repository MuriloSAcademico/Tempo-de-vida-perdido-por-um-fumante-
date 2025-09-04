import java.util.Scanner;
public class VidaFumante {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o nome do(a) sr(a)? ");
        String nome = teclado.nextLine();

        System.out.println("Quantos cigarros o(a) sr(a) fuma por dia?");
        int cigarrosdia = teclado.nextInt();

        System.out.println("Quantos anos o(a) sr(a) fuma?");
        int anosfumando = teclado.nextInt();

        int minutospordia = cigarrosdia * 10;
        int diasfumados = anosfumando * 365;
        int tempoperdido = diasfumados * minutospordia;
        int horastotais = tempoperdido / 60;
        int diastotais = horastotais / 24;
        int anosPerdidos = diastotais / 365;
        int diasRestantes = diastotais % 365;
        int horasRestantes = horastotais % 24;

        if (diastotais < 365) {
            System.out.println(nome + ", o(a) sr(a) perdeu aproximadamente "
                    + diastotais + " dia(s) e " + horasRestantes + " hora(s) de vida.");
        } else {
            System.out.println(nome + ", o(a) sr(a) perdeu aproximadamente "
                    + anosPerdidos + " ano(s), "
                    + diasRestantes + " dia(s) e "
                    + horasRestantes + " hora(s) de vida.");
        }

        teclado.close();



    }
}