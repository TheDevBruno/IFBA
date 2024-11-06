import javax.swing.*;

public class Escola {

    public static void main(String[] arg) {
        Aluno a;
        a = new Aluno();
        boolean sair = false;

        while (!sair) {
        String opcao = JOptionPane.showInputDialog( 
            "Menu:\n" + 
            "1 - Registrar Aluno\n" + 
            "2 - Registrar Notas\n" + 
            "3 - Relatório de Notas\n" + 
            "4 - Fechar Sistema\n" + 
            "Escolha uma opção:");

            switch (opcao) {
                case "1":
                    JOptionPane.showMessageDialog(null,"Registre o Aluno");
                    a.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a Matricula")));
                    a.setNome(JOptionPane.showInputDialog("Informe o nome do aluno"));     
                break;
            
                case "2":
                    JOptionPane.showMessageDialog(null,"Registre as notas do Aluno");
                    a.setNota1(Float.parseFloat(JOptionPane.showInputDialog("1° Nota da atividade")));
                    a.setNota2(Float.parseFloat(JOptionPane.showInputDialog("2° Nota da atividade")));
                    a.setNota3(Float.parseFloat(JOptionPane.showInputDialog("3° Nota da atividade")));
                    
                    JOptionPane.showMessageDialog(null,"Registre o total de faltas do aluno");
                    a.setFaltas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de faltas")));
                break;

                case "3":
                    JOptionPane.showMessageDialog(null,"Relatório de notas do aluno");
                    String relatorio = "Boletim do aluno" +
                    "\nNota 1: " + a.getNota1() +
                    "\nNota 2: " + a.getNota2() + 
                    "\nNota 2: " + a.getNota3() +
                    "\n Total de Faltas: " + a.getFaltas();

                    if (a.getFaltas() > 18) {

                        JOptionPane.showMessageDialog(null,"Aluno Reprovado por faltas");

                        else 
                            if(media < 6)
                            JOptionPane.showMessageDialog(null,"Aluno Reprovado por Notas");
                        
                        else
                        JOptionPane.showMessageDialog(null,"Aluno Aprovado");
                    }

                    JOptionPane.showMessageDialog(null, relatorio, "Relatório" , JOptionPane.INFORMATION_MESSAGE);

                break;

                case "4":
                String Fechamento = "Fechar Sistema de gestão de Alunos";
                JOptionPane.showMessageDialog(null, Fechamento, "Fechando o sistema" , JOptionPane.INFORMATION_MESSAGE);
                    sair = true;
                break;

                default:
                break;
            }
        }
    }
}

