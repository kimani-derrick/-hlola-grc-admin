package v4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import u4.AbstractC1284h;
/* renamed from: v4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334l implements InterfaceC1325c {

    /* renamed from: t  reason: collision with root package name */
    public static final Charset f15349t = Charset.forName("UTF-8");

    /* renamed from: q  reason: collision with root package name */
    public final File f15350q;

    /* renamed from: r  reason: collision with root package name */
    public final int f15351r = 65536;

    /* renamed from: s  reason: collision with root package name */
    public C1333k f15352s;

    public C1334l(File file) {
        this.f15350q = file;
    }

    public final void a() {
        File file = this.f15350q;
        if (this.f15352s == null) {
            try {
                this.f15352s = new C1333k(file);
            } catch (IOException e3) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e3);
            }
        }
    }

    @Override // v4.InterfaceC1325c
    public final void b() {
        AbstractC1284h.c(this.f15352s, "There was a problem closing the Crashlytics log file.");
        this.f15352s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // v4.InterfaceC1325c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r7 = this;
            java.io.File r0 = r7.f15350q
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L38
        Lc:
            r7.a()
            v4.k r0 = r7.f15352s
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.V()
            byte[] r0 = new byte[r0]
            v4.k r4 = r7.f15352s     // Catch: java.io.IOException -> L29
            v4.e r5 = new v4.e     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.h(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            H.j r4 = new H.j
            r3 = r3[r2]
            r4.<init>(r3, r0)
        L38:
            if (r4 != 0) goto L3c
            r3 = r1
            goto L47
        L3c:
            int r0 = r4.f793q
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f794r
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L47:
            if (r3 == 0) goto L50
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = v4.C1334l.f15349t
            r1.<init>(r3, r0)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C1334l.c():java.lang.String");
    }

    @Override // v4.InterfaceC1325c
    public final void d(long j7, String str) {
        int i7;
        a();
        int i8 = this.f15351r;
        if (this.f15352s != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > i8 / 4) {
                    str = "..." + str.substring(str.length() - i7);
                }
                this.f15352s.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j7), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f15349t));
                while (!this.f15352s.j() && this.f15352s.V() > i8) {
                    this.f15352s.x();
                }
            } catch (IOException e3) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e3);
            }
        }
    }
}
