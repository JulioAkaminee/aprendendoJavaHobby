class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
    }
}
