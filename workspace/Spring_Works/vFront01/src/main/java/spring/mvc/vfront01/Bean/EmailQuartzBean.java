package spring.mvc.vfront01.Bean;


import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class EmailQuartzBean extends QuartzJobBean{

	
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// email 보내기 시키기
		try {
			sendMail();
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendMail() throws MessagingException{
		   
		    String host = "smtp.gmail.com";
	        String Password = "지원비번";
	        String from = "지원이메일@gmail.com";
	        String toAddress = "보내는이메일@gmail.com";
	        String filename = "직원목록저장된파일이름.txt아니면.xls";
	        // Get system properties
	      
	        Properties props = System.getProperties();
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtps.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        
	        Session session = Session.getInstance(props, null);

	        MimeMessage message = new MimeMessage(session);

	        message.setFrom(new InternetAddress(from));

	        message.setRecipients(Message.RecipientType.TO, toAddress);

	        message.setSubject("이메일 파일첨부(제목예시)");

	        BodyPart messageBodyPart = new MimeBodyPart();

	        messageBodyPart.setText("직원 목록파일입니다.(내용예시)");

	        Multipart multipart = new MimeMultipart();

	        multipart.addBodyPart(messageBodyPart);

	        messageBodyPart = new MimeBodyPart();

	        DataSource source = new FileDataSource(filename);

	        messageBodyPart.setDataHandler(new DataHandler(source));

	        messageBodyPart.setFileName(filename);

	        multipart.addBodyPart(messageBodyPart);

	        message.setContent(multipart);

	        try {
	            Transport tr = session.getTransport("smtps");
	            tr.connect(host, from, Password);
	            tr.sendMessage(message, message.getAllRecipients());
	            System.out.println("Mail Sent Successfully");
	            tr.close();

	        } catch (SendFailedException e) {
	            System.out.println("send failed"+ e);
	        }
	}

}
