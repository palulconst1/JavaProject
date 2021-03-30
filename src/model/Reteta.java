package model;

public class Reteta {
    private static int numberRetete = 0;
    private final int reteteID;
    private int clientID;
    private int pret;
    private String diagnostic;

    public Reteta(){
        numberRetete ++;
        reteteID = numberRetete;
    }

    public Reteta(int clientID, int pret, String diagnostic){
        numberRetete++;
        reteteID = numberRetete;
        this.clientID = clientID;
        this.pret = pret;
        this.diagnostic = diagnostic;
    }

    public int getReteteID(){
        return reteteID;
    }

    public int getClientID(){
        return clientID;
    }

    public void setClientID(int clientID){
        this.clientID = clientID;
    }

    public int getPret(){
        return pret;
    }

    public void setPret(int pret){
        this.pret = pret;
    }

    public String getDiagnostic(){
        return diagnostic;
    }

    public void setDiagnostic(String lastName){
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString()    {
        return this.reteteID + " " + this.clientID + " " + this.pret + " " + this.diagnostic;
    }

}
