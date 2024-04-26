/*Nome: Leandro Prado de Mello Gusmão – RM: 557610
 */

import java.time.LocalDate;

public class ContaComum {
    private Long nroConta;
    private LocalDate dtAbertura;
    private LocalDate dtEncerramento;
    private SituacaoEnum situacao;
    private int senha;
    private double saldo;
    private Cliente cliente;
    public ContaComum(int senha) {
        this.nroConta = (long)gerarNumeroConta();
        this.senha = senha;
        this.dtAbertura = LocalDate.now();
        this.dtEncerramento = null;
        this.situacao = SituacaoEnum.ATIVA;
        this.saldo = 100.00;
    }
    private int gerarNumeroConta() {
        return 123456;
    }
    public int validarSenha(int senha) {
        return (this.senha == senha) ? 1 : 0;
    }
    public String sacarValor(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return "Saque efetuado com sucesso";
        } else {
            return "Saque não efetuado, saldo insuficiente";
        }
    }
    public void depositarValor(double valor) {
        saldo += valor;
    }
    public String encerrarConta(int nroConta) {
        if (this.nroConta == nroConta) {
            this.situacao = SituacaoEnum.INATIVA;
            this.saldo = 0.0;
            return "Conta encerrada";
        } else {
            return "Conta inválida";
        }
    }
}
