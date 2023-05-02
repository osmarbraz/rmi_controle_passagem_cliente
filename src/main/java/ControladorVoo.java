import java.rmi.Remote;

/**
 * Interface dos métodos remotos.
 * 
 * @author osmar
 */
public interface ControladorVoo extends Remote {

    public int verificarStatus(String codigoVoo, int numeroAssento) throws java.rmi.RemoteException;
    
    public int marcarVoo(String codigoVoo, int numeroAssento) throws java.rmi.RemoteException;

}