class App{

    public static void main(String[] args) {
        ContaCorrente miguel = new ContaCorrente();
        miguel.deposita(100.00);
        System.out.println(miguel.getSaldo());
    }
    
}