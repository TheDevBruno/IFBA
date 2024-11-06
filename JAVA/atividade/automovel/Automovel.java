package atividade.automovel;
public class Automovel {

    String Placa;
    String Marca;
    String Modelo;
    int Ano;
    float ValorSeguro;
    
    public void setPlaca (String placa){
        Placa = placa;
    }
    public String getPlaca (){
        return Placa;
    } 

    public void setMarca (String marca){
        Marca = marca;
    }
    public String getMarca (){
        return Marca;
    } 

    public void setModelo (String modelo){
        Modelo = modelo;
    }
    public String getModelo (){
        return Modelo;
    } 

    public void setAno (int ano){
        Ano = ano;
    }

    public int getAno (){
        return Ano;
    } 

    public void setValorSeguro (float valorSeguro){
        ValorSeguro = valorSeguro;
    }
    public float getValorSeguro(){
        return ValorSeguro;
    }

}


