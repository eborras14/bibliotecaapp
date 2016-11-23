
package cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio.revistes;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;
import cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio.Publicacions;

public class Revistes extends Publicacions {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String issn;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }
 
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Revistes (String titol,String autor,Categoria categoria,int num_pagines,String issn){
        super(num_pagines,titol,autor,categoria);
        this.setIssn(issn);
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
     @Override
        public String toString() {
            return String.format("----Revista----%n%sISSN:%s%n",super.toString(),getIssn());
        }
//</editor-fold>
//</editor-fold>

   

}
