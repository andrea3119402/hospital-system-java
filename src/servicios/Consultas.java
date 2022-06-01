

package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Paciente;


public class Consultas {
    private final String tabla = "paciente";
    
    
    
    public List<Paciente> recuperarTodas(Connection conexion) throws SQLException{
        
      List<Paciente> pacientes = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla );
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            pacientes.add(new Paciente(resultado.getInt("idPaciente"), resultado.getString("nombre"), resultado.getString("edad"), resultado.getString("sexo"), resultado.getString("ciudad"), resultado.getString("telefono"), resultado.getString("sangre"), resultado.getString("nacimiento"), resultado.getString("pais"), resultado.getString("estatura"), resultado.getString("peso"), resultado.getString("alergias")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return pacientes;
   }
    
    
     public void guardar(Connection conexion, Paciente paciente) throws SQLException{
      try{
         PreparedStatement consulta;
         if(paciente.getIdPaciente()==0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre, edad, sexo, ciudad, telefono, sangre, nacimiento, pais, estatura, peso, alergias) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, paciente.getNombre().trim());
            consulta.setString(2, paciente.getEdad().trim());
            consulta.setString(3, paciente.getSexo());
            consulta.setString(4, paciente.getCiudad());
            consulta.setString(5, paciente.getTelefono().trim());
            consulta.setString(6, paciente.getSangre());
            consulta.setString(7, paciente.getNacimiento());
            consulta.setString(8, paciente.getPais());
            consulta.setString(9, paciente.getEstatura().trim());
            consulta.setString(10, paciente.getPeso().trim());
            consulta.setString(11, paciente.getAlergias().trim());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET nombre = ?, edad = ?, sangre=?, estatura=?, peso=?, alergias=? WHERE idPaciente = ?");
            
            consulta.setString(1, paciente.getNombre().trim());
            consulta.setString(2, paciente.getEdad().trim());
            //consulta.setString(3, paciente.getSexo());
            //consulta.setString(4, paciente.getCiudad());
            //consulta.setString(5, paciente.getTelefono());
            consulta.setString(3, paciente.getSangre().trim());
            //consulta.setString(, paciente.getNacimiento());
            //consulta.setString(8, paciente.getPais());
            consulta.setString(4, paciente.getEstatura().trim());
            consulta.setString(5, paciente.getPeso().trim());
            consulta.setString(6, paciente.getAlergias().trim());
            consulta.setInt(7, paciente.getIdPaciente());
         }
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
     }
      
     
      public Paciente recuperarPorId(Connection conexion, int idPaciente) throws SQLException {
      Paciente paciente = null;
      try{
         //Select all=recoger todo de mi base de datos from, de la tabla, where, donde el id es el que el usuario inserte
         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla + " WHERE idPaciente = ?" );

         consulta.setInt(1, idPaciente);
         //Nos permite obtener el resultado de la busqueda
         ResultSet resultado = consulta.executeQuery();
         //en caso de que si encuentre los valores 
         while(resultado.next()){
            paciente = new Paciente(idPaciente, resultado.getString("nombre"), resultado.getString("edad"), resultado.getString("sexo"), resultado.getString("ciudad"), resultado.getString("telefono"), resultado.getString("sangre"), resultado.getString("nacimiento"), resultado.getString("pais"), resultado.getString("estatura"), resultado.getString("peso"), resultado.getString("alergias"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return paciente;
   }
      
      
   public void eliminar(Connection conexion, Paciente paciente) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE idPaciente = ?");
         consulta.setInt(1, paciente.getIdPaciente());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
}
