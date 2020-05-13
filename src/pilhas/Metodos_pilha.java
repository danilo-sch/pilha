package pilhas;

import java.util.Scanner;

public class Metodos_pilha {

    int qntd;
    int topo;
    int m = 10;
    int prefix;
    String[] vetor = new String[m];
    char pre[] = new char[10];

    void iniciaPilha(Metodos_pilha p) {
        p.topo = -1;
        qntd = 0;

    }

    private void iniciaPrefix(int m) {
        pre = new char[m];
    }

    void empilhar(Metodos_pilha P, String elemento) {
        if (topo == m) {
            System.out.println("Erro! – Pilha cheia");
        } else {
            topo++;
            vetor[topo] = elemento;
            qntd++;
        }

    }

    void desempilhar_p1(Metodos_pilha P) {
        if (topo == -1) {
            System.out.println("Pillha Vazia");
        } else {
            topo--;
            qntd--;
        }
    }

    void desempilhar_p2(Metodos_pilha P) {
        if (topo == -1) {
            System.out.println("Pillha Vazia");
        } else {
            topo--;
            qntd--;
        }
    }

    void mostrar_P1(Metodos_pilha p) {
        System.out.println("Items da pilha");
        for (int i = topo; i >= 0; i--) {
            if (vetor[i] != null) {
                System.out.println(vetor[i]);
            }
        }
    }

    String ultimo_ele(Metodos_pilha P) {
        //System.out.println("Elemento do topo: " + vetor[P.topo]);
        return vetor[P.topo];
    }

    String Primeiro_ele(Metodos_pilha P) {
        //System.out.println("Primeiro elemento: " + vetor[0]);
        return vetor[0];
    }

    public void Concatenar(Metodos_pilha Lm1, Metodos_pilha Lm2) {
        Metodos_pilha Lm3 = new Metodos_pilha();
        for (int i = 0; i <= Lm1.qntd - 1; i++) {
            Lm3.empilhar(Lm3, Lm1.vetor[i]);
        }
        for (int i = 0; i <= Lm2.qntd - 1; i++) {
            Lm3.empilhar(Lm3, Lm2.vetor[i]);
        }
        System.out.print("Lista concatenada:  ");
        Lm3.mostrar_P1(Lm3);
    }

    public boolean palindrome(Metodos_pilha P) {
        StringBuilder s1 = new StringBuilder("");
        for (String s : P.vetor) {
            if (s != null) {
                s1.append(s);
            }
        }
        return s1.toString().equals(s1.reverse().toString());
    }

    public void InverterLista(Metodos_pilha P) {
        Metodos_pilha pilhaAux = new Metodos_pilha();
        for (int i = P.qntd - 1; i >= 0; i--) {
            pilhaAux.empilhar(P, P.vetor[i]);
        }
        P.vetor = pilhaAux.vetor;
        System.out.print("Lista invertida:  ");
        pilhaAux.mostrar_P1(pilhaAux);
    }

    public void binario(Metodos_pilha P) {
        System.out.println("Informe o numero que deseja transformar");
        int numero = new Scanner(System.in).nextInt();
        String a = Integer.toBinaryString(numero);
        System.out.println("Número: " + a);
    }

    public void Hexadecimal(Metodos_pilha P) {
        int numero;
        System.out.println("Informe o numero que deseja transformar");
        numero = new Scanner(System.in).nextInt();
        String a = Integer.toHexString(numero);
        System.out.println("Número: " + a);
    }

    public void DoisL(Metodos_pilha P) {
        Metodos_pilha L4 = new Metodos_pilha();
        Metodos_pilha L5 = new Metodos_pilha();
        L4.m = 4;
        L5.m = 5;
        L4.iniciaPilha(L4);
        L5.iniciaPilha(L5);
        for (int i = 0; i < 5; i++) {
            L4.empilhar(L4, "0");
        }
        for (int i = 0; i < 6; i++) {
            L5.empilhar(L5, "0");
        }
        L5.iniciaPilha(L5);
        L4.iniciaPilha(L4);
        Print(L4.vetor, L5.vetor);

        System.out.println("Enche Garrafa de 5L:");
        L5.iniciaPilha(L5);
        for (int i = 0; i < 6; i++) {
            L5.empilhar(L5, "1");
        }
        Print(L4.vetor, L5.vetor);
        System.out.println("Passa Conteudo da Garrafa de 5L para a de 4L:");
        L5.iniciaPilha(L5);
        L5.empilhar(L5, "1");
        for (int i = 0; i < 5; i++) {
            L5.empilhar(L5, "0");
        }
        L4.iniciaPilha(L4);
        for (int i = 0; i < 5; i++) {
            L4.empilhar(L5, "1");
        }
        Print(L4.vetor, L5.vetor);
        System.out.println("Elimina o conteudo da garrafa de 4L:");
        L4.iniciaPilha(L4);
        for (int i = 0; i < 5; i++) {
            L4.empilhar(L5, "0");
        }
        Print(L4.vetor, L5.vetor);
        System.out.println("Passa o conteudo da garrafa de 5L para a de 4L:");
        L5.iniciaPilha(L5);
        L5.empilhar(L5, "0");
        L4.iniciaPilha(L4);
        L4.empilhar(L4, "1");
        Print(L4.vetor, L5.vetor);
        System.out.println("Enche garrafa de 5L:");
        L5.iniciaPilha(L5);
        for (int i = 0; i < 6; i++) {
            L5.empilhar(L5, "1");
        }
        Print(L4.vetor, L5.vetor);
        System.out.println("Passa o conteudo da garrafa de 5L para a de 4L:");
        for (int i = 0; i < 4; i++) {
            L4.empilhar(L5, "1");
        }
        L5.iniciaPilha(L5);
        L5.empilhar(L5, "1");
        L5.empilhar(L5, "1");
        for (int i = 0; i < 3; i++) {
            L5.empilhar(L5, "0");
        }
        Print(L4.vetor, L5.vetor);
        System.out.println("Completo!");
    }

    private void Print(String vetor1[], String vetor2[]) {
        System.out.println("     _ ");
        System.out.println(" _  / \\");
        System.out.println("/ \\ |" + vetor2[4] + "|");
        System.out.println("|" + vetor1[3] + "| |" + vetor2[3] + "|");
        System.out.println("|" + vetor1[2] + "| |" + vetor2[2] + "|");
        System.out.println("|" + vetor1[1] + "| |" + vetor2[1] + "|");
        System.out.println("|" + vetor1[0] + "| |" + vetor2[0] + "|");
    }

    public void PosFixa(char expr[]) {
        Metodos_pilha p = new Metodos_pilha();
        int i = 0, pref = 0;
        char c, t;
        iniciaPrefix(expr.length);

        p.iniciaPilha(p);
        p.empilhar(p, "(");

        do {

            c = expr[i];
            i++;
            if (c >= 'a' && c <= 'z') {
                //System.out.printf("%c", c);
                pre[pref] = c;
                pref++;
            } else if (c == '(') {
                p.empilhar(p, "(");
            } else if (c == ')' || c == '\0') {
                do {
                    t = p.vetor[p.topo].charAt(0);
                    p.desempilhar_p1(p);
                    if (t != '(') {
                        //System.out.printf("%c", t);
                        pre[pref] = t;
                        pref++;
                    }
                } while (t != '(');
            } else if (c == '+' || c == '-'
                    || c == '*' || c == '/'
                    || c == '^') {
                while (true) {

                    t = p.vetor[p.topo].charAt(0);
                    p.desempilhar_p1(p);
                    if (Prioridade(c, t)) {
                        p.empilhar(p, "" + t);
                        p.empilhar(p, "" + c);
                        break;
                    } else {
                        //System.out.printf("%S", t);
                        pre[pref] = t;
                        pref++;
                    }
                }
            }
        } while (c != '\0');
        prefix = pref;
        System.out.println("");
    }

    private boolean Prioridade(char c, char t) {
        int pc = 0, pt = 0;

        if (c == '^') {
            pc = 4;
        } else if (c == '*' || c == '/') {
            pc = 2;
        } else if (c == '+' || c == '-') {
            pc = 1;
        } else if (c == '(') {
            pc = 4;
        }

        if (t == '^') {
            pt = 3;
        } else if (t == '*' || t == '/') {
            pt = 2;
        } else if (t == '+' || t == '-') {
            pt = 1;
        } else if (t == '(') {
            pt = 0;
        }
        if (pc > pt) {
            return true;
        }
        return false;
    }

    public void PreFixa(char expr[]) {
        char teste[] = new char[expr.length + 1];
        int count = expr.length - 1;
        for (int i = 0; i < expr.length; i++) {
            if (expr[count] == '(') {
                teste[i] = ')';
                count--;
            } else if (expr[count] == ')') {
                teste[i] = '(';
                count--;
            } else {
                teste[i] = expr[count];
                count--;
            }
        }
        PosFixa(teste);
        char teste2[] = new char[prefix];
        for (int i = 0; i < teste2.length; i++) {
            teste2[i] = pre[i];
        }
        char teste3[] = new char[teste2.length];
        int q = 0;
        for (int i = teste2.length - 1; i >= 0; i--) {
            teste3[q] = teste2[i];
            q++;
        }
        for (int i = 0; i < teste2.length; i++) {
            System.out.print(teste3[i]);
        }
    }

    public boolean Sintatica() {
        Metodos_pilha p = new Metodos_pilha();
        p.iniciaPilha(p);
        System.out.println("Digite uma expressão aritmética!");
        String exp = new Scanner(System.in).nextLine();

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(') {
                p.empilhar(p, "" + exp.charAt(i));
            } else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {
                if (p.topo == -1) {
                    return false;
                } else if (exp.charAt(i) == ')' && p.ultimo_ele(p).equals("(")) {
                    p.desempilhar_p1(p);
                    //calcular
                } else if (exp.charAt(i) == ']' && p.ultimo_ele(p).equals("[")) {
                    p.desempilhar_p1(p);
                    //calcular
                } else if (exp.charAt(i) == '}' && p.ultimo_ele(p).equals("{")) {
                    p.desempilhar_p1(p);
                    //calcular
                } else if (Character.isAlphabetic(exp.charAt(i)) || exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                } else {
                    p.mostrar_P1(p);
                    return false;
                }
            }
        }
        if (p.topo == -1) {
            return true;
        }
        p.mostrar_P1(p);
        return false;

    }
    
    public void hanoi(int n, int O, int D, int T) {
        
        if (n > 0) {
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
        }
 
    }
    
    private void mover(int O, int D) {
        String Origem="", Destino="";
        if(O == 1)
            Origem = "Pino 1";
        if(O == 2)
            Origem = "Pino 2";
        if(O == 3)
            Origem = "Pino 3";
        if(D == 1)
            Destino = "Pino 1";
        if(D == 2)
            Destino = "Pino 2";
        if(D == 3)
            Destino = "Pino 3";
        
        System.out.println(Origem + " -> " + Destino);
    }
    
    public void PilhasMultiplas(){
        String[] vetorM = new String[10];
        int topoM2=9,top1=-1,top2=4;
        do{
            System.out.println("1 - Empilhar Pilha 1"
                    + "\n2 - Empilhar Pilha 2"
                    + "\n3 - Desmpilhar Pilha 1"
                    + "\n4 - Desempilhar Pilha 2"
                    + "\n5 - Mostrar Pilhas Multiplas"
                    + "\n6 - Sair"
                    + "\nSelenione uma Opção!"); 
            int op=new Scanner(System.in).nextInt();
          switch(op){
              case 1:
                  if (top1 == 4) {
                System.out.println("Erro! – Pilha cheia");
                } else {
                    System.out.print("Digite o elemento:");
                    String elemento = new Scanner(System.in).nextLine();
                    top1++;
                    vetorM[top1] = elemento;
                    
              
                } 
                  break;
              case 2:
                  if(top2 == topoM2){
                  System.out.println("Erro! – Pilha cheia");  
                  } else{
                    System.out.print("Digite o elemento:");
                    String elemento = new Scanner(System.in).nextLine();
                    top2++;
                    vetorM[top2] = elemento;
                       
                  }
                  break;
              case 3:
                  if(top1==-1){
                      System.out.println("Pilha Vazia!");
                  }else{
                      top1--;
                  }
                  break;
              case 4:
                  if(top2==4){
                      System.out.println("Pilha Vazia!");
                  }else{
                      top2--;
                  }
                  break;
              case 5:
                  System.out.println("Itens no Array:");
                  for (int i = top2; i >=5 ; i--) 
                      System.out.println(vetorM[i]);
                  for (int i = top1; i >= 0; i--) {
                      System.out.println(vetorM[i]);
                  }
          }  
        }while(true);
        
        
    
}
}
