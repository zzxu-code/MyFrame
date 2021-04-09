package xumi.spring.demo.mqtt;

import com.alibaba.fastjson.JSONObject;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * @author: zzxu
 * @date: 2021/3/30 13:44
 * @description:
 */
public class MqttListeners implements IMqttMessageListener{

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage){
        try{
            System.out.println("topic:"+s+",mqttMessage:"+ new String(mqttMessage.getPayload()));
        }catch (Exception e){
            System.out.println("异常");
        }

    }
}
