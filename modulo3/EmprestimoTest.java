package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmprestimoTest {
    @Test
    public void testExecucaoEmprestimo() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emp = new Emprestimo(livro, usuario);
        
        assertEquals("Java Basics", emp.getLivro().getTitulo());
        assertEquals("Gabriel", emp.getUsuario().getNome());
        assertNotNull(emp.getDataRetirada());
    }
}