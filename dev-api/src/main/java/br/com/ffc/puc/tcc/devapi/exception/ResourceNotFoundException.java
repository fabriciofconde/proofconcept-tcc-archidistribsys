package br.com.ffc.puc.tcc.devapi.exception;

/**
 * 
 * @author fabricio
 *
 */
public class ResourceNotFoundException extends ApiMessageException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
