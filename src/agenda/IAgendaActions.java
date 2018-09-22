package agenda;

import java.rmi.Remote;
public interface IAgendaActions extends Remote{
    public String AtualizarDataHora() throws java.rmi.RemoteException;
    public String InserirContato(String nome, String telefone) throws java.rmi.RemoteException;
    public String ImprimirContatos() throws java.rmi.RemoteException;
}
