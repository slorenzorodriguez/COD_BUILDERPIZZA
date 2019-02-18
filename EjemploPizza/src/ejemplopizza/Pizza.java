/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopizza;

/**
 *
 * @author slorenzorodriguez
 */
public class Pizza {
    
    //parámetros
    private int grHarina;
    private int mlAgua;
    private int grSal;
    private int mlAceite;
    private int tipoAceite;
    private int grTomate;
    private int grQueso;
    private int tipoQueso;
    private int grPinha;
    
    //constructor

    public Pizza(int grHarina, int mlAgua, int grSal, int mlAceite, int tipoAceite, 
            int grTomate, int grQueso, int tipoQueso, int grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    public int getGrHarina() {
        return grHarina;
    }

    public void setGrHarina(int grHarina) {
        this.grHarina = grHarina;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }

    public int getGrSal() {
        return grSal;
    }

    public void setGrSal(int grSal) {
        this.grSal = grSal;
    }

    public int getMlAceite() {
        return mlAceite;
    }

    public void setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
    }

    public int getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(int tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public int getGrTomate() {
        return grTomate;
    }

    public void setGrTomate(int grTomate) {
        this.grTomate = grTomate;
    }

    public int getGrQueso() {
        return grQueso;
    }

    public void setGrQueso(int grQueso) {
        this.grQueso = grQueso;
    }

    public int getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(int tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public int getGrPinha() {
        return grPinha;
    }

    public void setGrPinha(int grPinha) {
        this.grPinha = grPinha;
    }
    
    
    
    
   
    
    
    
    
    
    
    
}
