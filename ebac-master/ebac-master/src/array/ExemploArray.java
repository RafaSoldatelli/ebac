package array;

public class ExemploArray {
    public static void main(String[] args) {
        ArrayBidimensional();
        PercorendoArray2();
        PercorendoArray();
        TamanhoArray();
        DeclaracaoArray();
    }

    public static void ArrayBidimensional() {
        System.out.println("****ArrayBidimensional****");

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Valores no array1 por linha são");
        OutputArray(array1);

        System.out.println("Valores no array2 passados na linha são");
        OutputArray(array2);
    }
        
    private static void OutputArray(int[][] array) {
        //faz um loop pelas linhas do array
        for(int linha = 0; linha < array.length; linha++) {
            //faz um loop pelas colunas da linha atual
            for(int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println();
        }
    }
        
        public static void PercorendoArray2() {
        System.out.println("****PercorendoArray2****");

        int[] array = {1, 2, 3, 4, 5};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("");
        }
    }

    public static void PercorendoArray(){
        System.out.println("****PercorendoArray****");
        int[] array = {1, 2, 3, 4, 5};
        int total = 0;

        for(int i : array) {
            total += i;
        }

        System.out.println("Total = " + total);
        System.out.println("");
    }

    public static void TamanhoArray() {
        System.out.println("****TamanhoArray****");

        int[] arrayUm = {1, 2, 3, 4, 5};
        int[] arrayDois = {1, 2, 3, 4, 5, 6, 7, 8};

        if(arrayDois.length > 8) {
            System.out.println("O arrayDois tem mais de 8 elementos");
        } else {
            System.out.println("O arrayDois tem menos de 8 elementos");
        }
        System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
        System.out.println("");
    }

    public static void DeclaracaoArray() {
        System.out.println("****DeclaracaoArray****");
        //são inseridos em uma variável que referencia o array
        int[] a = new int[4];

        //outra maneira de fazer uma declaração array
        int[] b;
        b = new int[4];

        //declarando varios arrays
        int[] r = new int[44], k =  new int[23];

        //inicializando um array
        int[] inciaValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};

        //declarando um array de inteiros
        int[] meuArray;

        //aloca memória para 10 inteiros
        meuArray = new int[10];

        //inicializa o primeiro elemento
        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 88;
        meuArray[3] = 93;
        meuArray[4] = 123;
        meuArray[5] = 952;
        meuArray[6] = 344;
        meuArray[7] = 233;
        meuArray[8] = 622;
        meuArray[9] = 8522;
        //meuArray[10] = 7; erro pois só existem 10 posições começando do zero

        System.out.println(meuArray[0]);
        System.out.println(meuArray[2]);


    }
}
