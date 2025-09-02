public class Carro {
    String cor;
    String modelo;
    int ano;


    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.cor = "Vermelha";
        meuCarro.modelo = "volksvagen";
        meuCarro.ano = 2021;

        System.out.println("esta e a cor do meu carro: "+meuCarro.cor);
        System.out.println("esta e a marca do carro: "+meuCarro.modelo);
        System.out.println("Este e o ano: "+meuCarro.ano);


    }
}
