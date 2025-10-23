package u4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: u4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1284h {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f14999a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static ExecutorService a(String str) {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new x(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new y(str, unconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for ".concat(str)));
        return unconfigurableExecutorService;
    }

    public static synchronized long b(Context context) {
        long j7;
        synchronized (AbstractC1284h.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j7 = memoryInfo.totalMem;
        }
        return j7;
    }

    public static void c(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e3) {
                Log.e("FirebaseCrashlytics", str, e3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean g7 = g();
        ?? r02 = g7;
        if (h()) {
            r02 = (g7 ? 1 : 0) | true;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return r02 | 4;
        }
        return r02;
    }

    public static int e(String str, String str2, Context context) {
        String resourcePackageName;
        Resources resources = context.getResources();
        int i7 = context.getApplicationContext().getApplicationInfo().icon;
        if (i7 > 0) {
            try {
                resourcePackageName = context.getResources().getResourcePackageName(i7);
                if ("android".equals(resourcePackageName)) {
                    resourcePackageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
            }
            return resources.getIdentifier(str, str2, resourcePackageName);
        }
        resourcePackageName = context.getPackageName();
        return resources.getIdentifier(str, str2, resourcePackageName);
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            int i8 = i7 * 2;
            char[] cArr2 = f14999a;
            cArr[i8] = cArr2[(b7 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        boolean g7 = g();
        String str = Build.TAGS;
        if ((!g7 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!g7 && file.exists()) {
            return true;
        }
        return false;
    }

    public static String i(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return f(messageDigest.digest());
        } catch (NoSuchAlgorithmException e3) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e3);
            return "";
        }
    }

    public static String j(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
}
