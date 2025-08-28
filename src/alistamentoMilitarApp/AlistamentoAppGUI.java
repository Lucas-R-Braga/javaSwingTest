package alistamentoMilitarApp;



import javax.swing.*;

import entities.Candidato;

import java.awt.*;


/* public class AlistamentoAppGUI extends JFrame {
    
    private JTextField nomeField, anoField, maeField, paiField, telefoneField, emailField, alturaField, pesoField;
    private JTextArea displayArea;
    private ArrayList<Candidato> candidatos = new ArrayList<>();
    
    
   
    public AlistamentoAppGUI() {
        
        setTitle("Alistamento Militar Obrigatório");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel formPanel = new JPanel(new GridLayout(9, 2, 5, 5));
        
        formPanel.add(new JLabel("Nome Completo:"));
        nomeField = new JTextField();
        formPanel.add(nomeField);

        formPanel.add(new JLabel("Ano de Nascimento:"));
        anoField = new JTextField();
        formPanel.add(anoField);


        formPanel.add(new JLabel("Nome da Mãe:"));
        maeField = new JTextField();
        formPanel.add(maeField);


        formPanel.add(new JLabel("Nome do Pai:"));
        paiField = new JTextField();
        formPanel.add(paiField);


        formPanel.add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        formPanel.add(telefoneField);


        formPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        formPanel.add(emailField);


        formPanel.add(new JLabel("Altura (ex: 1.75):"));
        alturaField = new JTextField();
        formPanel.add(alturaField);


        formPanel.add(new JLabel("Peso (Ex: 70.5):"));
        pesoField = new JTextField();
        formPanel.add(pesoField);


        //Botões
        JButton cadastrarBTN = new JButton("Cadastrar");
        JButton finalizarBTN = new JButton("Finalizar");
        formPanel.add(cadastrarBTN);
        formPanel.add(finalizarBTN);

        add(formPanel, BorderLayout.NORTH);


        //Área de exibição dos candidatos
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);


        //Ação do botõa de cadastro
        cadastrarBTN.addActionListener(e -> cadastrarCandidato());

        //Ação do botão de finalizar
        finalizarBTN.addActionListener(e -> { JOptionPane.showMessageDialog(this, "Finalizar Cadastro!");
        System.exit(0);});
    }

    private void cadastrarCandidato() {
        // Implementação da lógica de cadastro
        try {
            String nome = nomeField.getText();
            int anoNascimento = Integer.parseInt(anoField.getText());
            String nomeMae = maeField.getText();
            String nomePai = paiField.getText();
            long telefone = Long.parseLong(telefoneField.getText());
            String email = emailField.getText();
            double altura = Double.parseDouble(alturaField.getText());
            double peso = Double.parseDouble(pesoField.getText());

            Candidato candidato = new Candidato(nome, anoNascimento, nomeMae, nomePai, telefone, email, altura, peso);
            candidatos.add(candidato);
            displayArea.append("Candidato cadastrado: " + nome + anoNascimento + nomeMae + nomePai + telefone + email + altura + peso + "\n");

            atualizarLista(null);
            
            // Limpar os campos após o cadastro
            
            nomeField.setText("");
            anoField.setText("");
            maeField.setText("");
            paiField.setText("");
            telefoneField.setText("");
            emailField.setText("");
            alturaField.setText("");
            pesoField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados, por favor verifique os campos");
        }
    }

    private void atualizarLista(entities.paginaDeIncricao atualizarLista) {
        
        atualizarLista = new entities.paginaDeIncricao(displayArea);
        atualizarLista = null;
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AlistamentoAppGUI().setVisible(true));
    }

}*/



import entities.PaginaDeInscricao;

public class AlistamentoAppGUI extends JFrame {

    private JTextField nomeField, anoField, maeField, paiField, telefoneField, emailField, alturaField, pesoField;
    private JTextArea displayArea;
    private PaginaDeInscricao pagina = new PaginaDeInscricao();

    public AlistamentoAppGUI() {
        setTitle("Alistamento Militar Obrigatório");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(9, 2, 5, 5));

        formPanel.add(new JLabel("Nome Completo:"));
        nomeField = new JTextField();
        formPanel.add(nomeField);

        formPanel.add(new JLabel("Ano de Nascimento:"));
        anoField = new JTextField();
        formPanel.add(anoField);

        formPanel.add(new JLabel("Nome da Mãe:"));
        maeField = new JTextField();
        formPanel.add(maeField);

        formPanel.add(new JLabel("Nome do Pai:"));
        paiField = new JTextField();
        formPanel.add(paiField);

        formPanel.add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        formPanel.add(telefoneField);

        formPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        formPanel.add(emailField);

        formPanel.add(new JLabel("Altura (ex: 1.75):"));
        alturaField = new JTextField();
        formPanel.add(alturaField);

        formPanel.add(new JLabel("Peso (ex: 70.5):"));
        pesoField = new JTextField();
        formPanel.add(pesoField);

        JButton cadastrarBTN = new JButton("Cadastrar");
        JButton finalizarBTN = new JButton("Finalizar");
        formPanel.add(cadastrarBTN);
        formPanel.add(finalizarBTN);

        add(formPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        cadastrarBTN.addActionListener(e -> cadastrarCandidato());
        finalizarBTN.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Finalizar Cadastro!");
            System.exit(0);
        });
    }

    private void cadastrarCandidato() {
        try {
            String nome = nomeField.getText();
            int anoNascimento = Integer.parseInt(anoField.getText());
            String nomeMae = maeField.getText();
            String nomePai = paiField.getText();
            long telefone = Long.parseLong(telefoneField.getText());
            String email = emailField.getText();
            double altura = Double.parseDouble(alturaField.getText().replace(",", "."));
            double peso = Double.parseDouble(pesoField.getText().replace(",", "."));

            Candidato candidato = new Candidato(nome, anoNascimento, nomeMae, nomePai, telefone, email, altura, peso);
            pagina.addCandidato(candidato);

            displayArea.setText(pagina.exibirLista());

            nomeField.setText(""); anoField.setText(""); maeField.setText(""); paiField.setText("");
            telefoneField.setText(""); emailField.setText(""); alturaField.setText(""); pesoField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados! Verifique os campos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AlistamentoAppGUI().setVisible(true));
    }
}



