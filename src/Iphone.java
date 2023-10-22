public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    private String modelo;
    private int armazenamento;
    private String IMEI;
    private String MAC;
    private GPS local;

    public Iphone(String modelo, int armazenamento, String IMEI, String MAC, GPS local) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.IMEI = IMEI;
        this.MAC = MAC;
        this.local = local;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public GPS getLocal() {
        return local;
    }

    public void setLocal(GPS local) {
        this.local = local;
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("recebendo ligação do numero: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada foi finalizada");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("SMS enviado para o numero: " + numero + "com a mensagem: " + mensagem);
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Navegador Aberto");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Navegador finalizado");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para a url: " + url);
    }

    @Override
    public String buscar(String pesquisa) {
        System.out.println("Realizando pesquisa sobre: " + pesquisa);
        return "lista de resultados";
    }

    @Override
    public void tocarMusica() {
        System.out.println("Musica começou a tocar");
    }

    @Override
    public void pausarMusica() {
        System.out.println("musica pausada");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Musica foi avançada para a proxima");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Musica retornou");
    }

    public static void main(String[] args) {
        Iphone celular = new Iphone("iPhone 25", 4096, "123456789", "00:00:00:00:00:00", new GPS(40.28, -74.00, 3));

        celular.fazerChamada("123-456-7890");
        celular.encerrarChamada();
        celular.tocarMusica();
        celular.pausarMusica();
        celular.abrirNavegador();
        celular.navegar("https://www.example.com");

        celular.fecharNavegador();
    }
}
