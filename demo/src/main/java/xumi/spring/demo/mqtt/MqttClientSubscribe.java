package xumi.spring.demo.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

/**
 * @author: zzxu
 * @date: 2021/3/30 11:48
 * @description:
 */
public class MqttClientSubscribe implements IMqttActionListener {


    @Override
    public void onSuccess(IMqttToken iMqttToken) {
        System.out.println("fdsfsdfsdfs");
    }

    @Override
    public void onFailure(IMqttToken iMqttToken, Throwable throwable) {

    }
}
