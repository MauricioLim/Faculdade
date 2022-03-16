
/**
 Maurício Dill de Lima
 */
public class InteiroPositivo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    //item a
    public void setValor(int valor)
    {
        if (valor >= 0) {
            this.x = valor;
        }
    }

    public int getValor(){
        return this.x;
    }

    // item b
    public long multiplicar(InteiroPositivo outro){
        return this.x * outro.getValor();
    }

    public long fatorial(){        
        long fatorial = 1;
        for(int i = this.x; i>0; i--){
            fatorial = fatorial*i;
        }
        return fatorial;
    }

    private long fatorial(int num){
        if (num == 0)
            return 1;
        else 
            return num * fatorial(num-1);
    }

    public String divisoresInteiros(){
        int qtdDivisores = 0, divisor = 1;
        String divisores="";
        while(divisor<=this.x){
            if ((this.x%divisor) ==0){
                divisores += divisor+", ";
                qtdDivisores++;
            }
            divisor++;
        }
        divisores += "Quantidade de Divisores: "+qtdDivisores;
        return divisores;
    }

    public int[] fibonacci(){
        int seq[] = new int[this.x];
        if (this.x > 0){
            seq[0] = 1;
            if (this.x > 1){
                seq[1] = 1;
            }
        }
        for (int i = 2;i < this.x; i++){
            seq[i] = seq[i-2] + seq[i-1];
        }
        return seq;
    }
    
    public double valorH(){
        double H = 0; 
        for (int i = 1; i <= this.x; i++){
            H += (double)1/i;
        }
        return H;
    }
    
    public double valorI(){
        double valor = 0;
        
        
        return valor;
    }
    
    public double valorP(){
        double x = 0;
        double f = 0;
        double calculo = 0;
        int cont = 2;
        
           for (int i = 1; i <= this.x; i++){
               x = cont;
               f = cont;
               while (x > 1){
                    f = f * ( x -1);
                    x--;
                }
                
                if (i%2 == 0 || i==1){
                    calculo += (double)f/i; 
                }
                else{
                    calculo -= (double)f/i;
                }
                cont +=2;
            }
        return calculo;
    }
    

}