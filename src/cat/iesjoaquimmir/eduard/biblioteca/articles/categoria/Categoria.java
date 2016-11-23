package cat.iesjoaquimmir.eduard.biblioteca.articles.categoria;
public enum Categoria {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    I("Infantil"),
    J("Juvenil"),
    A("Adult");
    private final String categoria;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Contructors">
    Categoria(String categoria) {
        this.categoria = categoria;

    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
    public String getMessage() {
        return categoria;
    }
//</editor-fold>
//</editor-fold>



}
