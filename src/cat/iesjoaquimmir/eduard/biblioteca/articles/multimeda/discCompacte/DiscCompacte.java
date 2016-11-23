
package cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda.discCompacte;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;
import cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda.Multimedia;
import java.util.Locale;

public class DiscCompacte extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String ismn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
      public String getIsmn() {
        return ismn;
    }
    private void setIsmn(String ismn) {
        this.ismn = ismn;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public DiscCompacte(String titol,String autor,String duracio,Categoria categoria,String ismn){
        super(titol,autor,duracio,categoria);
        this.setIsmn(ismn);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objectes">
      @Override
        public String toString() {
            return String.format("----CD----%n%sISMN:%s%n",super.toString(),getIsmn());
        }
//</editor-fold>
//</editor-fold>

  
  
}
