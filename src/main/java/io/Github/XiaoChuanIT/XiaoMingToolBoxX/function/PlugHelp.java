package io.Github.XiaoChuanIT.XiaoMingToolBoxX.function;

//import cn.XIAO_CHUAN.XiaoMingToolBox.ToolBoxPlugIn;

import cn.chuanwise.xiaoming.annotation.EventListener;
import cn.chuanwise.xiaoming.event.Listeners;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.XiaoMingToolBoxXPlugin;
import net.mamoe.mirai.event.events.MessageEvent;
import net.mamoe.mirai.message.data.Message;

import java.util.regex.*;


public class PlugHelp<T extends Plugin> extends XiaoMingToolBoxXPlugin implements Interactors<T>, Listeners<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }


    @EventListener()
    public void PlugHelp(MessageEvent event, XiaoMingUser user) {
        /*
        正则实例

        final Message words = event.getMessage();
        boolean SHABI = Pattern.matches("傻逼", (CharSequence) words);
        boolean SB = Pattern.matches("SB", (CharSequence) words);
        boolean sb = Pattern.matches("sb", (CharSequence) words);
        if (SHABI == true || SB == true || sb == true) {
            user.sendMessage("ヾ(≧へ≦)〃 小明求你了,能不发脏话吗?");
        }
        */

        final Message words = event.getMessage();
        boolean PLUGHELP = Pattern.matches("ToolBoxX指令格式", (CharSequence) words);
        if (PLUGHELP == true) {
            user.sendMessage("你好，我是XiaoMingToolBoxX小助手，这里是指令格式：" +
                    "小明调用次数：小明的调用次数" +
                    "服务器ip：默认无设置，需要的话在插件配置看");
        }
    }
}
