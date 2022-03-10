package io.Github.XiaoChuanIT.XiaoMingToolBoxX.information;

import cn.chuanwise.xiaoming.annotation.EventListener;
import cn.chuanwise.xiaoming.event.Listeners;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.XiaoMingToolBoxXPlugin;
import net.mamoe.mirai.event.events.MessageEvent;
import net.mamoe.mirai.message.data.Message;

import java.util.regex.*;


public class ip<T extends Plugin> extends XiaoMingToolBoxXPlugin implements Interactors<T>, Listeners<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }


    @EventListener()
    public void ip(MessageEvent event, XiaoMingUser user) {
        final Message words = event.getMessage();
        boolean IP = Pattern.matches("服务器ip", (CharSequence) words);
        if (IP == true) {
            user.sendMessage(XiaoMingToolBoxXPlugin.getIpConfig());
        }
    }
}
