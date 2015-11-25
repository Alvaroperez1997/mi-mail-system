
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
    public MailClient( MailServer servidor, String usuario)
    {
        server = servidor;
        user = usuario;
    }

    /**
     *  
     */
    public String getNextMailItem()
    {
        
    }
    
    /**
     * 
     */
    public String printNextMailItem()
    {
        
    }
    
    /**
     * 
     */
    public void sendMailItem( String destinatario, String mensaje)
    {
        
    }
}
