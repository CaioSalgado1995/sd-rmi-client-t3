package br.com.utfpr.sd.rmi.main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.utfpr.sd.rmi.implementacoes.ClientCallbackImpl;
import br.com.utfpr.sd.rmi.interfaces.ClientCallback;
import br.com.utfpr.sd.rmi.interfaces.IAgencia;
import br.com.utfpr.sd.rmi.modelos.Passagem;

public class Main {

	public static void main(String[] args) {
		IAgencia iAgencia = null;
		
		try {
			ClientCallback callback = new ClientCallbackImpl();
			Registry names = LocateRegistry.getRegistry(1099);
			iAgencia = (IAgencia) names.lookup("IAgencia");
			
			Passagem p = new Passagem();
			
			p.setDataIda("11/10/2018");
			p.setDataVolta("14/10/2018");
			p.setDestino("Florianopolis");
			p.setNumeroPessoas(10);
			p.setOrigem("Curitiba");
			p.setTipo(2);
			
			
			iAgencia.consultaPassagem(p, callback);
		} catch (RemoteException | NotBoundException e) {
			System.out.println("Erro no cliente " + e.getMessage());
		}
	}

}
