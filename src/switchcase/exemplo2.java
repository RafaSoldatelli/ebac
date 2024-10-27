package switchcase;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        String texto = s.next();
        String animal = exampleOfAnimal(texto);
        System.out.println(animal);
    }

    public static String exampleOfAnimal(String animal) {
        String result;
        if(animal.equalsIgnoreCase("dog") || animal.equalsIgnoreCase("cat")) {
            result = "domestic animal";
        } else if (animal.equalsIgnoreCase("tiger")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}
