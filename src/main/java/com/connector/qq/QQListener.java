package com.connector.qq;

import com.connector.qq.rest.RestTemplatePush;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Message;
import javax.jms.MessageListener;

public class QQListener implements MessageListener {

    private static final Logger logger = LoggerFactory
            .getLogger(QQListener.class);


    public void onMessage(Message message) {
        new FileReader().writeFile(message);

        try{

            new RestTemplatePush().pushQMessage(message);

        }catch (Exception io){
            logger.error("Error posting payload"+ io.getCause());
            io.printStackTrace();
        }
    }

}
