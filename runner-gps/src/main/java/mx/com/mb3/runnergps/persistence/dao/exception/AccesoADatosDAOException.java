package mx.com.mb3.runnergps.persistence.dao.exception;
public class AccesoADatosDAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 *            Descripcion del Error
	 */
	public AccesoADatosDAOException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param message
	 * @param e
	 */
	public AccesoADatosDAOException(String message, Throwable e) {
		super(message, e);
	}

}