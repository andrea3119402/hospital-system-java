
package modelos;


public class Paciente {
    private int idPaciente;
    private String nombre;
    private String edad;
    private String sexo;
    private String ciudad;
    private String telefono;
    private String sangre;
    private String nacimiento;
    private String pais;
    private String estatura;
    private String peso;
    private String alergias;

    public Paciente(int idPaciente, String nombre, String edad, String sexo, String ciudad, String telefono, String sangre, String nacimiento, String pais, String estatura, String peso, String alergias) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.sangre = sangre;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.estatura = estatura;
        this.peso = peso;
        this.alergias = alergias;
    }
    
    public Paciente(int idPaciente){
        this.idPaciente = idPaciente;
    }
    
    public Paciente(int idPaciente, String nombre,String edad, String sangre, String estatura, String peso, String alergias) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.sangre=sangre;
        this.estatura = estatura;
        this.peso = peso;
        this.alergias = alergias;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    
}
