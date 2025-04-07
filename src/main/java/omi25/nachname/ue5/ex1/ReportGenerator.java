package omi25.nachname.ue5.ex1;

public class ReportGenerator {
  public Printer printer;
  public EmailSender emailSender;
  public NotificationManager notificationManager;

  public ReportGenerator(NotificationManager manager) {
    printer = new Printer();
    emailSender = new EmailSender();
    notificationManager = manager;
  }

  public void generateAndSendReport(String userEmail) {
    String report = "Very Important Report Content";
    notificationManager.logger.log("Generating report");
    printer.print(report);
    emailSender.sendEmail(userEmail, report);
    notificationManager.logger.log("Report sent to " + userEmail);

    notificationManager.logFinalConfirmation(userEmail);
  }
}
