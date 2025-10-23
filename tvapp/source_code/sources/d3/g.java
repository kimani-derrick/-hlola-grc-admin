package d3;

import a.AbstractC0189a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import l3.BinderC0971b;
import o3.AbstractC1068b;
import w4.l0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static g f9231c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f9232a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f9233b;

    public g() {
        this.f9232a = new CopyOnWriteArraySet();
    }

    public static g a(Context context) {
        g3.n.g(context);
        synchronized (g.class) {
            try {
                if (f9231c == null) {
                    m.a(context);
                    f9231c = new g(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9231c;
    }

    public static final j c(PackageInfo packageInfo, j... jVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            k kVar = new k(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < jVarArr.length; i7++) {
                if (jVarArr[i7].equals(kVar)) {
                    return jVarArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L46
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L46
            d3.j[] r4 = d3.l.f9240a
            if (r5 == 0) goto L39
            d3.j r4 = c(r2, r4)
            goto L43
        L39:
            r4 = r4[r1]
            d3.j[] r5 = new d3.j[r0]
            r5[r1] = r4
            d3.j r4 = c(r2, r5)
        L43:
            if (r4 == 0) goto L46
            return r0
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.g.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean b(int i7) {
        p pVar;
        int length;
        boolean z7;
        ApplicationInfo applicationInfo;
        p pVar2;
        n nVar;
        PackageManager.NameNotFoundException nameNotFoundException;
        int i8 = 1;
        String[] packagesForUid = ((Context) this.f9232a).getPackageManager().getPackagesForUid(i7);
        Exception exc = null;
        boolean z8 = false;
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            pVar = null;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    String str = packagesForUid[i9];
                    if (str == null) {
                        pVar = new p(z8, "null pkg", exc);
                    } else if (!str.equals((String) this.f9233b)) {
                        i iVar = m.f9241a;
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                m.c();
                                z7 = ((g3.k) m.f9243c).D();
                            } finally {
                            }
                        } catch (RemoteException | m3.b e3) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                            z7 = z8;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        if (z7) {
                            boolean a7 = f.a((Context) this.f9232a);
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            try {
                                g3.n.g(m.f9244e);
                                try {
                                    m.c();
                                    Context context = (Context) BinderC0971b.A(BinderC0971b.z(new BinderC0971b(m.f9244e)));
                                    try {
                                        g3.k kVar = (g3.k) m.f9243c;
                                        Parcel A6 = kVar.A();
                                        int i10 = AbstractC1068b.f12916a;
                                        A6.writeInt(i8);
                                        int P6 = AbstractC0189a.P(A6, 20293);
                                        AbstractC0189a.M(A6, i8, str);
                                        AbstractC0189a.R(A6, 2, 4);
                                        A6.writeInt(a7 ? 1 : 0);
                                        AbstractC0189a.R(A6, 3, 4);
                                        A6.writeInt(0);
                                        AbstractC0189a.K(A6, 4, new BinderC0971b(context));
                                        AbstractC0189a.R(A6, 5, 4);
                                        A6.writeInt(0);
                                        AbstractC0189a.R(A6, 6, 4);
                                        A6.writeInt(1);
                                        AbstractC0189a.Q(A6, P6);
                                        Parcel z9 = kVar.z(A6, 6);
                                        nVar = (n) AbstractC1068b.a(z9, n.CREATOR);
                                        z9.recycle();
                                    } catch (RemoteException e7) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                                        pVar2 = new p(false, "module call", e7);
                                    }
                                } catch (m3.b e8) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                                    pVar2 = new p(false, "module init: ".concat(String.valueOf(e8.getMessage())), e8);
                                }
                                if (nVar.f9245q) {
                                    l0.a0(nVar.f9248t);
                                    pVar = new p(true, null, null);
                                } else {
                                    String str2 = nVar.f9246r;
                                    if (AbstractC0189a.O(nVar.f9247s) == 4) {
                                        nameNotFoundException = new PackageManager.NameNotFoundException();
                                    } else {
                                        nameNotFoundException = null;
                                    }
                                    if (str2 == null) {
                                        str2 = "error checking package certificate";
                                    }
                                    l0.a0(nVar.f9248t);
                                    AbstractC0189a.O(nVar.f9247s);
                                    pVar2 = new p(false, str2, nameNotFoundException);
                                    pVar = pVar2;
                                }
                            } finally {
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = ((Context) this.f9232a).getPackageManager().getPackageInfo(str, 64);
                                boolean a8 = f.a((Context) this.f9232a);
                                if (packageInfo == null) {
                                    pVar = new p(false, "null pkg", null);
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr != null && signatureArr.length == 1) {
                                        k kVar2 = new k(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                        try {
                                            p b7 = m.b(str3, kVar2, a8, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                            if (b7.f9250a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    p b8 = m.b(str3, kVar2, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                    if (b8.f9250a) {
                                                        pVar = new p(false, "debuggable release cert app rejected", null);
                                                    }
                                                } finally {
                                                }
                                            }
                                            pVar = b7;
                                        } finally {
                                        }
                                    } else {
                                        pVar = new p(false, "single cert required", null);
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e9) {
                                pVar = new p(false, "no pkg ".concat(str), e9);
                            }
                        }
                        if (pVar.f9250a) {
                            this.f9233b = str;
                        }
                    } else {
                        pVar = p.d;
                    }
                    if (pVar.f9250a) {
                        break;
                    }
                    i8 = 1;
                    i9++;
                    exc = null;
                    z8 = false;
                } else {
                    g3.n.g(pVar);
                    break;
                }
            }
        } else {
            pVar = new p(false, "no pkgs", null);
        }
        if (!pVar.f9250a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th = pVar.f9252c;
            if (th != null) {
                Log.d("GoogleCertificatesRslt", pVar.a(), th);
            } else {
                Log.d("GoogleCertificatesRslt", pVar.a());
            }
        }
        return pVar.f9250a;
    }

    public g(Context context) {
        this.f9232a = context.getApplicationContext();
    }
}
