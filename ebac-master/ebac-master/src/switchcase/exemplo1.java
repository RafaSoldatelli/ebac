package switchcase;

public class exemplo1 {
    public static void main(String args[]) {
        System.out.println("Digite a sua idade: ");
    }

    public static String getIdade(int idade) {
        String result;
        switch(idade) {
            case 0:
            case 5:
                result = "Você é um bebê";
                break;
            case 6:
            case 10:
                result = "Você é uma criança";
                break;
            case 11:
            case 18:
                result = "Você é um adolescente";
                break;
            default:
                result = "Você é um adulto";
                break;
        }
        return result;
    }
}
