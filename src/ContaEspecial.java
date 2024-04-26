/*Nome: Leandro Prado de Mello Gusmão – RM: 557610
 */

public class ContaEspecial extends ContaComum {
    private double limite;
    public ContaEspecial() {
        super(Integer.parseInt(senha));
        this.limite = limite;
    }

    @Override
    public String sacarValor(double valor) {
        if (getSaldo() + limite >= valor) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                return "Saque efetuado com sucesso";
            } else {
                limite -= (valor - getSaldo());
                setSaldo(0.0);
                return "Saque efetuado utilizando o limite";
            }
        } else {
            return "Saque não efetuado, valor excede o limite disponível";
        }
    }

    private void setSaldo(double v) {
    }

    double getSaldo() {
        return 0;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void abrirConta(int i, int i1) {
    }

    public String getLimiteConta() {
        return null;
    }
}
