package omi25.nachname.ue5.ex1;

public class ReportGenerator {
  private Printer printer;
  private EmailSender emailSender;
  private Logger logger;
  private NotificationManager notificationManager;

  public ReportGenerator(NotificationManager manager) {
    printer = new Printer();
    emailSender = new EmailSender();
    logger = Logger.getInstance();
    notificationManager = manager;
  }

  public void generateAndSendReport(String userEmail) {
    String report = "Very Important Report Content";
    logger.log("Generating report");
    printer.print(report);
    emailSender.sendEmail(userEmail, report);
    logger.log("Report sent to " + userEmail);

    notificationManager.logFinalConfirmation(userEmail);
  }
}
