package entities;

import java.time.LocalDate;

public class Candidato {

    private String nome;
    private int anoNascimento;
    private String nomeMae;
    private String nomePai;
    private long telefone;
    private String email;
    private double altura;
    private double peso;

    public Candidato(String nome, int anoNascimento, String nomeMae, String nomePai,
                     long telefone, String email, double altura, double peso) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.telefone = telefone;
        this.email = email;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters
    public String getNome() { return nome; }
    public int getAnoNascimento() { return anoNascimento; }
    public String getNomeMae() { return nomeMae; }
    public String getNomePai() { return nomePai; }
    public long getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }

    public int calcularIdade() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - anoNascimento;
    }

    public String getSituacao() {
        int idade = calcularIdade();
        int anoAtual = LocalDate.now().getYear();
        int anosAtraso = 0;

        int ano18 = anoNascimento + 18;

        if (anoAtual > ano18) {
            anosAtraso = anoAtual - ano18;
        }
        
        double multaPorAno = 5.0;
        double valorMulta = anosAtraso * multaPorAno;

        if (idade < 18) {
            return "Não possui idade suficiente para o alistamento.";
        } else if (idade == 18) {
            return "Aliste-se imediatamente (dentro do prazo).";
        } else if (idade > 18 && idade < 45) {
            if (anosAtraso > 0) {
                return "Débito com o alistamento militar. Multa de R$ " 
                        + String.format("%.2f", valorMulta);
            } else {
                return "Dentro do prazo para alistamento.";
            }
        } else {
            return "Idade acima do limite para alistamento obrigatório.";
        }
    }
}

