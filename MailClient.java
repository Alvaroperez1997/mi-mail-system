
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
    // Almacena el ultimo mensaje recibido
    private MailItem lastMail;
    // Almacena los spams
    private boolean spam;
    // Almacena los mensajes enviados
    private float mensajesEnviados;
    // Almacena los mensajes recibidos
    private float mensajesRecibidos;
    // Almacena el numero de mensajes con spam
    private float mensajesSpam;
    // Almacena el porcentaje de mensajes con spam
    private float porcentajeSpam;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient( MailServer server, String user)
    {
        this.user = user;
        this.server = server;
        lastMail = null;
    }
        
    /**
     * Recupera del servidor el siguiente email destinado
     * al usuario que esta usando el cliente. Si no hay 
     * ningun email pendiente de ser descargado devuelve null; si
     * lo hay, devuelve el email
     */
    public MailItem getNextMailItem()
    { 
        MailItem email = server.getNextMailItem(user);
        if (email != null) {
            lastMail = email;
        }
        return email;
    }
    
    /**
     * 
     */
    public void printNextMailItem()
    {
        MailItem email = getNextMailItem();
        if (email != null)
        {
            if (email.getMessage().contains("trabajo")) {
                spam = false;
                //Imprimimos los detalles del email
                email.print();
            }
            else if (email.getMessage().contains("regalo") || email.getMessage().contains("promocion")) {
                spam = true;
                System.out.println("El correo tiene spam");
                email = null;
            }
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
    
    /**
     * Muestra por pantalla el numero de mensajes pendientes de
     * descargar en el servidor para el usuario actual
     */
    public void howManyMailItemsIHave()
    {
        System.out.println("Emails pendientes en el servidor: " + server.howManyMailItems(user));
    }
    
    /**
     * Recibe un correo y responde automaticamente indicando
     * que estamos fuera de la oficina
     */
    public void getNextMailItemAndAutomaticRespond()
    {
        MailItem email = getNextMailItem();
        if (email != null)
        {
            sendMailItem(email.getFrom(), "No estoy en la oficina. " + email.getMessage(), "RE: " + email.getSubject());
        }
    }
    
    /**
     * Muestra por pantalla los datos del ultimo email recibido.
     * En caso de no haber recibido aun ningun email, informa de ello.
     */
    public void muestraUltimoEmail() 
    {
        if(lastMail != null) {
            lastMail.print();
        }
        else {
            System.out.println("No hay ningún mensaje.");
        }
    }
    
    /**
     * mostrar por pantalla unas estadísticas que incluyan el número de mensajes enviados
     * el número de mensajes recibidos
     * el número de mensajes que son spam
     * el porcentaje de spam
     * y la dirección de la persona que nos envío el mensaje más largo junto con cuantos caracteres tenía ese mensaje.
     */
    public void showStats()
    {
        mensajesEnviados = mensajesEnviados + MailItem.getMessage();
    }
}
