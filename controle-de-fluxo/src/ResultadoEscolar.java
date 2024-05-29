public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        // String resultado = nota >= 7 ? "Aprovado" : nota>= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }
}

// Ex. anterior de condicional encadeadas: 

        //if (nota >= 7)//true
        //System.out.println("Aprovado");

        //else if (nota >= 5 && nota < 7)//true ou false
       //System.out.println("Prova de Recuperação");

        //else
       // System.out.println("Reprovado");