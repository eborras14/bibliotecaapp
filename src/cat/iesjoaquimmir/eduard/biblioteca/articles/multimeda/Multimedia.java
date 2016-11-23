package cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda;
import cat.iesjoaquimmir.eduard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;

public abstract class Multimedia extends Articles {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String duracio;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
      public String getDuracio() {
        return duracio;
    }
    public void setDuracio(String duracio) {
        this.duracio = duracio;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Multimedia(String duracio,String titol,String autor,Categoria categoria){
         super(titol,autor,categoria);
         this.setDuracio(duracio);
     }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
      @Override
        public String toString() {
        return String.format("%sDuracio:%s%n",super.toString(),getDuracio());
        }

    
//</editor-fold>
//</editor-fold>

  
  
  
}
