import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CantorTest {
    @Test
    void deveTocarMusicaEletronica() {
        FabricaAbstrata fabrica = FabricaEletronica.getInstance();
        Cantor cantor = new Cantor(fabrica);
        assertEquals("Playlist Eletronica", cantor.tocarMusica());
    }
    @Test
    void deveTocarMusicaPagode() {
        FabricaAbstrata fabrica = FabricaPagode.getInstance();
        Cantor cantor = new Cantor(fabrica);
        assertEquals("Playlist Pagode", cantor.tocarMusica());
    }
    @Test
    void deveTocarMusicaPop() {
        FabricaAbstrata fabrica = FabricaPop.getInstance();
        Cantor cantor = new Cantor(fabrica);
        assertEquals("Playlist Pop", cantor.tocarMusica());
    }

        @Test
        public void deveCriarNomeMusicaEletronica() {
            String resultado=FabricaEletronica.getInstance().toString();
          assertTrue(resultado.startsWith("FabricaEletronica@"), FabricaEletronica.getInstance().toString());
        }
    @Test
    public void deveCriarNomeMusicaPop() {
        String resultado=FabricaPop.getInstance().toString();
        assertTrue(resultado.startsWith("FabricaPop@"), FabricaPop.getInstance().toString());
    }
    @Test
    public void deveCriarNomeMusicaPagode() {
        String resultado=FabricaPagode.getInstance().toString();
        assertTrue(resultado.startsWith("FabricaPagode@"), FabricaPagode.getInstance().toString());
    }
    }

