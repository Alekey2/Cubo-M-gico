import java.util.Scanner;
public class Ex7 
{
    
        static boolean QuadradoMagico (int matriz[][],int lc)
        {
            Scanner sc = new Scanner(System.in);
            int somalinhas=0;
            int somacolunas=0;
            int somadiagonalp=0;
            int somadiagonals=0;

            for(int l=0;l<lc;l++)
            {
                for(int c=0;c<lc;c++)
                {
                    System.out.println("Digite o valor do elemento da Linha " +l+ " Coluna "+c);
                    matriz[l][c]=sc.nextInt();
                }
            }

            for(int l=0;l<lc;l++)
            {
                for(int c=0;c<lc;c++)
                {
                    somalinhas+=l;
                    somacolunas+=c;
                    if(l==c)
                    {
                        somadiagonalp+=matriz[l][c];
                        
                    }
                    if(l+c==lc-1)
                    {
                        somadiagonals+=matriz[l][c];
                        
                    }
                }
            }


            boolean Quadrado = false ;
            for(int l=0;(l<lc) && (Quadrado==true);l++)
            {
                for(int c=0;(c<l) && (Quadrado==true);c++)
                {
                    if(somalinhas==somacolunas && somalinhas==somadiagonalp && somalinhas==somadiagonals
                     && somacolunas==somadiagonalp && somacolunas==somadiagonals && somadiagonalp==somadiagonals) 
                    {
                        Quadrado=true;
                        
                    }
                    else{
                        Quadrado=false;
                    }
    
                }
    
            }

            if(Quadrado==true)
            {
                System.out.println("\nA matriz abaixo é um Quadrado Mágico");
            }
            else
            {
                Quadrado=false;
                System.out.println("\nA matriz abaixo não é Quadrado Mágico");
            }
            System.out.println("dp"+somadiagonalp);
            System.out.println("ds"+somadiagonals);
            System.out.println("l"+somalinhas);
            System.out.println("c"+somacolunas);
            sc.close();
            return(Quadrado);
        }
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o tamanho da Matriz: \n");
            System.out.println("Digite a quantidade de Linhas e Colunas para essa matriz: ");
            int lc = 3;


            int matriz[][]= new int [lc][lc];

            boolean receba = QuadradoMagico(matriz, lc);

            for(int l=0;l<lc;l++)
            {
            for(int c=0;c<lc;c++)
            {
                System.out.print(matriz[l][c]+"\t");
                
            }
            System.out.println("");
            }

            System.out.println("\n"+receba);
            sc.close();
        
        }
}