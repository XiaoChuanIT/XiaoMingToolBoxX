package io.Github.XiaoChuanIT.XiaoMingToolBoxX;

import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.config.IpConfig;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.function.*;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.information.ip;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.information.ping;
import io.Github.XiaoChuanIT.XiaoMingToolBoxX.information.xmping;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static cn.chuanwise.util.CollectionUtil.randomGet;

//import static cn.chuanwise.util.CollectionUtil.randomGet;

public class XiaoMingToolBoxXPlugin
        extends JavaPlugin {
    protected static String getIpConfig() {
        return null;
    }

    @Override
    public void onEnable() {
//        getXiaoMingBot().getInteractorManager().registerInteractors(new xxx类名(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new InterestingInteraction(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new ChineseFunction(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new CallNames(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new ip(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new Refresh(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new ping(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new PlugHelp(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new xmping(), this);
    }

    protected IpConfig XiaoMingToolBoxXIpConfig;   //配置文件方法

    @Override
    public void onLoad() {
        final List<String> XiaoChuanTips = Arrays.asList(
                "你知道吗，当你看到这条 TIPS 时，你就阅读了一条 TIPS",
                "你知道吗，XiaoMing的 开发者/插件开发者 有好几个",
                "你知道吗，XiaoMing原来叫xiaoming，是CHUANWISE将他改名的"
        );
        getLogger().info(" __   ___             __  __ _          _______          _ ____            __   __\n" +
                " \\ \\ / (_)           |  \\/  (_)        |__   __|        | |  _ \\           \\ \\ / /\n" +
                "  \\ V / _  __ _  ___ | \\  / |_ _ __   __ _| | ___   ___ | | |_) | _____  __ \\ V / \n" +
                "   > < | |/ _` |/ _ \\| |\\/| | | '_ \\ / _` | |/ _ \\ / _ \\| |  _ < / _ \\ \\/ /  > <  \n" +
                "  / . \\| | (_| | (_) | |  | | | | | | (_| | | (_) | (_) | | |_) | (_) >  <  / . \\ \n" +
                " /_/ \\_\\_|\\__,_|\\___/|_|  |_|_|_| |_|\\__, |_|\\___/ \\___/|_|____/ \\___/_/\\_\\/_/ \\_\\\n" +
                "                                      __/ |                                       \n" +
                "                                     |___/                                        "+
                "                                                        @XiaoChuan小船"+
                "tips: " + randomGet(XiaoChuanTips) + "\n");
        getLogger().info("XiaoMingToolBoxX启动成功!");

        final File dataFolder = getDataFolder();
        dataFolder.mkdirs();

        XiaoMingToolBoxXIpConfig = setupConfiguration(IpConfig.class, IpConfig::new);      //配置文件方法
    }
}