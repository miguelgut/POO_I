class ContaCorrente{

    private double saldo;

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

}