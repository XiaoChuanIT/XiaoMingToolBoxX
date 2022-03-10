package io.Github.XiaoChuanIT.XiaoMingToolBoxX.function;

//import cn.XIAO_CHUAN.XiaoMingToolBox.ToolBoxPlugIn;
import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.XiaoMingToolBoxXPlugin;


public class InterestingInteraction<T extends Plugin> extends XiaoMingToolBoxXPlugin implements Interactors<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }

    @Filter("小明在吗")
    @Filter("XiaoMing在吗")
    @Filter("小明呢")
    @Filter("XiaoMing呢")
    public void XiaoMingIn(XiaoMingUser user) {
        user.sendMessage("小明在这里!\n" +
                "没事请别问小明在吗~\n" +
                "求求了~");
    }

}
