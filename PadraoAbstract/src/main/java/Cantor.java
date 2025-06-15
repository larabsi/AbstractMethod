public class Cantor {
    private Musica musica;

    public Cantor (FabricaAbstrata fabrica){
    this.musica=fabrica.criarMusica();
    }

    public String tocarMusica() {
       return this.musica.tocarMusica();
    }

}
