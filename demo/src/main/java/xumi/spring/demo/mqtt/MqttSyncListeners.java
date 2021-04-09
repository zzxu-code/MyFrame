package xumi.spring.demo.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

/**
 * @author: zzxu
 * @date: 2021/4/9 11:36
 * @description:
 */
public class MqttSyncListeners implements IMqttActionListener {
    @Override
    public void onSuccess(IMqttToken iMqttToken) {
        iMqttToken.setUserContext("dsadsadsa");
    }

    @Override
    public void onFailure(IMqttToken iMqttToken, Throwable throwable) {

    }
}
