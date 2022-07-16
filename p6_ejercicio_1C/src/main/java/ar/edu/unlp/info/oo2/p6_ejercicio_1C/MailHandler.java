package ar.edu.unlp.info.oo2.p6_ejercicio_1C;

import java.util.logging.*;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailHandler extends Handler {

	private String destinatario;
	private String emisor;

	public MailHandler(String destinatario, String emisor) {
		this.destinatario = destinatario;
		this.emisor = emisor;
	}

	@Override
	public void close() throws SecurityException {
		this.close();

	}

	@Override
	public void flush() {
		this.flush();

	}

	@Override
	public void publish(LogRecord record) {
		try {
			String username = "294839f7474c74"; // Completar con su username de mailtrap
			String password = "6c2f52e5aec07d"; // Completar con su password de mailtrap
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props,
				new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
			});
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emisor, "Java logging mail"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
			message.setSubject(record.getLevel().toString());
			message.setText(record.getMessage().toString());
			System.out.println("mail enviando");
			Transport.send(message);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
