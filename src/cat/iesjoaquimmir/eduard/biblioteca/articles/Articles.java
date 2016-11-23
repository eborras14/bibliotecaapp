
package cat.iesjoaquimmir.eduard.biblioteca.articles;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;
import cat.iesjoaquimmir.eduard.biblioteca.articles.inarticles.InArticle;

public abstract class Articles implements InArticle {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String titol;
    private String autor;
    private Categoria categoria;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getTitol() {
        return titol;
    }
    private void setTitol(String titol) {
        this.titol = titol;
    }
    public String getAutor() {
        return autor;
    }
    private void setAutor(String autor) {
        this.autor = autor;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Articles(String titol,String autor,Categoria categoria){
         this.setTitol(titol);
         this.setAutor(autor);
         this.setCategoria(categoria);
        }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
    @Override
    public String toString() {
        return String.format("Titol:%s%nAutor:%s%nCategoria:%s%n",getTitol(),getAutor(),categoria.getMessage());
    }   
//</editor-fold>
//</editor-fold>

   

   
}
