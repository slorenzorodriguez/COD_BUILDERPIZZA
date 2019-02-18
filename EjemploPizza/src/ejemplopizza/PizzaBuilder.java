/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopizza;


public class PizzaBuilder {

    private final int grHarina;
    private final int mlAgua;
    private int grSal;
    private int mlAceite;
    private int tipoAceite;
    private int grTomate;
    private int grQueso;
    private int tipoQueso;
    private int grPinha;

    public PizzaBuilder(final int grHarina, final int mlAgua) {
        this.grHarina=grHarina;
        this.mlAgua=mlAgua;
        
    }

    public PizzaBuilder setGrSal(int grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setTipoAceite(int tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(int grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(int grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(int tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(int grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);
    }
    
}
