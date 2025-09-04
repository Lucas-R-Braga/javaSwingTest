package entities;

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

