/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author c0641055
 */
@ServerEndpoint("/socket")
public class sampleserver {
    @OnMessage
    public void onMessage (String str){
        System.out.println(str);
    }
}
