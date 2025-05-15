import java.util.List;

class ContaSteam {
    private String nomeConta;
    private List<Usuario> usuarios;
    
    public ContaSteam(String nomeConta) {
        this.nomeConta = nomeConta;
        this.usuarios = new java.util.ArrayList<>();
    }
    
    public String getNomeConta() {
        return nomeConta;
    }
    
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
