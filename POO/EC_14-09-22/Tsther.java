public class Tsther {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        a.setCurso("Engenharia da Cuzao");
        a.setRa(2410362);

        a.setCpf(123354789);
        a.setNome("CHUZZ");

        System.out.printf("Nome: %s, Ra: %d, CPF:%d, Curso: %s\n", a.getNome(), a.getRa(),
                a.getCpf(), a.getCurso());

    }
}
