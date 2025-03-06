public class TstPes {
    public static void main(String[] args) {
        Prof prof = new Prof();
        Aluno a = new Aluno();

        a.mostraNota();
        // metodos de Prof
        prof.setCodP(60570);
        prof.setTituloP("Buxus Buchevisk");

        // metodos de Pessoa
        prof.setCpf(123321);
        prof.setNome("Buxu ambulante");

        System.out.printf("Nome: %s, CodP: %d, CPF:%d, Titulo: %s\n", prof.getNome(),
                prof.getCodP(), prof.getCpf(), prof.getTituloP());

        


    }
}
