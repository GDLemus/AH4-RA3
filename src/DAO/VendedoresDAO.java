
package DAO;

import MODEL.vendedoresM;
import java.util.LinkedList;

public interface VendedoresDAO {
 
    public LinkedList<vendedoresM> listarV();

    public void crear_vendedor(vendedoresM vendedores);

    public void modificar_vendedor(vendedoresM vendedores);

    public void eliminar(int codigo);

    public vendedoresM obtener(int codigo);
}
