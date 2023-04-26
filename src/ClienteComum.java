public class ClienteComum extends Pessoa {
    private float saldoCC;
    public float getSaldoCC() {
        return saldoCC;
    }
    public void setSaldoCC(float saldoCC) {
        this.saldoCC = saldoCC;
    }
    public double depositar (double valorDeposito){
        this.saldoCC += this.saldoCC + valorDeposito;
        return this.saldoCC;
    }
    public double sacar (double valorSaque) {
        if (valorSaque <= this.saldoCC) {
            this.saldoCC += this.saldoCC - valorSaque;
        } else {
            this.saldoCC = this.saldoCC;
        }
        return this.saldoCC;
    }
    public void exibirSaldo(){
        System.out.println("Saldo Disponível: " + this.saldoCC);
    }
}
