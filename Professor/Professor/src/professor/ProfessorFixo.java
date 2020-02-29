package professor;
/**
 *
 * @author Victor Manuel - 1302
 */
public class ProfessorFixo extends Professor{
    private float Salario;
    public ProfessorFixo(){}
    public ProfessorFixo(float Salario){
        this.Salario=Salario;
    }
    public float getSalario(){
    return Salario;
    }
    public void setSalario(float Salario){
        this.Salario=Salario;
        }
    }