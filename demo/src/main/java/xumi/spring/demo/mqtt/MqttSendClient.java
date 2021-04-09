package xumi.spring.demo.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttSendClient {

    public final static String serviceUrl = "tcp://192.168.228.128:1883";

    public final static String userName = "root";

    public final static String pwd = "root";

    public final static int timeout = 60;

    private static MqttSendClient sendClient;

    private MqttClient mqttClient;


    /***
     * todo:: Mqtt客户端连接
     * 1、连接的配置信息
     * 2、连接的方式-客户端
     * 3、连接断开，响应
     */
    public synchronized void getMqttClient(String clientId) throws MqttException {
        MqttMessage message = new MqttMessage();
        message.setQos(2);
        message.setPayload("fdsfsd".getBytes());
        message.setRetained(false);
        message.setId(1);
        if (mqttClient == null) {
            MqttConnectOptions options = new MqttConnectOptions();
            options.setPassword(pwd.toCharArray());
            options.setUserName(userName);
            options.setCleanSession(true);
            options.setConnectionTimeout(timeout);
            mqttClient = new MqttClient(serviceUrl, clientId);
            mqttClient.connect(options);
            mqttClient.publish("test",message);
        }
    }


/*    public void subscribe(){
        mqttClient.getMqttClient("dervice2");
        mqttServer.subscribe("test",messageListener.messageListener);
    }*/

}
