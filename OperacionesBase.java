public class OperacionesBase {
    public OperacionesBase(int usuario, int interfaz, int modelos, int memoria, int categoria) {
        this.usuario = usuario;
        this.interfaz = interfaz;
        this.modelos = modelos;
        this.memoria = memoria;
        this.categoria = categoria;
    }
    private int usuario;
    private int interfaz;
    private int modelos;
    private int memoria;
    private int categoria;

    public OperacionesBase() {
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(int interfaz) {
        this.interfaz = interfaz;
    }

    public int getModelos() {
        return modelos;
    }

    public void setModelos(int modelos) {
        this.modelos = modelos;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
