package solid.exception;

public class SolidException extends Exception {

    private int codigo;
    
    public SolidException() {
        super();
    }

    public SolidException(String mensaje) {
        super(mensaje);
    }

    public SolidException(String mensaje, int codigo) {
        super(mensaje);
        this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}