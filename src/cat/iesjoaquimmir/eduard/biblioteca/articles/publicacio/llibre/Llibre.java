package cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio.llibre;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;
import cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio.Publicacions;
public class Llibre extends Publicacions{
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String isbn;

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getIsbn() {
        return isbn;
    }
    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Llibre (String titol,String autor,Categoria categoria,int num_pagines,String isbn){
        super(num_pagines,titol,autor,categoria);
        this.setIsbn(isbn);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
      @Override
      public String toString() {
        return String.format("----Llibre----%n%sISBN:%s%n",super.toString(),getIsbn());
      }
//</editor-fold>
//</editor-fold>

    


}
