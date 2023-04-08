package hash;

import java.util.ArrayList;

import javax.swing.text.TabExpander;

public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
            int posição= calcularposicação(chave);
            if (tabela[posição] == null){
                tabela[posição] =  chave;
                return true;
                }
             else  {
               if (tabela[posição].equals(chave)){
                return false;
               }    
            }
           
        // TODO quando inserir, se a posição estiver ocupada,
        // o elemento NÃO é inserido e retorna false. Caso contrário, o elemento é inserido na posição calculada e retorna true.

        return false;
    }

    @Override
    public boolean delete(int chave) {
        int posição= calcularposicação(chave);
        if (tabela[posição]!= null && tabela[posição].equals(chave)){
            tabela[posição] = null;
            return true;
        }
        else {
            return false;
        }
        // TODO quando inserir, se a posição estiver ocupada, torna o elemento da posição como null e retorna true. Caso contrário, retorna false.
        
        
    }

    @Override
    public boolean search(int chave) {
        // TODO se a posição estiver ocupada e valor é o mesmo 
        // (ou seja, tem que ser ambos), retorna true. Caso contrário, retorna true.
        int posição = calcularposicação(chave);
        if(tabela[posição] != null && tabela[posição].equals(chave)){
                return true;

        }
        else {

        
            return false;

        }
        
    }
    public int  calcularposicação(int chave ){
        int calculo = chave % 1000;
        return calculo ;
    }
    

    }

