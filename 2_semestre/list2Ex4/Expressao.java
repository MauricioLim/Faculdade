public class Expressao {
  /*  private String exp;

    public Expressao(String exp){
        this.exp = exp;
    }
    

    //ITEM B
    public boolean estaCorretaSintaticamente(){
        boolean resultado = true;
        int contPaAb = 0;
        int contPaFe = 0;
        for (int i = 0; i < this.exp.length(); i++) {
            if (this.exp.charAt(i) == '(') {
                contPaAb += 1; 
            }
            if (this.exp.charAt(i) == ')') {
                contPaFe += 1;
            }
        }
        if (contPaAb == contPaFe) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    //ITEM C
    public int getQtdeDivisores(){
        int qtd = 0;

        for (int i = 0; i < this.exp.length(); i++) {
            if (this.exp.charAt(i) == '/') {
                qtd += 1; 
            }
        }
        return qtd;
    }

    //ITEM D
    public int getPosicaoOperador(){
        int test = 0;

        for (int i = 0; i < this.exp.length(); i++) {
            if(this.exp.charAt(i) == '+' || this.exp.charAt(i) == '-' || this.exp.charAt(i) == '*' || this.exp.charAt(i) == '/'){
                test = i;
                i = this.exp.length() - 1;
            }
        }
        if (test == 0) {
            test = -1;
        }

        return test;
    }*/
    public static void main(String[] args) {
        System.out.println("teste");
    }
}