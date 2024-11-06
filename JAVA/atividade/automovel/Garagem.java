package atividade.automovel;
import javax.swing.*;

public class Garagem {
    
    public static void main(String[] arg) {
        Automovel a;
        a = new Automovel();
        JOptionPane.showMessageDialog(null,"Informações 1° Veiculo");
        a.setPlaca(JOptionPane.showInputDialog("Informe a Placa"));
        a.setMarca(JOptionPane.showInputDialog("Informe a Marca"));
        a.setModelo(JOptionPane.showInputDialog("Informe a Modelo"));
        a.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo")));
        a.setValorSeguro(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do seguro")));
    
    
        Automovel a2;
        a2 = new Automovel();
        JOptionPane.showMessageDialog(null,"Informações 2° Veiculo");
        a2.setPlaca(JOptionPane.showInputDialog("Informe a Placa"));
        a2.setMarca(JOptionPane.showInputDialog("Informe a Marca"));
        a2.setModelo(JOptionPane.showInputDialog("Informe a Modelo"));
        a2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo")));
        a2.setValorSeguro(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do seguro")));


        Automovel a3;
        a3 = new Automovel();
        JOptionPane.showMessageDialog(null,"Informações 3° Veiculo");
        a3.setPlaca(JOptionPane.showInputDialog("Informe a Placa"));
        a3.setMarca(JOptionPane.showInputDialog("Informe a Marca"));
        a3.setModelo(JOptionPane.showInputDialog("Informe a Modelo"));
        a3.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo")));
        a3.setValorSeguro(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do seguro")));
    
    JOptionPane.showMessageDialog(null, 
        "Primeiro veiculo\n Placa: " + a.getPlaca() + "\n Marca: " + a.getMarca() + "\n Modelo: " + a.getModelo() + "\n Ano: " + a.getAno() + "\n Seguro R$: " + a.getValorSeguro() + 
        "\n--------------------------------------------------\n" +
        "Segundo Veiculo\n Placa: " + a2.getPlaca() + "\n Marca: " + a2.getMarca() + "\n Modelo: " + a2.getModelo() + "\n Ano: " + a2.getAno() + "\n Seguro R$: " + a2.getValorSeguro()+ 
        "\n--------------------------------------------------\n" +
        "Terceiro Veiculo\n Placa: " + a3.getPlaca() + "\n Marca: " + a3.getMarca() + "\n Modelo: " + a3.getModelo() + "\n Ano: " + a3.getAno() + "\n Seguro R$: " + a3.getValorSeguro()
        );

    }

}

