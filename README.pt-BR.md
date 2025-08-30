# Aplicativo de Alistamento Militar (Java Swing)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-007396?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge)

📖 Leia em outros idiomas: [English](./README.md)

## 📖 Visão Geral
Este projeto é um **aplicativo desktop em Java Swing** que simula o **processo de alistamento militar brasileiro**.  
Ele permite cadastrar candidatos com informações pessoais e verifica automaticamente sua situação de alistamento com base na idade.

## ⚙️ Funcionalidades
- Cadastro de candidatos com dados pessoais (nome, pais, telefone, e-mail, altura, peso, ano de nascimento).  
- Cálculo automático da **idade** e da **situação militar**.  
- Cálculo de multa por atraso no alistamento (**R$ 5,00 por ano**).  
- Interface gráfica simples e intuitiva utilizando **Java Swing**.  

## 📊 Regras de Alistamento
- **Menor de 18 anos** → Não possui idade suficiente para o alistamento.  
- **Exatamente 18 anos** → Deve se alistar imediatamente (dentro do prazo legal).  
- **Entre 19 e 44 anos** →  
  - Se houve atraso, aplica-se multa de **R$ 5,00 por ano**.  
  - Se ainda dentro do ano correto, está no prazo.  
- **45 anos ou mais** → Não há obrigatoriedade de alistamento.  


## 🛠️ Tecnologias 
- **Java 17+**  
- **Java Swing** (GUI framework)  
- IDE's compativeis: **VS Code / Eclipse / IntelliJ IDEA**


## ▶️ Como Baixar 
### 🔹 Opção 1 – Baixar e executar o `.jar` (recomendado)  
Você pode baixar o executavel `.jar` diretamente do GitHub:
📥 Download
[![Download .jar](https://img.shields.io/badge/Download-.JAR-blue?style=for-the-badge&logo=java)](https://github.com/Lucas-R-Braga/javaSwingTest/blob/main/AlistamentoMilitarApp.jar)


### 🔹 Opção 2 - Compile manualmente
1. Compile este projeto:
   ---> javac -d bin src/alistamentoMilitarApp/*.java src/entities/*.java

2. Crie o arquivo .jar:
   ---> jar cfm AlistamentoMilitarApp.jar manifest.txt -C bin .

3. Execute a aplicação:
   ---> java -jar AlistamentoMilitarApp.jar


📋 Exemplo de uso
1. Abra a aplicação
2. Preencha o formulário de inscrição (nome, ano de nascimento, etc).
3. Clique em confirmar para registrar o candidato.
4. O sistema exibirá o status do alistamento na área de saída.


📌 Notas
- A idade é calculada com:

 - Formula de calculo de multa:
   - int currentYear = LocasDate.now().getYear();
   - return currentYear - anoNascimento;
      
----------------------------------------------------  
👤 Autor

Desenvolvido por Lucas Braga

📧 Contact: devlucas.braga@gmail.com

📧 www.linkedin.com/in/lucas-braga-4009a32b4
