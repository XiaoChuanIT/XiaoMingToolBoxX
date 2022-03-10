package io.Github.XiaoChuanIT.XiaoMingToolBoxX.function;

//import cn.XIAO_CHUAN.XiaoMingToolBox.ToolBoxPlugIn;
import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.configuration.Statistician;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.XiaoMingToolBoxXPlugin;
//import cn.chuanwise.xiaoming.user.*;


public class ChineseFunction<T extends Plugin> extends XiaoMingToolBoxXPlugin implements Interactors<T> {
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }

    @Filter("小明调用次数")
    @Filter("XiaoMing调用次数")
    @Filter("XM调用次数")
    @Filter("xm调用次数")
    @Required("core.statistics.call")
    public void XiaoMingChineseCall(XiaoMingUser user) {
        final Statistician statistician = xiaoMingBot.getStatistician();
        user.sendMessage("小明调用次数共计：" + statistician.getCallNumber() + "，有效调用次数：" + statistician.getEffectiveCallNumber());
    }

    @Filter("回显 {words}")
    public void XiaoMingEcho(XiaoMingUser user,
                             @FilterParameter("words") String EchoWords) {
        user.sendMessage(EchoWords);
    }

}
