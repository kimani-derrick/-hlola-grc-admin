package d3;

import a.AbstractC0189a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.F;
import j3.AbstractC0838b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import l3.BinderC0971b;
import o3.AbstractC1068b;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final i f9241a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f9242b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile g3.m f9243c;
    public static final Object d;

    /* renamed from: e  reason: collision with root package name */
    public static Context f9244e;

    static {
        new i(0, j.z("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new i(1, j.z("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f9241a = new i(2, j.z("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f9242b = new i(3, j.z("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static synchronized void a(Context context) {
        synchronized (m.class) {
            if (f9244e == null) {
                if (context != null) {
                    f9244e = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [d3.h] */
    public static p b(final String str, final j jVar, final boolean z7, boolean z8) {
        j jVar2;
        try {
            c();
            g3.n.g(f9244e);
            try {
                g3.m mVar = f9243c;
                BinderC0971b binderC0971b = new BinderC0971b(f9244e.getPackageManager());
                g3.k kVar = (g3.k) mVar;
                Parcel A6 = kVar.A();
                int i7 = AbstractC1068b.f12916a;
                boolean z9 = true;
                A6.writeInt(1);
                int P6 = AbstractC0189a.P(A6, 20293);
                AbstractC0189a.M(A6, 1, str);
                if (jVar == null) {
                    Log.w("GoogleCertificatesQuery", "certificate binder is null");
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                AbstractC0189a.K(A6, 2, jVar2);
                AbstractC0189a.R(A6, 3, 4);
                A6.writeInt(z7 ? 1 : 0);
                AbstractC0189a.R(A6, 4, 4);
                A6.writeInt(z8 ? 1 : 0);
                AbstractC0189a.Q(A6, P6);
                AbstractC1068b.c(A6, binderC0971b);
                Parcel z10 = kVar.z(A6, 5);
                if (z10.readInt() == 0) {
                    z9 = false;
                }
                z10.recycle();
                if (z9) {
                    return p.d;
                }
                return new o(new Callable() { // from class: d3.h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str2;
                        MessageDigest messageDigest;
                        boolean z11 = z7;
                        String str3 = str;
                        j jVar3 = jVar;
                        if (!z11 && m.b(str3, jVar3, true, false).f9250a) {
                            str2 = "debug cert rejected";
                        } else {
                            str2 = "not allowed";
                        }
                        int i8 = 0;
                        while (true) {
                            if (i8 < 2) {
                                try {
                                    messageDigest = MessageDigest.getInstance("SHA-256");
                                } catch (NoSuchAlgorithmException unused) {
                                }
                                if (messageDigest != null) {
                                    break;
                                }
                                i8++;
                            } else {
                                messageDigest = null;
                                break;
                            }
                        }
                        g3.n.g(messageDigest);
                        byte[] digest = messageDigest.digest(jVar3.A());
                        int length = digest.length;
                        char[] cArr = new char[length + length];
                        int i9 = 0;
                        for (byte b7 : digest) {
                            char[] cArr2 = AbstractC0838b.f11849b;
                            cArr[i9] = cArr2[(b7 & 255) >>> 4];
                            cArr[i9 + 1] = cArr2[b7 & 15];
                            i9 += 2;
                        }
                        return str2 + ": pkg=" + str3 + ", sha256=" + new String(cArr) + ", atk=" + z11 + ", ver=12451000.false";
                    }
                });
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return new p(false, "module call", e3);
            }
        } catch (m3.b e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            return new p(false, "module init: ".concat(String.valueOf(e7.getMessage())), e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [g3.m] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void c() {
        g3.m f;
        if (f9243c != null) {
            return;
        }
        g3.n.g(f9244e);
        synchronized (d) {
            try {
                if (f9243c == null) {
                    IBinder b7 = m3.e.c(f9244e, m3.e.f12418c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i7 = g3.l.d;
                    if (b7 == null) {
                        f = 0;
                    } else {
                        IInterface queryLocalInterface = b7.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof g3.m) {
                            f = (g3.m) queryLocalInterface;
                        } else {
                            f = new F(b7, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                        }
                    }
                    f9243c = f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
