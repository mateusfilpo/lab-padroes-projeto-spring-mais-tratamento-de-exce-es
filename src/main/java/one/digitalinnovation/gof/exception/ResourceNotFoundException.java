package one.digitalinnovation.gof.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Cliente não encontrado. Id: " + id);
	}
}