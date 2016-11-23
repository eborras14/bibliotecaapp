package cat.iesjoaquimmir.eduard.biblioteca;
import cat.iesjoaquimmir.eduard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;
import cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda.discCompacte.DiscCompacte;
import cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda.discVersatilDigital.DiscVersatilDigital;
import cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio.llibre.Llibre;
import cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio.revistes.Revistes;
import java.util.ArrayList;

public class Aplication {
    public static void main(String[] args) {
       int i;
       ArrayList<Articles> articles = new ArrayList<Articles>();
       DiscCompacte a0 = new DiscCompacte("Mis grandes éxitos", "Luis Miguel","65", Categoria.A, "04900009");
       DiscVersatilDigital a1 = new DiscVersatilDigital("Bamby", "Walt Disney","89", Categoria.I, "90843089");
       DiscVersatilDigital a2 = new DiscVersatilDigital("Crepusculo", "Warner","129", Categoria.J,"480980983");
       Llibre a3 = new Llibre("Llibre1","Autor1",Categoria.A,456,"1234567");
       Revistes a4 = new Revistes ("Revista1","Autor2",Categoria.J,30,"123123"); 
       articles.add(a0);
       articles.add(a1);
       articles.add(a2);
       articles.add(a3);
       articles.add(a4);
       for(i=0;i<articles.size();i++){
         System.out.printf("%s",articles.get(i).toString());
       }
       
    }
}
