package io.Github.XiaoChuanIT.XiaoMingToolBoxX.information;

import io.Github.XiaoChuanIT.XiaoMingToolBoxX.XiaoMingToolBoxXPlugin;
import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.bot.XiaoMingBot;
import cn.chuanwise.xiaoming.event.Listeners;
import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;

import java.util.Properties;


//public class ping {
//    //通过截取cmd流方式得到计算机的配置信息(不好)
//    public static List<String> getIpAddress() {
//        Process p = null;
//        List<String> address = new ArrayList<String>();
//        try {
//            p = new ProcessBuilder("ipconfig", "/all").start();
//        } catch (Exception e) {
//            return address;
//        }
//        StringBuffer sb = new StringBuffer();
//        //读取进程输出值
//        InputStream inputStream = p.getInputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//        String s = "";
//        try {
//            while ((s = br.readLine()) != null) {
//                sb.append(s + "\n");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                inputStream.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        user.sendMessage(sb);
//        return address;
//    }
//
//    public static void getIpconfig() {
//        Map<String, String> map = System.getenv();
//        user.sendMessage(map.get("USERNAME"));
//        //获取用户名
//        user.sendMessage(map.get("COMPUTERNAME"));
//        //获取计算机名
//        user.sendMessage(map.get("USERDOMAIN"));
//        //获取计算机域名
//    }
//
//    //得到计算机的ip地址和mac地址
//    public static void getConfig() {
//        try {
//            InetAddress address = InetAddress.getLocalHost();
//            NetworkInterface ni = NetworkInterface.getByInetAddress(address);
//            //ni.getInetAddresses().nextElement().getAddress();
//            byte[] mac = ni.getHardwareAddress();
//            String sIP = address.getHostAddress();
//            String sMAC = "";
//            Formatter formatter = new Formatter();
//            for (int i = 0; i < mac.length; i++) {
//                sMAC = formatter.format(Locale.getDefault(), "%02X%s", mac[i],
//                        (i < mac.length - 1) ? "-" : "").toString();
//            }
//            user.sendMessage("IP：" + sIP);
//            user.sendMessage("MAC：" + sMAC);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //得到计算机的ip,名称,操作系统名称,操作系统版本
//    public static void Config() {
//        try {
//            InetAddress addr = InetAddress.getLocalHost();
//            String ip = addr.getHostAddress().toString();
//            //获取本机ip
//            String hostName = addr.getHostName().toString();
//            //获取本机计算机名称
//            user.sendMessage("本机IP：" + ip + "\n本机名称:" + hostName);
//            Properties props = System.getProperties();
//            user.sendMessage("操作系统的名称：" + props.getProperty("os.name"));
//            user.sendMessage("操作系统的版本：" + props.getProperty("os.version"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //其它的一些东西,会有用到的时候的
//    public static void all() {
//        Properties props = System.getProperties();
//        user.sendMessage("Java的运行环境版本：" + props.getProperty("java.version"));
//        user.sendMessage("Java的运行环境供应商：" + props.getProperty("java.vendor"));
//        user.sendMessage("Java供应商的URL：" + props.getProperty("java.vendor.url"));
//        user.sendMessage("Java的安装路径：" + props.getProperty("java.home"));
//        user.sendMessage("Java的虚拟机规范版本：" + props.getProperty("java.vm.specification.version"));
//        user.sendMessage("Java的虚拟机规范供应商：" + props.getProperty("java.vm.specification.vendor"));
//        user.sendMessage("Java的虚拟机规范名称：" + props.getProperty("java.vm.specification.name"));
//        user.sendMessage("Java的虚拟机实现版本：" + props.getProperty("java.vm.version"));
//        user.sendMessage("Java的虚拟机实现供应商：" + props.getProperty("java.vm.vendor"));
//        user.sendMessage("Java的虚拟机实现名称：" + props.getProperty("java.vm.name"));
//        user.sendMessage("Java运行时环境规范版本：" + props.getProperty("java.specification.version"));
//        user.sendMessage("Java运行时环境规范供应商：" + props.getProperty("java.specification.vender"));
//        user.sendMessage("Java运行时环境规范名称：" + props.getProperty("java.specification.name"));
//        user.sendMessage("Java的类格式版本号：" + props.getProperty("java.class.version"));
//        user.sendMessage("Java的类路径：" + props.getProperty("java.class.path"));
//        user.sendMessage("加载库时搜索的路径列表：" + props.getProperty("java.library.path"));
//        user.sendMessage("默认的临时文件路径：" + props.getProperty("java.io.tmpdir"));
//        user.sendMessage("一个或多个扩展目录的路径：" + props.getProperty("java.ext.dirs"));
//        user.sendMessage("操作系统的名称：" + props.getProperty("os.name"));
//        user.sendMessage("操作系统的构架：" + props.getProperty("os.arch"));
//        user.sendMessage("操作系统的版本：" + props.getProperty("os.version"));
//        user.sendMessage("文件分隔符：" + props.getProperty("file.separator"));
//        //在 unix 系统中是＂／＂
//        user.sendMessage("路径分隔符：" + props.getProperty("path.separator"));
//        //在 unix 系统中是＂:＂
//        user.sendMessage("行分隔符：" + props.getProperty("line.separator"));
//        //在 unix 系统中是＂/n＂
//        user.sendMessage("用户的账户名称：" + props.getProperty("user.name"));
//        user.sendMessage("用户的主目录：" + props.getProperty("user.home"));
//        user.sendMessage("用户的当前工作目录：" + props.getProperty("user.dir"));
//    }
//
//    public static void main(String[] args) {
//        getConfig();
//        Config();
//        all();
//    }
//}
//系统信息查看大法
//    // System信息，从jvm获取
//    property();
//            user.sendMessage("----------------------------------");
//    // cpu信息
//    cpu();
//            user.sendMessage("----------------------------------");
//    // 内存信息
//    memory();
//            user.sendMessage("----------------------------------");
//    // 操作系统信息
//    os();
//            user.sendMessage("----------------------------------");
//    // 用户信息
//    who();
//            user.sendMessage("----------------------------------");
//    // 文件系统信息
//    file();
//            user.sendMessage("----------------------------------");
//    // 网络信息
//    net();
//            user.sendMessage("----------------------------------");
//    // 以太网信息
//    ethernet();
//            user.sendMessage("----------------------------------");


public class xmping<T extends Plugin> extends XiaoMingToolBoxXPlugin implements Interactors<T>, Listeners<T> {
    @Filter("ping")
    @Required("core.account.user.administrator.grant")
    public void xmping(XiaoMingUser user) {
        //以下全是获取信息发送信息
        user.sendMessage("系统情况如下：\n");
        Properties props = System.getProperties();
        user.sendMessage("小明版本：" + XiaoMingBot.VERSION);
        //以下全是获取信息发送信息 End
    }

    //
    @Override
    public void onRegister() {
        Interactors.super.onRegister();
    }
}
