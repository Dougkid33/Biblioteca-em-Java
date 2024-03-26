package model;
import java.util.ArrayList;
import java.util.List;
//import interfaces.Emprestimo;


public abstract class Usuario {
    private static int contadorId = 1;
    protected int idUsuario;
    protected String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.idUsuario = contadorId++;
        this.livrosEmprestados = new ArrayList<>();
    }
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public abstract void verificarStatusEmprestimo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


    
}
