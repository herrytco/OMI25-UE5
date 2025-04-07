package omi25.nachname.ue5.ex1;

public class NotificationManager {
  public ReportGenerator reportGenerator;
  public Printer printer;
  public Logger logger;
  public EmailSender emailSender;

  public NotificationManager() {
    reportGenerator = new ReportGenerator(this);
    printer = new Printer();
    logger = Logger.getInstance();
    emailSender = new EmailSender();
  }

  public void processReport(String user) {
    logger.log("Starting notification process");
    reportGenerator.generateAndSendReport(user);
    printer.print("Notification complete.");
    emailSender.sendEmail(user, "Hope you liked the report!");
    logger.log("NotificationManager finished its job");
  }

  public void logFinalConfirmation(String user) {
    logger.log("Final confirmation: " + user + " was notified.");
  }
}
