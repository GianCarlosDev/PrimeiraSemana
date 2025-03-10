package gian.exercicioIncode.diretorios.primeiraSemana;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int inteiros = 32000;
        double reais = 1000;
        float reaisMenosCasasDecimais = 120.0F;
        long numLongo = 920183231L;
        short num = 5000;
        byte numCurto = 127;
        char letra = 'A';
        boolean verFalso = true;

        System.out.println("tipos booleano verdadeiro ou falso: " + "boolean " + verFalso);
        System.out.println("tipo caractere : " + "char " + letra);
        System.out.println("numero do tipo inteiro muito curto: " + "byte " +  numCurto);
        System.out.println("numero do tipo inteiro curto: " + "short " + num);
        System.out.println("numero do tipo inteiro: " + "int " + inteiros);
        System.out.println("numero do tipo real com mais casas decimais: " + "double " +  reais);
        System.out.println(" numero do tipo real com menos casas decimais: " + "float " + reaisMenosCasasDecimais);
        System.out.println("numero longo: " + "long " + numLongo);
    }
}
