import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<questao> questoes;
    private int pontuacao;

    public Quiz() {
        questoes = new ArrayList<>();
        pontuacao = 0;
        inicializarQuestoes();
    }

    private void inicializarQuestoes() {
        // Questão 1
        questao q1 = new questao();
        q1.pergunta = "1. Qual é o único clube brasileiro que nunca foi rebaixado para a segunda divisão do Campeonato Brasileiro?";
        q1.opcaoA = "A) São Paulo";
        q1.opcaoB = "B) Santos";
        q1.opcaoC = "C) Corinthians";
        q1.opcaoD = "D) Palmeiras";
        q1.opcaoE = "E) Cruzeiro";
        q1.correta = "A";
        questoes.add(q1);

        // Questão 2
        questao q2 = new questao();
        q2.pergunta = "2. Qual jogador é o maior artilheiro da história do Campeonato Brasileiro?";
        q2.opcaoA = "A) Pelé";
        q2.opcaoB = "B) Romário";
        q2.opcaoC = "C) Zico";
        q2.opcaoD = "D) Roberto Dinamite";
        q2.opcaoE = "E) Fred";
        q2.correta = "D";
        questoes.add(q2);

        // Questão 3
        questao q3 = new questao();
        q3.pergunta = "3. Qual time é o maior campeão da Copa do Brasil?";
        q3.opcaoA = "A) Cruzeiro";
        q3.opcaoB = "B) Internacional";
        q3.opcaoC = "C) Palmeiras";
        q3.opcaoD = "D) Corinthians";
        q3.opcaoE = "E) Bahia";
        q3.correta = "A";
        questoes.add(q3);

        // Questão 4
        questao q4 = new questao();
        q4.pergunta = "4. Qual estádio é conhecido como 'Templo do Futebol' no Brasil?";
        q4.opcaoA = "A) Maracanã";
        q4.opcaoB = "B) Morumbi";
        q4.opcaoC = "C) Mineirão";
        q4.opcaoD = "D) Beira-Rio";
        q4.opcaoE = "E) Arena Corinthians";
        q4.correta = "A";
        questoes.add(q4);

        // Questão 5
        questao q5 = new questao();
        q5.pergunta = "5. Qual clube brasileiro tem o maior número de títulos internacionais oficiais?";
        q5.opcaoA = "A) Flamengo";
        q5.opcaoB = "B) São Paulo";
        q5.opcaoC = "C) Palmeiras";
        q5.opcaoD = "D) Cruzeiro";
        q5.opcaoE = "E) Grêmio";
        q5.correta = "B";
        questoes.add(q5);

        // Questão 6
        questao q6 = new questao();
        q6.pergunta = "6. Em que ano o Corinthians conquistou seu primeiro Mundial de Clubes?";
        q6.opcaoA = "A) 2000";
        q6.opcaoB = "B) 2005";
        q6.opcaoC = "C) 2010";
        q6.opcaoD = "D) 2012";
        q6.opcaoE = "E) 2015";
        q6.correta = "A";
        questoes.add(q6);

        // Questão 7
        questao q7 = new questao();
        q7.pergunta = "7. Qual jogador é conhecido como 'Divino' no futebol brasileiro?";
        q7.opcaoA = "A) Ronaldinho Gaúcho";
        q7.opcaoB = "B) Rivaldo";
        q7.opcaoC = "C) Rivellino";
        q7.opcaoD = "D) Zico";
        q7.opcaoE = "E) Sócrates";
        q7.correta = "D";
        questoes.add(q7);

        // Questão 8
        questao q8 = new questao();
        q8.pergunta = "8. Qual clube foi campeão da primeira edição da Copa do Brasil em 1989?";
        q8.opcaoA = "A) Grêmio";
        q8.opcaoB = "B) Flamengo";
        q8.opcaoC = "C) Cruzeiro";
        q8.opcaoD = "D) Internacional";
        q8.opcaoE = "E) Vasco";
        q8.correta = "A";
        questoes.add(q8);

        // Questão 9
        questao q9 = new questao();
        q9.pergunta = "9. Qual técnico liderou o Brasil ao tetra campeonato na Copa de 1994?";
        q9.opcaoA = "A) Telê Santana";
        q9.opcaoB = "B) Vanderlei Luxemburgo";
        q9.opcaoC = "C) Carlos Alberto Parreira";
        q9.opcaoD = "D) Luiz Felipe Scolari";
        q9.opcaoE = "E) Zagallo";
        q9.correta = "C";
        questoes.add(q9);

        // Questão 10
        questao q10 = new questao();
        q10.pergunta = "10. Qual jogador marcou o gol de título do Brasil na Copa de 2002?";
        q10.opcaoA = "A) Ronaldo";
        q10.opcaoB = "B) Rivaldo";
        q10.opcaoC = "C) Ronaldinho Gaúcho";
        q10.opcaoD = "D) Kaká";
        q10.opcaoE = "E) Roberto Carlos";
        q10.correta = "A";
        questoes.add(q10);

        // Questão 11
        questao q11 = new questao();
        q11.pergunta = "11. Qual clube detém o recorde de maior invencibilidade no Campeonato Brasileiro?";
        q11.opcaoA = "A) Flamengo - 52 jogos";
        q11.opcaoB = "B) Palmeiras - 46 jogos";
        q11.opcaoC = "C) Cruzeiro - 44 jogos";
        q11.opcaoD = "D) Corinthians - 38 jogos";
        q11.opcaoE = "E) São Paulo - 36 jogos";
        q11.correta = "B";
        questoes.add(q11);

        // Questão 12
        questao q12 = new questao();
        q12.pergunta = "12. Qual jogador brasileiro foi eleito o melhor do mundo por três vezes consecutivas?";
        q12.opcaoA = "A) Pelé";
        q12.opcaoB = "B) Ronaldo";
        q12.opcaoC = "C) Ronaldinho Gaúcho";
        q12.opcaoD = "D) Kaká";
        q12.opcaoE = "E) Neymar";
        q12.correta = "C";
        questoes.add(q12);

        // Questão 13
        questao q13 = new questao();
        q13.pergunta = "13. Qual clube brasileiro foi fundado mais recentemente?";
        q13.opcaoA = "A) Red Bull Bragantino";
        q13.opcaoB = "B) Athletico Paranaense";
        q13.opcaoC = "C) Fortaleza";
        q13.opcaoD = "D) Cuiabá";
        q13.opcaoE = "E) Juventude";
        q13.correta = "A";
        questoes.add(q13);

        // Questão 14
        questao q14 = new questao();
        q14.pergunta = "14. Qual destes clubes NÃO faz parte dos 12 grandes do futebol brasileiro?";
        q14.opcaoA = "A) Coritiba";
        q14.opcaoB = "B) Botafogo";
        q14.opcaoC = "C) Atlético-PR";
        q14.opcaoD = "D) Goiás";
        q14.opcaoE = "E) Guarani";
        q14.correta = "D";
        questoes.add(q14);

        // Questão 15
        questao q15 = new questao();
        q15.pergunta = "15. Qual jogador detém o recorde de gols em uma única edição do Campeonato Brasileiro?";
        q15.opcaoA = "A) Pelé - 34 gols";
        q15.opcaoB = "B) Romário - 30 gols";
        q15.opcaoC = "C) Dadá Maravilha - 29 gols";
        q15.opcaoD = "D) Roberto Dinamite - 28 gols";
        q15.opcaoE = "E) Fred - 27 gols";
        q15.correta = "B";
        questoes.add(q15);
    }

    public void iniciar() {
        Cabecalho.exibir();
        System.out.println("Bem-vindo ao Quiz de Futebol Brasileiro!");
        System.out.println("Você responderá a 15 questões sobre a história do futebol no Brasil. Boa sorte!");
        System.out.println();

        for (questao q : questoes) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        exibirResultado();
    }

    private void exibirResultado() {
        System.out.println("============================================");
        System.out.println("Quiz concluído!");
        System.out.println("Sua pontuação final: " + pontuacao + "/" + questoes.size());
        double percentual = (double) pontuacao / questoes.size() * 100;
        System.out.printf("Percentual de acertos: %.1f%%\n", percentual);

        if (percentual >= 80) {
            System.out.println("Excelente! Você é um verdadeiro conhecedor do futebol brasileiro!");
        } else if (percentual >= 60) {
            System.out.println("Bom trabalho! Você conhece bem o futebol brasileiro!");
        } else if (percentual >= 40) {
            System.out.println("Você pode melhorar! Assista mais jogos e estude a história!");
        } else {
            System.out.println("Hora de maratonar os clássicos e documentários sobre futebol!");
        }
        System.out.println("============================================");
    }
}