package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import k.C0852F;
import l.ExecutorC0961a;
import u0.c;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        int i7;
        Context createDeviceProtectedStorageContext;
        int i8;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.t(context, new ExecutorC0961a(1), new C0852F(21, this), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C0852F c0852f = new C0852F(21, this);
                    try {
                        c.f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c0852f.g(10, null);
                    } catch (PackageManager.NameNotFoundException e3) {
                        c0852f.g(7, e3);
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                    setResultCode(11);
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C0852F c0852f2 = new C0852F(21, this);
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                i8 = 12;
            } else {
                i8 = 13;
            }
            c0852f2.g(i8, null);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C0852F c0852f3 = new C0852F(21, this);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else {
                    codeCacheDir = context.getCodeCacheDir();
                }
                if (c.c(codeCacheDir)) {
                    i7 = 14;
                } else {
                    i7 = 15;
                }
                c0852f3.g(i7, null);
                return;
            }
            c0852f3.g(16, null);
        }
    }
}
