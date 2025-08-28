package entities;

/* public class Candidato {

    private String nome;
    private int anoNascimento;
    private String nomeMae;
    private String nomePai;
    private long telefone;
    private String email;
    private double altura;
    private double peso;

    public Candidato(String nome, int anoNascimento, String nomeMae, String nomePai, long telefone, String email,
            double altura, double peso) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.telefone = telefone;
        this.email = email;
        this.altura = altura;
        this.peso = peso;

    }

    public String getName() {return this.nome; }

    public int calcularIdade() {
        int currentYear = 2025; // Considerando o ano atual como 2025
        return currentYear - anoNascimento; // Retorna a idade baseada no ano de nascimento
    }

    public String getNameMother() {return nomeMae;}

    public String getNameFather() {return nomePai;}

    public long getCellPhone() {return telefone;}

    public String getEmail() {return email;}
    
    public double getHeight() {return 0;}

    public double getWeight() {return 0;}
    
    public void verificacaoTexto() {
        int idade = calcularIdade();
        int valorMulta = (idade - 20) * 5;
        
       if(idade < 18) {
			System.out.println("Não possui idade suficiente para o alistamento militar.");
        }else if(idade == 18) {
            System.out.println("Aliste-se imediatamente.");
        }else if(idade > 19 && idade < 45){
            System.out.println("Você está em débito com o alistamento militar. Multa de R$" + valorMulta + " aplicada.");
        }
    }
   

}*/



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
        int currentYear = 2025;
        return currentYear - anoNascimento;
    }

    public String getSituacao() {
        int idade = calcularIdade();
        int valorMulta = (idade - 20) * 5;

        if (idade < 18) {
            return "Não possui idade suficiente para o alistamento.";
        } else if (idade == 18) {
            return "Aliste-se imediatamente.";
        } else if (idade > 19 && idade < 45) {
            return "Você está em débito com o alistamento militar. Multa de R$" + valorMulta + " aplicada.";
        } else {
            return "Situação regular.";
        }
    }
}

