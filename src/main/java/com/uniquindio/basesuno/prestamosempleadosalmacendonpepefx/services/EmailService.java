package com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailService {
    public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
        // Configuración del servidor de correo
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.example.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Autenticación
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("tuCorreo@example.com", "tuContraseña");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tuCorreo@example.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(cuerpo);

            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}