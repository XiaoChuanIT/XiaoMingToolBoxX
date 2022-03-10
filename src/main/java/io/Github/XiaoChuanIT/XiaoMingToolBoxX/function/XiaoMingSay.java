package io.Github.XiaoChuanIT.XiaoMingToolBoxX.function;

import io.Github.XiaoChuanIT.XiaoMingToolBoxX.XiaoMingToolBoxXPlugin;
import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
//import cn.chuanwise.xiaoming.user.*;


public class XiaoMingSay<T extends Plugin> extends XiaoMingToolBoxXPlugin implements Interactors<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }

    @Filter("回显 {words}")
    public void XiaoMingSay(XiaoMingUser user,
                             @FilterParameter("words") String SayWords) {
        user.sendMessage("say信息：" + SayWords);
    }

}
