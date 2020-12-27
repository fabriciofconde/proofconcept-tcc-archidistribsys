package br.com.ffc.puc.tcc.devapi.exception;

/**
 * 
 * @author fabricio
 *
 */
public class ResourceAlreadyExistsException extends ApiMessageException {
	
	private static final long serialVersionUID = 1L;

	public ResourceAlreadyExistsException() {
        super();
    }

    public ResourceAlreadyExistsException(String message) {
        super(message);
    }
}
