package Y2;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class B extends AbstractC0138g {

    /* renamed from: u  reason: collision with root package name */
    public RandomAccessFile f4320u;

    /* renamed from: v  reason: collision with root package name */
    public Uri f4321v;

    /* renamed from: w  reason: collision with root package name */
    public long f4322w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4323x;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r1 != false) goto L32;
     */
    @Override // Y2.InterfaceC0144m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(Y2.C0148q r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f4422a
            long r1 = r9.f
            r8.f4321v = r0
            r8.k()
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r6.getClass()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r8.f4320u = r5
            r5.seek(r1)     // Catch: java.io.IOException -> L30
            long r4 = r9.f4426g     // Catch: java.io.IOException -> L30
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r8.f4320u     // Catch: java.io.IOException -> L30
            long r4 = r0.length()     // Catch: java.io.IOException -> L30
            long r4 = r4 - r1
            goto L32
        L30:
            r9 = move-exception
            goto L4c
        L32:
            r8.f4322w = r4     // Catch: java.io.IOException -> L30
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            r0 = 1
            r8.f4323x = r0
            r8.l(r9)
            long r0 = r8.f4322w
            return r0
        L43:
            Y2.A r9 = new Y2.A
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r1, r0, r0)
            throw r9
        L4c:
            Y2.A r0 = new Y2.A
            r0.<init>(r3, r9)
            throw r0
        L52:
            r9 = move-exception
            goto L58
        L54:
            r9 = move-exception
            goto L5e
        L56:
            r9 = move-exception
            goto L64
        L58:
            Y2.A r0 = new Y2.A
            r0.<init>(r3, r9)
            throw r0
        L5e:
            Y2.A r0 = new Y2.A
            r0.<init>(r4, r9)
            throw r0
        L64:
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            Y2.A r0 = new Y2.A
            int r1 = Z2.H.f4603a
            r2 = 21
            if (r1 < r2) goto L8b
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = Y2.z.a(r1)
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r4 = 2005(0x7d5, float:2.81E-42)
        L8d:
            r0.<init>(r4, r9)
            throw r0
        L91:
            Y2.A r1 = new Y2.A
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getQuery()
            java.lang.String r0 = r0.getFragment()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ",query="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ",fragment="
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r2, r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.B.c(Y2.q):long");
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        this.f4321v = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f4320u;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e3) {
                throw new C0145n(2000, e3);
            }
        } finally {
            this.f4320u = null;
            if (this.f4323x) {
                this.f4323x = false;
                h();
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f4321v;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4322w;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f4320u;
            int i9 = Z2.H.f4603a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j7, i8));
            if (read > 0) {
                this.f4322w -= read;
                a(read);
            }
            return read;
        } catch (IOException e3) {
            throw new C0145n(2000, e3);
        }
    }
}
