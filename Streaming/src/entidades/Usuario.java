package entidades;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private Favoritos favoritos;

    public Usuario(String nome, String email, String senha, int idade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.favoritos = new Favoritos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favoritos favoritos) {
        this.favoritos = favoritos;
    }

    public void adicionarFavorito(Video video) {
        this.favoritos.adicionar(video);
    }

    public void removerFavorito(Video video) {
        this.favoritos.remover(video);
    }
}
