package j3;

import T1.j;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import d3.f;
import d3.g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import k3.C0959b;
/* renamed from: j3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0838b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11848a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f11849b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f11850c;
    public static Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f11851e;
    public static String f;

    /* renamed from: g  reason: collision with root package name */
    public static int f11852g;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length; i7++) {
            char[] cArr = f11848a;
            sb.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb.append(cArr[bArr[i7] & 15]);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = j3.AbstractC0838b.f
            if (r1 != 0) goto L68
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L13
            java.lang.String r0 = I.d.n()
            j3.AbstractC0838b.f = r0
            goto L68
        L13:
            int r1 = j3.AbstractC0838b.f11852g
            if (r1 != 0) goto L1d
            int r1 = android.os.Process.myPid()
            j3.AbstractC0838b.f11852g = r1
        L1d:
            r2 = 0
            if (r1 > 0) goto L21
            goto L66
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            r3.append(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
            g3.n.g(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
        L4e:
            r3.close()     // Catch: java.io.IOException -> L66
            goto L66
        L52:
            r0 = move-exception
            r2 = r3
            goto L5c
        L55:
            r0 = move-exception
            goto L5c
        L57:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            throw r0     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r0
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L66
            goto L4e
        L66:
            j3.AbstractC0838b.f = r2
        L68:
            java.lang.String r0 = j3.AbstractC0838b.f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.AbstractC0838b.b():java.lang.String");
    }

    public static byte[] c(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo c5 = C0959b.a(context).c(str, 64);
        Signature[] signatureArr = c5.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i7 = 0;
            while (true) {
                if (i7 < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i7++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(c5.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean d(Context context, int i7) {
        if (e(i7, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                g a7 = g.a(context);
                a7.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!g.d(packageInfo, false)) {
                    if (!g.d(packageInfo, true)) {
                        return false;
                    }
                    if (!f.a((Context) a7.f9232a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean e(int i7, Context context, String str) {
        j a7 = C0959b.a(context);
        a7.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a7.f3243a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i7, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
