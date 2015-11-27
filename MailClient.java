
/**
 * Write a description of class MailClient here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // representa el servidor asociado con ese cliente
    private MailServer server;
    // representa la dirección de correo del usuario que usa ese cliente
    private String user;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient( MailServer servidorX, String usuarioX)
    {
        user = usuarioX;
        server = servidorX;
    }

    /**
     * Recupera del servidor el siguiente email destinado
	 * al usuario que esta usando el cliente. Si no hay 
	 * ningun email pendiente de ser descargado devuelve null; si
	 * lo hay, devuelve el email.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * 
     */
    public void printNextMailItem()
    {
        MailItem email = getNextMailItem();
        if (email != null)
        {
            //Imprimimos los detalles del email
            email.print();
        }
        else
        {
            //Avisamos de que no hay emails en el servidor
            System.out.println("No hay correo nuevo");
        }
    }
    
    /**
     * Permite redactar un email indicando el destinatario y el
	 * cuerpo del mensaje y enviarlo al servidor
     */
    public void sendMailItem( String to, String asunto, String message)
    {
        MailItem email = new MailItem(user, to, asunto, message);
        server.post(email);
    }
}
