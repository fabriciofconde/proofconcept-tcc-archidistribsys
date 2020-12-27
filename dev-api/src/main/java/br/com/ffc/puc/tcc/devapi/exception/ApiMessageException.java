package br.com.ffc.puc.tcc.devapi.exception;

import java.io.PrintWriter;

/**
 * 
 * @author fabricio
 *
 */
public class ApiMessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiMessageException() {
        super();
    }

    public ApiMessageException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
    }
}
