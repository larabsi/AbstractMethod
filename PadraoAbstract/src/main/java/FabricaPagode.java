public class FabricaPagode implements FabricaAbstrata {

    private FabricaPagode(){};

    private static FabricaPagode instancia = new FabricaPagode();

    public static  FabricaPagode getInstance(){
        return instancia;
    }
    @Override
    public Musica criarMusica() {
        return new MusicaPagode();
    }
}
