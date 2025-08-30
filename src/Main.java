import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("001","auriculares","musimundo",3455.00);
        Producto p2 = new Producto("002","parlantes","jbl",5678.00);
        Producto p3 = new Producto("003","luces led","Sneider",9087.00);

        ProductoRecord p1Record= new ProductoRecord(p1);
        ProductoRecord p2Record= new ProductoRecord(p2);
        ProductoRecord p3Record= new ProductoRecord(p3);

        Set<ProductoRecord> productosPublico= new HashSet<>();
        productosPublico.add(p1Record);
        productosPublico.add(p2Record);
        productosPublico.add(p3Record);

        for (ProductoRecord p:productosPublico){
            System.out.println(p);
        }


    }
}