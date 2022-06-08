public class Strings {
    public static void main(String[] args) {
        String txt = "Olá pessoal do IOS";
        String myStr1 = "Hello";
        String myStr2 = "Hello";

        char result = txt.charAt(0); // Caractere da posição zero
        System.out.println("Char na posição zero: " + result);
        result = txt.charAt(10); // Caractere na posição dez
        System.out.println("Char na posição dez: " + result);

        // Compara strings
        System.out.println("Compara myStr1 com myStr2: " + myStr1.compareTo(myStr2)); // retorna 0
        System.out.println("Compara txt com myStr2: " + txt.compareTo(myStr2)); // Retorna um valir > 0
        System.out.println("Compara myStr1 com txt: " + myStr1.compareTo(txt)); // Retorna um valor < 0

        // verifica o início e o final de um string
        System.out.println("Verifica início da string txt: " + txt.startsWith("Olá")); // Retorna true
        System.out.println("Verifica início da string txt: " + txt.startsWith("O")); // Retorna true
        System.out.println("Verifica início da string txt: " + txt.startsWith("o")); // Retorna false

        System.out.println("Verifica final da string txt: " + txt.endsWith("IOS")); // Retorna true
        System.out.println("Verifica final da string txt: " + txt.endsWith("S")); // Retorna true
        System.out.println("Verifica final da string txt: " + txt.endsWith("s")); // Retorna false
    }
}
