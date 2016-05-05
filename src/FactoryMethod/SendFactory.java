package FactoryMethod;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("please input correct type!");
            return null;
        }
    }
}
