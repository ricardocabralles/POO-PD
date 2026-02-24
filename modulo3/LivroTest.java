package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LivroTest {
    @Test
    public void testAtributosLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro1.getTitulo());
        assertTrue(livro1.eDisponivel());
    }
}