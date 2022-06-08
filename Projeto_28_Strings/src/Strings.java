import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String txt = "Olá pessoal do IOS";
        // Imprime p tamanho da string
        System.out.println("O tamanho da string txt é: " + txt.length());
        // Imprime caracteres da string em maiúsculo
        System.out.println(txt.toUpperCase());
        // Imprime os caracteres da string em minúsculo
        System.out.println(txt.toLowerCase());
        // Imprime a posição da primeira ocorrência de um valor na string
        System.out.println(txt.indexOf("s"));
        System.out.println(txt.indexOf("IO"));
        // Não encontra o texto na string
        System.out.println(txt.indexOf("io")); // Case sensitive
    }
}
