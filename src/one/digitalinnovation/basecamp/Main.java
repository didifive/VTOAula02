package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 2 de Variáveis, Tipos de Dado e Operadores aritméticos.
 *
 * Opções de tipos:
 *      Textual;
 *      Numeral;
 *      Lógico;
 *      Objeto;
 *
 * Tipo numeral:
 *      byte: -128 até 127;
 *      short: -32.768 até 32.767;
 *      int: -2.147.483.648 até 2.147.483.647;
 *      long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807;
 *      float: +-3.40282347E+38F;
 *      double: +-1.79769313486231570E+308.
 *
 * Tipo textual:
 *      char: caracter de 16-bit unicode;
 *      String: Objeto para textos.
 *
 * Tipo lógico:
 *      boolean: true ou false.
 *
 * Tipo objeto: tipos de dados compostos e mais complexos.
 *
 */
public class Main {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;
        /* A declaração acima gera erro, pois 40000 ultrapassa o limite do tipo de dado short, que é 31.767 */

        //int i1 = -10000000000;
        /* A declaração acima gera erro, pois -10000000000 ultrapassa o limite do tipo de dado int, que é -2.147.483.648 */
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5;
        /* A declaração acima gera erro, pois sem a informação do 'F' após o número é inferido que o tipo de dado é double */
        float f2 = 10.68F;

        double d1 = 85.69;
        /* A declaração acima está normal, pois sem a informação do 'F' após o número é inferido que o tipo de dado é double */
        double d2 = 99.04D;

        char c1 = 'W';
        //char c2 = 'Tw';
        /* A declaração acima gera erro, pois tipo de dado char aceita somente um caractere */
        char c3 = '\u0057';
        /* A declaração acima não irá gerar erro, pois o valor está em código unicode do caractere W*/

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &*¨&%& 75894389";

        //String dt1 = "09/02/1981";
        /* A declaração acima não irá gerar erro, mas existe tipo de dado específico para manipulação de datas, utilizar tipo String pode causar problemas e gerar complexidade */

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}