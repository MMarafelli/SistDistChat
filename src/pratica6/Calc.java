package pratica6;
/************************
*  Matheus Marafeli     *
*         IFTM          *
* Sistemas Distribuídos *
*************************
* Implementacao DE RPC em Java - RMI
*************************************/
import java.rmi.*;

public interface Calc extends Remote {
        public int getSoma (int a, int b) throws RemoteException;
        public int getSubtracao (int a, int b) throws RemoteException;
        public int getMultiplicacao (int a, int b) throws RemoteException;
        public double getDivisao (int a, int b) throws RemoteException;
        
}