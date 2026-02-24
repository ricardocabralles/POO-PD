package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTest {
    @Test
    public void testAtributosAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Jess", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }
}