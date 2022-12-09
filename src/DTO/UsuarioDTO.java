package DTO;

public class UsuarioDTO {

    public String email;
    public String Senha;
    public String nomeUsuario;

    public UsuarioDTO(String email, String Senha, String nomeUsuario) {
        this.email = email;
        this.Senha = Senha;
        this.nomeUsuario = nomeUsuario;
    }

    public UsuarioDTO() {
      
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return Senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    }

