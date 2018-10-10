package br.com.utfpr.sd.rmi.implementacoes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.utfpr.sd.rmi.interfaces.ClientCallback;

public class ClientCallbackImpl extends UnicastRemoteObject implements ClientCallback {

	private static final long serialVersionUID = -3072599453250475516L;

	public ClientCallbackImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void callbackConsultaPassagem(String mensagem) throws RemoteException {
		System.out.println(mensagem);
		
	}

	@Override
	public void callbackCompraPassagem(String mensagem) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackConsultaHospedagem(String mensagem) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackCompraHospedagem(String mensagem) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackConsultaPacote(String mensagem) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackCompraPacote(String mensagem) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackRemoveRegistroDeInteresse(String mensagem) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackRegistraRegistroInteresse(String mensagem, int idRegistro) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
