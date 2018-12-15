package com.fisher.dane.dffinal;

public class pizza {
    private String pizzaName;
    private String crust;
    private Boolean gf;

    public void setPizzaName(String pn){
        pizzaName = pn;
    }

    public void setPizzaCrust(String pc){
        crust = pc;
    }

    public void setPizzaGF(Boolean gluten){
        gf = gluten;
    }

    public String getPizzaName(){

        return pizzaName;
    }

    public String getCrust(){

        return crust;
    }

    public Boolean getGF(){

        return gf;
    }
}
