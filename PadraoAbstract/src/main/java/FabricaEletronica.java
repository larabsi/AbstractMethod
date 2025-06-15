public class FabricaEletronica implements FabricaAbstrata {
    private FabricaEletronica(){};
    private static FabricaEletronica instancia = new FabricaEletronica();


    public static FabricaEletronica getInstance(){
        return instancia;
    }
    @Override
    public Musica criarMusica() {
        return new MusicaEletronica();
    }
}
