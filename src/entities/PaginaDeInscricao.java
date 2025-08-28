package entities;


/*public class paginaDeIncricao {

    private javax.swing.JTextArea displayArea;
    private Candidato[] candidatos;

    public paginaDeIncricao(javax.swing.JTextArea displayArea) {
        this.displayArea = displayArea;
        this.displayArea.setText("Lista de Candidatos 2025:\n\n");
        int i = 1;
        for (Candidato c : candidatos) {
            displayArea.append("Candidato " + (i++) + ":\n");
            displayArea.append("Nome: " + c.getName() + "\n");
            displayArea.append("Idade: " + c.calcularIdade() + "\n");
            displayArea.append("Mãe: " + c.getNameMother() + "\n");
            displayArea.append("Pai: " + c.getNameFather() + "\n");
            displayArea.append("Telefone: " + c.getCellPhone() + "\n");
            displayArea.append("Email: " + c.getEmail() + "\n");
            displayArea.append("Altura: " + String.format("%.2f", c.getHeight()) + "\n");
            displayArea.append("Peso: " + String.format("%.2f", c.getWeight()) + " kg\n");
            displayArea.append(verificacaoTexto(c) + "\n");
            displayArea.append("-----------------------------\n");
        }
    }

    private String verificacaoTexto(Candidato c) {
        // Implement your logic here. Example:
        return "Verificação: OK";
    }



}*/

import java.util.ArrayList;

public class PaginaDeInscricao {

    private ArrayList<Candidato> candidatos = new ArrayList<>();

    public void addCandidato(Candidato c) {
        candidatos.add(c);
    }

    public String exibirLista() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Candidatos 2025:\n\n");
        for (int i = 0; i < candidatos.size(); i++) {
            Candidato c = candidatos.get(i); // como se fosse array
            sb.append("Candidato " + (i+1) + ":\n");
            sb.append("Nome: " + c.getNome() + "\n");
            sb.append("Idade: " + c.calcularIdade() + "\n");
            sb.append("Mãe: " + c.getNomeMae() + "\n");
            sb.append("Pai: " + c.getNomePai() + "\n");
            sb.append("Telefone: " + c.getTelefone() + "\n");
            sb.append("Email: " + c.getEmail() + "\n");
            sb.append("Altura: " + String.format("%.2f", c.getAltura()) + "\n");
            sb.append("Peso: " + String.format("%.2f", c.getPeso()) + " kg\n");
            sb.append(c.getSituacao() + "\n");
            sb.append("-----------------------------\n");
        }
        return sb.toString();
    }
}

