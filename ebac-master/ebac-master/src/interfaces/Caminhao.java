package interfaces;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Caminhao está andando devagar");
    }
}
