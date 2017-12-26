import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tableroTest {
    tablero tb = new tablero();
    
    @Test
    void solucionBuscaminas4x4() {
        String [][] sinResolver4x4 = {{"*",".",".","."},{".",".",".","."},{".","*",".","."},{".",".",".","."}};
        String [][] solucion4x4 = {{"*","1","0","0"},{"2","2","1","0"},{"1","*","1","0"},{"1","1","1","0"}};
        assertArrayEquals(tb.solucion(sinResolver4x4), solucion4x4);
    }
    
    @Test
    void soloMinas() {
        String [][] sinResolver4x4 = {{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"}};
        String [][] solucion4x4 = {{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"}};
        assertArrayEquals(tb.solucion(sinResolver4x4), solucion4x4);
    }
    
    @Test
    void sinMinas() {
        String [][] sinResolver4x4 = {{".",".",".","."},{".",".",".","."},{".",".",".","."},{".",".",".","."}};
        String [][] solucion4x4 = {{"0","0","0","0"},{"0","0","0","0"},{"0","0","0","0"},{"0","0","0","0"}};     
        assertArrayEquals(tb.solucion(sinResolver4x4), solucion4x4);
    }
}
