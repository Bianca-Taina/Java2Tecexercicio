public class filme {

    public static void main(String[] args) {
        System.out.println("Bem vindos ao TecFlix");
        System.out.println("The Vampire Diaries");

        int anoDeLancamento = 2009;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.7;
        // Média calculada pelas notas do Luiz, Rafael e Renan
        double media = (6.6 + 9.5 + 10) / 3;
        System.out.println("A média que o Segundo Tec deu " + media);

        String sinopse;

        sinopse = """
                Filme do The Vampire Diaries
                Estrelado por Julie Plec e Kevin Williamson
                O filme tem nota alta
                e foi lançado em
                """ + anoDeLancamento;

        System.out.println(sinopse);        
    }
}