public class ClienteEspecial extends Pessoa {
    private float saldoCE;
    private float acrescimo = 0.25f;
    public float getSaldoCE() {
        return saldoCE;
    }
    public void setSaldoCE(float saldoCE) {
        this.saldoCE = saldoCE;
    }
    public float depositar (float valorDeposito) {
        this.saldoCE += (valorDeposito * this.acrescimo);
        return this.saldoCE;
    }
    public float sacar (float valorSaque){
        this.saldoCE = (this.saldoCE - valorSaque);
        return this.saldoCE;
    }
    public void exibirSaldo(){
        System.out.println("Saldo Disponível: " + this.saldoCE);
    }
}
