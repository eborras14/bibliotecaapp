
package cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda.discVersatilDigital;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;
import cat.iesjoaquimmir.eduard.biblioteca.articles.multimeda.Multimedia;

public class DiscVersatilDigital extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String isan;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
      public String getIsan() {
        return isan;
      }
      public void setIsan(String isan) {
        this.isan = isan;
       }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
      public DiscVersatilDigital(String titol,String autor,String duracio,Categoria categoria,String isan){
        super(titol,autor,duracio,categoria);
        this.setIsan(isan);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
       @Override
        public String toString() {
            return String.format("----DVD----%n%sISAN:%s%n",super.toString(),getIsan());
        }
//</editor-fold>
//</editor-fold>

   

 
}
