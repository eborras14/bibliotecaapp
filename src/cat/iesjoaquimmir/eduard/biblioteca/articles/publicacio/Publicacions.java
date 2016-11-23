
package cat.iesjoaquimmir.eduard.biblioteca.articles.publicacio;
import cat.iesjoaquimmir.eduard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.eduard.biblioteca.articles.categoria.Categoria;

public abstract class Publicacions extends Articles {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
     private int num_pagines;

   
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="Metodes">
     //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getNum_pagines() {
        return num_pagines;
    }
    private void setNum_pagines(int num_pagines) {
        this.num_pagines = num_pagines;
    }
//</editor-fold>
     //<editor-fold defaultstate="collapsed" desc="Contructors">
     public Publicacions(int num_pagines,String titol,String autor,Categoria categoria){
         super(titol,autor,categoria);
         this.setNum_pagines(num_pagines);
     }
     //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
       @Override
        public String toString() {
            return String.format("%sNum.pagines:%d%n",super.toString(),getNum_pagines());
        }
//</editor-fold>
//</editor-fold>
//</editor-fold>

  

}
