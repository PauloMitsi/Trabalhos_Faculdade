import java.util.ArrayList;
import java.util.List;

public class GerConta {

    private final List<Conta> bdConta = new ArrayList<>();

    public List<Conta> getBdConta() {
        return bdConta;
    }

    public Conta consConta(Conta c1) {

        if (bdConta.contains(c1)) {
            return c1;
        }
        return null;
    }

    public Conta addConta(Conta c1) {
        if (consConta(c1) == null) {
            bdConta.add(c1);
            return c1;
        } else {
            return null;
        }
    }

    public Conta removeConta(Conta c1) {
        if (consConta(c1) != null) {
            bdConta.remove(c1);
            return c1;
        } else {
            return null;
        }
    }

    public Conta atualiConta(Conta c1) {
        if (consConta(c1) != null) {

            return c1;
        } else {
            return null;
        }
    }

}
