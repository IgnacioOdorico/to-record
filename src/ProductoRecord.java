public record ProductoRecord(String codigo,String nombre, double precio) {
    public ProductoRecord(Producto p) {
        this(p.getCodigo(), p.getNombre(), p.getPrecio());
    }
}
