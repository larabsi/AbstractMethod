public class FabricaPop implements FabricaAbstrata {

    private FabricaPop(){};
    private static FabricaPop instancia = new FabricaPop();

    public static FabricaPop getInstance(){
        return instancia;
    }
    @Override
    public Musica criarMusica() {
        return new MusicaPop();
    }
}
