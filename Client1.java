public class Client1 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leticia", "998.754.345-73", 20);
        Curso curso1 = new Curso("Ciência da Computação", 8);

        cliente1.nome = "Leticia";
        cliente1.idade = 20;
        cliente1.cpf = "998.754.345-73";

        curso1.nome = "Ciência da Computação";
        curso1.semestres = 8;




        System.out.println("Nome.: " + cliente1.nome + "\n" + "CPF.: " + cliente1.cpf + "\n" + "Idade.: " + cliente1.idade + "\n" +
                "Curso.: " + curso1.nome + "\n" + "Semestres.: " + curso1.semestres);

    }
}