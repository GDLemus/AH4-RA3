
package MODEL;

import DAO.SucursalesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class SucursalesDAORelacional implements SucursalesDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    @Override
    public LinkedList<sucursalesM> ListarS() {
    
        String sql = "SELECT * FROM sucursales";
        LinkedList<sucursalesM> ListarS = new LinkedList<>();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
//                listar.add(new UsuariosGT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
//            }
          ListarS.add(new sucursalesM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
          
                  }
          return ListarS;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
   
    }

    @Override
    public sucursalesM obtener_sucursales(int codigo) {
      
    String sql = "select * from sucursales where codigo= ?";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {

//            vendedoresM vm = new vendedoresM(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            sucursalesM sm = new sucursalesM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            return sm;
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
    public void crear_sucursal(sucursalesM sucursal) {
       
    String sql = "insert into sucursales (nombre,direccion,correo,telefono) values (?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, sucursal.getNombre());
            ps.setString(2, sucursal.getDireccion()); 
            ps.setString(3, sucursal.getCorreo());
            ps.setInt(4, sucursal.getTelefono());
            ps.executeUpdate();
             
        } catch (Exception e) {
            System.out.println(e);
        
        }
    
    
    }

    @Override
    public void modificar_sucursales(sucursalesM sucursal) {
     
     String sql = "update sucursales set nombre=?, direccion=?, correo=?, telefono=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, sucursal.getNombre());
            ps.setString(2, sucursal.getDireccion()); 
            ps.setString(3, sucursal.getCorreo());
            ps.setInt(4, sucursal.getTelefono());
            ps.setInt(5, sucursal.getCodido());
            ps.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println(e);
        
        }

    }

    @Override
    public void eliminar_sucursales(int codigo) {
     
    String sql = "delete from sucursales where codigo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
}
