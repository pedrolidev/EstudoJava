public class testaMetodo {
    public static void main(String[] args) {
        Conta contaDoPedro = new Conta();
        contaDoPedro.saldo = 100;
        contaDoPedro.deposita(50);
        System.out.println(contaDoPedro.saldo);

        boolean conseguiuRetirar = contaDoPedro.saca(20);
        System.out.println(contaDoPedro.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDoYago = new Conta();
        contaDoYago.deposita(1000);
        boolean sucessoTransferencia = contaDoYago.transfere(3000, contaDoPedro, contaDoYago);
        if(sucessoTransferencia) {
            System.out.println("Transferência feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDoYago.saldo);
        System.out.println(contaDoPedro.saldo);

        contaDoPedro.titular = "Pedro Oliveira";
        System.out.println(contaDoPedro.titular);

        
    }
}
