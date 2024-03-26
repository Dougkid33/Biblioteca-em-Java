package interfaces;

import model.Livro;
import model.Usuario;

public interface Emprestimo {
    void emprestarLivro(Livro livro, Usuario usuario);
    void devolverLivro(Livro livro, Usuario usuario);
}

