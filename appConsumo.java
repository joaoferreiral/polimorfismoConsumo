public class appConsumo {
    public static void main(String[] args) {

        Consumo consumo1 = new Consumo(35);
        Consumo consumo2 = new Consumo(25, 'F');
        Consumo consumo3 = new Consumo(23, 'A');
        Consumo consumo4 = new Consumo(35, 'A');

        System.out.println(consumo1);
        System.out.println(consumo2);
        System.out.println(consumo3);
        System.out.println(consumo4);

    }
}