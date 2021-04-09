package xumi.spring.demo.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/**
 * @author: zzxu
 * @date: 2021/3/30 11:48
 * @description:
 */
public class MqttClientPublish{
    public final static String serviceUrl = "tcp://192.168.228.129:1883";

    public final static String userName = "root";

    public final static String pwd = "root";

    public final static int timeout = 60;


    public static void main(String [] args){

        MqttClient mqttClient;
        MqttMessage message = new MqttMessage();
        message.setQos(2);
        message.setPayload("fdsfsd".getBytes());
        message.setRetained(false);
        message.setId(1);
        try {
            MqttConnectOptions options = new MqttConnectOptions();
            options.setPassword(pwd.toCharArray());
            options.setUserName(userName);
            options.setCleanSession(true);
            options.setConnectionTimeout(timeout);
            mqttClient = new MqttClient(serviceUrl, "11111");
            mqttClient.connect(options);
            mqttClient.subscribe("test1111",new MqttListeners());
            mqttClient.publish("test1111",message);
            mqttClient.setCallback(new PushCallback());
            IMqttToken token = mqttClient.subscribeWithResponse("test1111");
            MqttWireMessage m = token.getResponse();
            System.out.println("++++++++++++"+new String(m.getPayload()));
        }catch(Exception e){
            System.out.println(e.getCause());
    }
    }

}
