
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
    public MailClient( MailServer server, String user)
    {
        this.user = user;
        this.server = server;
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
        int count = 0;
        if (email != null)
        {
            //Imprimimos los detalles del email
            email.print();
            count++;
            System.out.println("El numero de mnsajes es: " + count);
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
    public void sendMailItem( String to, String subject, String message)
    {
        MailItem email = new MailItem(user, to, subject, message);
        server.post(email);
    }
}
