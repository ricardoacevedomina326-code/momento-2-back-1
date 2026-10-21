public class IOperaciones {
    public IOperaciones() {
    }
    public IOperaciones(int interfaces, int guardar, int buscar, int eliminar) {
        this.interfaces = interfaces;
        this.guardar = guardar;
        this.buscar = buscar;
        this.eliminar = eliminar;
    }
    private int interfaces;
    public int guardar;
    public int buscar;
    public int eliminar;
    public int getInterfaces() {
        return interfaces;
    }
    public void setInterfaces(int interfaces) {
        this.interfaces = interfaces;
    }
    public int getGuardar() {
        return guardar;
    }
    public void setGuardar(int guardar) {
        this.guardar = guardar;
    }
    public int getBuscar() {
        return buscar;
    }
    public void setBuscar(int buscar) {
        this.buscar = buscar;
    }
    public int getEliminar() {
        return eliminar;
    }
    public void setEliminar(int eliminar) {
        this.eliminar = eliminar;
    }
}
