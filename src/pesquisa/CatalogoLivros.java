package pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

    List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo ,autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
         if(!livroList.isEmpty()){
             for(Livro l : livroList){
                if(l.getAnoPublicacao() >=anoInicial && anoFinal>= l.getAnoPublicacao()){
                    livrosPorIntervalo.add(l);
                }
             }
         }
         return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String [] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("A Dança dos Dragões", "George R. R. Martin", 2011);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert Cecil", 2008);
        catalogoLivros.adicionarLivro("As 48 Leis do Poder", "Robert Greene", 1998);
        catalogoLivros.adicionarLivro("Roube Como um Artista", "Austin Kleon", 2012);


        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 20015));
        //System.out.println(catalogoLivros.pesquisarAutor("J. R. R. Tolkien"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));





    }

}
