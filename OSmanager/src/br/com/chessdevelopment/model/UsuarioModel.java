package br.com.chessdevelopment.model;

public class UsuarioModel {
    
    private int idUser;
    private String nomeUser;
    private String loginUser;
    private String senhaUser;
    private String nivelUser;
    private char statusUser;    
    
    public UsuarioModel() {
        
    }
    
    public UsuarioModel(int id, String nome, String login, String senha, String nivel, char status) {
        
        this.idUser = id;
        this.nomeUser = nome;
        this.loginUser = login;
        this.senhaUser = senha;
        this.nivelUser = nivel;
        this.statusUser = status;
        
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }

    public String getNivelUser() {
        return nivelUser;
    }

    public void setNivelUser(String nivelUser) {
        this.nivelUser = nivelUser;
    }

    public char getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(char statusUser) {
        this.statusUser = statusUser;
    }
    
}
