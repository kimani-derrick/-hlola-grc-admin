package Z2;

import Y2.C0149s;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import d4.InterfaceC0554a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class x implements InterfaceC0554a {

    /* renamed from: u  reason: collision with root package name */
    public static x f4685u;

    /* renamed from: q  reason: collision with root package name */
    public int f4686q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f4687r;

    /* renamed from: s  reason: collision with root package name */
    public final Serializable f4688s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f4689t;

    public x(Context context) {
        this.f4687r = new Handler(Looper.getMainLooper());
        this.f4688s = new CopyOnWriteArrayList();
        this.f4689t = new Object();
        this.f4686q = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new w(0, this), intentFilter);
    }

    public static void a(x xVar, int i7) {
        synchronized (xVar.f4689t) {
            try {
                if (xVar.f4686q != i7) {
                    xVar.f4686q = i7;
                    Iterator it = ((CopyOnWriteArrayList) xVar.f4688s).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        C0149s c0149s = (C0149s) weakReference.get();
                        if (c0149s != null) {
                            c0149s.a(i7);
                        } else {
                            ((CopyOnWriteArrayList) xVar.f4688s).remove(weakReference);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            try {
                if (f4685u == null) {
                    f4685u = new x(context);
                }
                xVar = f4685u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public int c() {
        int i7;
        synchronized (this.f4689t) {
            i7 = this.f4686q;
        }
        return i7;
    }

    @Override // d4.InterfaceC0554a
    public byte[] d(int i7, byte[] bArr) {
        if (i7 <= this.f4686q) {
            f4.l lVar = (f4.l) this.f4687r;
            ((Mac) lVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) lVar.get()).doFinal(), i7);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r4.equals("HMACSHA256") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(java.lang.String r4, javax.crypto.spec.SecretKeySpec r5) {
        /*
            r3 = this;
            r3.<init>()
            f4.l r0 = new f4.l
            r0.<init>(r3)
            r3.f4687r = r0
            r1 = 2
            boolean r2 = r0.AbstractC1111a.f(r1)
            if (r2 == 0) goto L88
            r3.f4688s = r4
            r3.f4689t = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r2 = 16
            if (r5 < r2) goto L80
            int r5 = r4.hashCode()
            r2 = -1
            switch(r5) {
                case -1823053428: goto L52;
                case 392315023: goto L47;
                case 392315118: goto L3e;
                case 392316170: goto L33;
                case 392317873: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r2
            goto L5c
        L28:
            java.lang.String r5 = "HMACSHA512"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L31
            goto L26
        L31:
            r1 = 4
            goto L5c
        L33:
            java.lang.String r5 = "HMACSHA384"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L3c
            goto L26
        L3c:
            r1 = 3
            goto L5c
        L3e:
            java.lang.String r5 = "HMACSHA256"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5c
            goto L26
        L47:
            java.lang.String r5 = "HMACSHA224"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L50
            goto L26
        L50:
            r1 = 1
            goto L5c
        L52:
            java.lang.String r5 = "HMACSHA1"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5b
            goto L26
        L5b:
            r1 = 0
        L5c:
            switch(r1) {
                case 0: goto L79;
                case 1: goto L76;
                case 2: goto L73;
                case 3: goto L70;
                case 4: goto L6b;
                default: goto L5f;
            }
        L5f:
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L6b:
            r4 = 64
        L6d:
            r3.f4686q = r4
            goto L7c
        L70:
            r4 = 48
            goto L6d
        L73:
            r4 = 32
            goto L6d
        L76:
            r4 = 28
            goto L6d
        L79:
            r4 = 20
            goto L6d
        L7c:
            r0.get()
            return
        L80:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        L88:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.x.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }
}
