package com.gary.weatherdemo.workmanager;

import android.support.annotation.NonNull;

import com.gary.weatherdemo.utils.CityInfoQueryUtil;
import com.gary.weatherdemo.utils.LogUtils;

import androidx.work.Worker;

/**
 * Created by GaryCao on 2018/11/04.
 * 加载Adcode-address 对照表文件，供天气查询使用
 */
public class LoadCityConfigWorker extends Worker {
    private static final String TAG = LoadCityConfigWorker.class.getSimpleName();

    @NonNull
    @Override
    public Result doWork() {
        LogUtils.d(TAG, "doWork()");
        CityInfoQueryUtil.getInstance().loadAdcodeConfig();
        return Result.SUCCESS;
    }
}
