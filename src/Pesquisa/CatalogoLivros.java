package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> LivrosList = new ArrayList<>();

    public CatalogoLivros(){
        this.LivrosList = new ArrayList<>();
    }

    public void Adicionar(String titulo, String autor, int anoPublicacao ){
        LivrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        
        List<Livro> ListaAutor = new ArrayList<>();
        
        if(!LivrosList.isEmpty()){
            for(Livro l : LivrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    ListaAutor.add(l);
                }
            }
        }

        return ListaAutor; 
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        
        List<Livro> ListaIntervalo = new ArrayList<>();
        
        if(!LivrosList.isEmpty()){
            for(Livro l : LivrosList){
                if(l.getAnoPublicacao() >= anoInicial
                && l.getAnoPublicacao() <= anoFinal){
                    ListaIntervalo.add(l);
                }
            }
        }

        return ListaIntervalo; 
    }


    public String pesquisarPorIntervaloAnos(String titulo){                
        
        String livro = "";

        if(!LivrosList.isEmpty()){
            for(Livro l : LivrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l.toString();
                    break;
                }
            }
        }

        return livro;
    }

}
