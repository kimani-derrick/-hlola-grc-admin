package k1;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p6.l;
import z5.C1527i;
/* renamed from: k1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12137a;

    /* renamed from: b  reason: collision with root package name */
    public final C1527i f12138b = new C1527i(C0934g.f12136r);

    /* renamed from: c  reason: collision with root package name */
    public final C1527i f12139c = new C1527i(new D0.h(9, this));

    public C0935h(Context context) {
        this.f12137a = context;
    }

    public static File c(String str, InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        File file = new File(str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    l.i(inputStream, null);
                    l.i(fileOutputStream, null);
                    return file;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                l.i(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r5, java.lang.String r6, F1.t r7, D5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof k1.C0931d
            if (r0 == 0) goto L13
            r0 = r8
            k1.d r0 = (k1.C0931d) r0
            int r1 = r0.f12129x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12129x = r1
            goto L18
        L13:
            k1.d r0 = new k1.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f12127v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f12129x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            k1.h r5 = r0.f12126u
            java.lang.String r6 = r0.f12125t
            k3.AbstractC0958a.H(r8)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r5 = move-exception
            goto L6d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            k3.AbstractC0958a.H(r8)
            z5.i r8 = r4.f12138b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2b
            k1.f r8 = (k1.C0933f) r8     // Catch: java.lang.Throwable -> L2b
            r8.f12135a = r7     // Catch: java.lang.Throwable -> L2b
            z5.i r7 = r4.f12139c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L2b
            k1.c r7 = (k1.InterfaceC0930c) r7     // Catch: java.lang.Throwable -> L2b
            r0.f12125t = r6     // Catch: java.lang.Throwable -> L2b
            r0.f12126u = r4     // Catch: java.lang.Throwable -> L2b
            r0.f12129x = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r7.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L57
            return r1
        L57:
            r5 = r4
        L58:
            h6.I r8 = (h6.I) r8     // Catch: java.lang.Throwable -> L2b
            v6.h r7 = r8.f()     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r7 = r7.T()     // Catch: java.lang.Throwable -> L2b
            r5.getClass()     // Catch: java.lang.Throwable -> L2b
            java.io.File r5 = c(r6, r7)     // Catch: java.lang.Throwable -> L2b
            M5.g.c(r5)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L6d:
            z5.g r5 = k3.AbstractC0958a.m(r5)
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C0935h.a(java.lang.String, java.lang.String, F1.t, D5.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, android.net.Uri r6, F1.t r7, D5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof k1.C0932e
            if (r0 == 0) goto L13
            r0 = r8
            k1.e r0 = (k1.C0932e) r0
            int r1 = r0.f12134x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12134x = r1
            goto L18
        L13:
            k1.e r0 = new k1.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f12132v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f12134x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            k1.h r5 = r0.f12131u
            android.net.Uri r6 = r0.f12130t
            k3.AbstractC0958a.H(r8)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r5 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            k3.AbstractC0958a.H(r8)
            z5.i r8 = r4.f12138b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2b
            k1.f r8 = (k1.C0933f) r8     // Catch: java.lang.Throwable -> L2b
            r8.f12135a = r7     // Catch: java.lang.Throwable -> L2b
            z5.i r7 = r4.f12139c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L2b
            k1.c r7 = (k1.InterfaceC0930c) r7     // Catch: java.lang.Throwable -> L2b
            r0.f12130t = r6     // Catch: java.lang.Throwable -> L2b
            r0.f12131u = r4     // Catch: java.lang.Throwable -> L2b
            r0.f12134x = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r7.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L57
            return r1
        L57:
            r5 = r4
        L58:
            h6.I r8 = (h6.I) r8     // Catch: java.lang.Throwable -> L2b
            v6.h r7 = r8.f()     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r7 = r7.T()     // Catch: java.lang.Throwable -> L2b
            android.net.Uri r5 = r5.d(r6, r7)     // Catch: java.lang.Throwable -> L2b
            M5.g.c(r5)     // Catch: java.lang.Throwable -> L2b
            goto L6e
        L6a:
            z5.g r5 = k3.AbstractC0958a.m(r5)
        L6e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C0935h.b(java.lang.String, android.net.Uri, F1.t, D5.d):java.lang.Object");
    }

    public final Uri d(Uri uri, InputStream inputStream) {
        OutputStream openOutputStream;
        if (inputStream == null || uri == null || (openOutputStream = this.f12137a.getContentResolver().openOutputStream(uri)) == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    openOutputStream.write(bArr, 0, read);
                } else {
                    openOutputStream.flush();
                    l.i(inputStream, null);
                    l.i(openOutputStream, null);
                    return uri;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                l.i(openOutputStream, th);
                throw th2;
            }
        }
    }
}
