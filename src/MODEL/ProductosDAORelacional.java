
package MODEL;

import DAO.ProductosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class ProductosDAORelacional implements ProductosDAO{

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    @Override
    public LinkedList<productosM> ListarP() {
        
    String sql = "SELECT * FROM productos";
        LinkedList<productosM> ListarP = new LinkedList<>();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
//                listar.add(new UsuariosGT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
//            }
        ListarP.add(new productosM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5)));
                  }
          return ListarP;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    
    }

    @Override
    public productosM obtener_productos(int codigo) {
       
    String sql = "select * from productos where codigo= ?";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {

//            vendedoresM vm = new vendedoresM(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            productosM pm = new productosM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5));
            return pm;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            }
            
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    
    
    }

    @Override
    public void crear_productos(productosM producto) {
        
        String sql = "insert into productos (nombre,descripcion,cantidad,precio) values (?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setFloat(4, producto.getPrecio());
            ps.executeUpdate();
             
        } catch (SQLException e) {
            System.out.println(e);
        
        }
    }

    @Override
    public void modificar_productos(productosM producto) {
      
    String sql = "update productos set nombre=?, descripcion=?, cantidad=?, precio=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setFloat(4, producto.getPrecio());
            ps.setInt(5, producto.getCodigo());
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        
        }
    }

    @Override
    public void eliminar_productos(int codigo) {
      
    String sql = "delete from productos where codigo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
