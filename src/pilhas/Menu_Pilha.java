package pilhas;

import java.util.Scanner;

public class Menu_Pilha {

    Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        Menu_Pilha M = new Menu_Pilha();
        M.menu();
        M.estrutura();
    }

    void menu() {
        System.out.print("\nESCOLHA UMA op��o\n");
        System.out.println(
                "1 - Empilhar Pilha 1"
                + "\n2 - Desempilhar Pilha 1"
                + "\n3 - Mostrar pilha 1"
                + "\n4 - Topo da Pilha 1"
                + "\n5 - Palindrome"
                + "\n6 - Primeiro elemento Pilha 1"
                + "\n7 - Empilhar lista 2"
                + "\n8 - Mostrar pilha 2"
                + "\n9 - Desempilhar pilha 2"
                + "\n10 - Topo da Pilha 2"
                + "\n11 - Primeiro elemento Pilha 1"        
                + "\n12 - Concatenar Pilhas"
                + "\n13 - Inverter Lista 1"
                + "\n14 - Binario"
                + "\n15 - Hexadecimal"
                + "\n16 - Experiencia 2L"
                + "\n17 - Converter in-fixa em pós-fixa."
                + "\n18 - Converter in-fixa em pré-fixa."
                + "\n19 - Verificar parentização de uma expressão aritmética."
                + "\n20 - Torre de Hanoi."
                + "\n21 - Pilhas Multiplas."
                + "\n0 - Sair");
        System.out.print("Opção: ");

    }

    void estrutura() {
        Metodos_pilha Lm1 = new Metodos_pilha();
        Metodos_pilha Lm2 = new Metodos_pilha();
        Lm1.iniciaPilha(Lm1);
        Lm2.iniciaPilha(Lm2);

        int op = leia.nextInt();
        while (op != 0) {
            if (op == 1) {
                System.out.println("Insira algo na pilha 1:");
                String e1 = leia.next();
                Lm1.empilhar(Lm1, e1);
            }
            if (op == 2) {
                System.out.println("Desimpilhando da pilha 1:");
                Lm1.desempilhar_p1(Lm1);
            }
            if (op == 3) {
                Lm1.mostrar_P1(Lm1);
            }
            if (op == 4) {
                System.out.println("Topo da Pilha 1");
                System.out.println(Lm1.ultimo_ele(Lm1));
            }
            if (op == 5) {
                System.out.println("Verificando se a Pilha é palíndrome\n");
                System.out.println(((Lm1.palindrome(Lm1)) ? "É " : "Não é ") + "palíndrome");
                System.out.println("\n");
            }
            if (op == 6) {
                System.out.println("Primeiro elemento da pilha 1");
                System.out.println(Lm1.Primeiro_ele(Lm1));
            }
            if (op == 7) {
                System.out.println("Insira algo na pilha 2:");
                String e2 = leia.next();
                Lm2.empilhar(Lm2, e2);
            }
            if (op == 8) {
                Lm2.mostrar_P1(Lm2);
            }
            if (op == 9) {
                System.out.println("Desimpilhando da pilha 2:");
                Lm2.desempilhar_p2(Lm2);
            }
            if (op ==10){
                System.out.println("Topo da Pilha 2");
                System.out.println(Lm2.ultimo_ele(Lm2));
                
            }
            if (op == 11){
                System.out.println("Primeiro elemento da Pilha 2");
                System.out.println(Lm2.Primeiro_ele(Lm2));
            }
            if (op == 12) {
                System.out.println("Concatenação de Listas\n");
                Lm1.Concatenar(Lm1, Lm2);
            }
            if (op == 13) {
                System.out.println("Inverter Lista 1\n");
                Lm1.InverterLista(Lm1);
            }
            if (op == 14) {
                System.out.println("Decimal para binario....");
                Lm1.binario(Lm1);
            }
            if (op == 15) {
                System.out.println("Decimal para hexadecimal....");
                Lm1.Hexadecimal(Lm1);
            }
            if (op == 16) {
                System.out.println("Experiência");
                Lm1.DoisL(Lm1);
            }
            if (op == 17) {
                System.out.print("Digite uma sequencia in-fixa: ");
                String teste = new Scanner(System.in).nextLine();
                char[] vetor = teste.toCharArray();
                char teste1[] = new char[teste.length()+1];
                for (int i = 0; i < vetor.length; i++) {
                    teste1[i]=vetor[i];
                }
                
                Lm1.PosFixa(teste1);
                for (int i = 0; i < Lm1.pre.length; i++) {
                    if (Lm1.pre[i] != '\0') {
                        System.out.print(Lm1.pre[i]);
                    }
                }
            }
            if (op == 18) {
                System.out.print("Digite uma sequencia in-fixa: ");
                String teste = new Scanner(System.in).nextLine();
                char teste1[] = teste.toCharArray();
                Lm1.PreFixa(teste1);
            }
            if (op == 19) {
                System.out.println("Verificar parentização de uma expressão aritmética");
                if (Lm1.Sintatica()) {
                    System.out.println("Expressão correta");
                } else {
                    System.out.println("Expressão incorreta");
                }
            }
            if (op == 20){
                System.out.println("Torre de Hanoi");
                Lm1.hanoi(3, 1, 3, 2);
            }
            if (op == 21){
                System.out.println("Pilhas Multiplas: Cada pilha Tem Tamanho Maximo 5");
                Lm1.PilhasMultiplas();
            }
            menu();
            op = leia.nextInt();
        }
    }

}
