package eetac.ea;

public class User {
    String idUser;
    String nom;

    public User(String idUser, String nom){
        this.idUser=idUser;
        this.nom=nom;
    }

    public User()
    {}

    public String getNom(){
        return nom;
    }

    public String getIdUser(){
        return idUser;
    }

    public void setNom(String nom)
    {
        this.nom=nom;
    }

    public void setidUser(String idUser)
    {
        this.idUser=idUser;
    }
}
