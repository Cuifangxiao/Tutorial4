package qwe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        assertEquals(2, new Calc().add());
    }
    
    @Test
    void subtract() {
        assertEquals(0,new Calc().subtract());
    }

    
}
