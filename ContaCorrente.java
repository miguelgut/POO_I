class ContaCorrente{
    private double saldo;
    private String nome;

    //Método construtor, valido para inicializar uma conta já com um saldo
    public ContaCorrente(double valor, String nome){
        this.saldo = valor;
        this.nome = nome;
   }
    
    public ContaCorrente(double valor){
         this.saldo = valor;
         this.nome = "";
    }
    
    public ContaCorrente(){
        this.saldo = 0;
        this.nome = "";
   }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return this.nome;
    }

}