package com.mycompany.myapp;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class hook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam 包名) throws Throwable {
            //过滤包名
        if (!包名.packageName.equals("com.ushaqi.zssqosyj"))
            return;


        XposedHelpers.findAndHookMethod(
                "com.ushaqi.zssqosyj.db.BookReadRecord"//要hook的应用类名
                , 包名.classLoader,
                "is_le"//hook的追书换源方法

                , new XC_MethodHook()//回调
                {@Override
                protected void afterHookedMethod(MethodHookParam 参数) throws Throwable {//拦截之后要做什么
                    super.afterHookedMethod(参数);
                    参数.setResult(true);////强制返回boolean为true

                }});
                 XposedHelpers.findAndHookMethod(
        "com.ushaqi.zssqosyj.model.BookInfo"//要hook的应用类名
        , 包名.classLoader,
        "is_le"//要hook的方法

        , new XC_MethodHook()//回调
        {@Override
protected void afterHookedMethod(MethodHookParam 参数) throws Throwable {//拦截之后要做什么
            super.afterHookedMethod(参数);
            参数.setResult(true);////强制返回boolean为true
        }});
                         XposedHelpers.findAndHookMethod(
                                 "com.ushaqi.zssqosyj.model.BookGenderRecommend$RecommendBook"//要hook的应用类名
                                 , 包名.classLoader,
                                 "is_le"//要hook的方法

                                 , new XC_MethodHook()//回调
                                 {@Override
                                 protected void afterHookedMethod(MethodHookParam 参数) throws Throwable {//拦截之后要做什么
                                     super.afterHookedMethod(参数);
                                     参数.setResult(true);////强制返回boolean为true
                                 }});
                                 XposedHelpers.findAndHookMethod(
                                         "com.ushaqi.zssqosyj.model.BookInfo2"//要hook的应用类名
                                         , 包名.classLoader,
                                         "is_le"//要hook的方法

                                         , new XC_MethodHook()//回调
                                         {@Override
                                         protected void afterHookedMethod(MethodHookParam 参数) throws Throwable
                                         {//拦截之后要做什么
                                             super.afterHookedMethod(参数);
                                             参数.setResult(true);////强制返回boolean为true}},
                                         }});
                                             XposedHelpers.findAndHookMethod(
                                                     "com.ushaqi.zssqosyj.model.RemoteBookShelf$Book"//要hook的应用类名
                                                     , 包名.classLoader,
                                                     "is_le"//要hook的方法

                                                     , new XC_MethodHook()//回调
                                                     {@Override
                                                     protected void afterHookedMethod(MethodHookParam 参数) throws Throwable
                                                     {//拦截之后要做什么
                                                         super.afterHookedMethod(参数);
                                                         参数.setResult(true);////强制返回boolean为true
                                                          }});}}
