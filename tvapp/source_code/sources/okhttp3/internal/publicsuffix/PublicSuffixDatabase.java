package okhttp3.internal.publicsuffix;

import A5.k;
import A5.r;
import A5.t;
import T5.b;
import T5.c;
import T5.h;
import U5.f;
import a.AbstractC0189a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.g;
import p6.l;
import p6.n;
import r0.AbstractC1111a;
import s3.C1209y;
import v6.o;
import v6.z;
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f13093e = {42};
    public static final List f = g.z("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f13094g = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f13095a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f13096b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f13097c;
    public byte[] d;

    public static List c(String str) {
        int i7 = 0;
        List t02 = f.t0(str, new char[]{'.'});
        if (M5.g.a(k.b0(t02), "")) {
            List list = t02;
            int size = t02.size() - 1;
            if (size >= 0) {
                i7 = size;
            }
            return k.i0(list, i7);
        }
        return t02;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List t02;
        List t03;
        List list;
        int i7 = 0;
        String unicode = IDN.toUnicode(str);
        M5.g.e(unicode, "unicodeDomain");
        List c5 = c(unicode);
        if (!this.f13095a.get() && this.f13095a.compareAndSet(false, true)) {
            boolean z7 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z7 = true;
                    } catch (IOException e3) {
                        n nVar = n.f13188a;
                        n.f13188a.getClass();
                        n.i(5, "Failed to read public suffix list", e3);
                        if (z7) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
        } else {
            try {
                this.f13096b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f13097c != null) {
            int size = c5.size();
            byte[][] bArr = new byte[size];
            for (int i8 = 0; i8 < size; i8++) {
                Charset charset = StandardCharsets.UTF_8;
                M5.g.e(charset, "UTF_8");
                byte[] bytes = ((String) c5.get(i8)).getBytes(charset);
                M5.g.e(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i8] = bytes;
            }
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    int i10 = i9 + 1;
                    byte[] bArr2 = this.f13097c;
                    if (bArr2 != null) {
                        str2 = C1209y.b(bArr2, bArr, i9);
                        if (str2 != null) {
                            break;
                        }
                        i9 = i10;
                    } else {
                        M5.g.l("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    bArr3[i11] = f13093e;
                    byte[] bArr4 = this.f13097c;
                    if (bArr4 != null) {
                        str3 = C1209y.b(bArr4, bArr3, i11);
                        if (str3 != null) {
                            break;
                        }
                        i11 = i12;
                    } else {
                        M5.g.l("publicSuffixListBytes");
                        throw null;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i13 = size - 1;
                int i14 = 0;
                while (i14 < i13) {
                    int i15 = i14 + 1;
                    byte[] bArr5 = this.d;
                    if (bArr5 != null) {
                        str4 = C1209y.b(bArr5, bArr, i14);
                        if (str4 != null) {
                            break;
                        }
                        i14 = i15;
                    } else {
                        M5.g.l("publicSuffixExceptionListBytes");
                        throw null;
                    }
                }
            }
            str4 = null;
            if (str4 != null) {
                list = f.t0(M5.g.k(str4, "!"), new char[]{'.'});
            } else if (str2 == null && str3 == null) {
                list = f;
            } else {
                if (str2 == null) {
                    t02 = null;
                } else {
                    t02 = f.t0(str2, new char[]{'.'});
                }
                List list2 = t.f135q;
                if (t02 == null) {
                    t02 = list2;
                }
                if (str3 == null) {
                    t03 = null;
                } else {
                    t03 = f.t0(str3, new char[]{'.'});
                }
                if (t03 != null) {
                    list2 = t03;
                }
                if (t02.size() > list2.size()) {
                    list = t02;
                } else {
                    list = list2;
                }
            }
            if (c5.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
                return null;
            }
            char charAt = ((String) list.get(0)).charAt(0);
            int size2 = c5.size();
            int size3 = list.size();
            if (charAt != '!') {
                size3++;
            }
            int i16 = size2 - size3;
            h rVar = new r(0, c(str));
            if (i16 >= 0) {
                if (i16 != 0) {
                    if (rVar instanceof c) {
                        rVar = ((c) rVar).a(i16);
                    } else {
                        rVar = new b(rVar, i16);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                for (Object obj : rVar) {
                    i7++;
                    if (i7 > 1) {
                        sb.append((CharSequence) ".");
                    }
                    AbstractC0189a.b(sb, obj, null);
                }
                sb.append((CharSequence) "");
                String sb2 = sb.toString();
                M5.g.e(sb2, "toString(...)");
                return sb2;
            }
            throw new IllegalArgumentException(AbstractC1111a.n(i16, "Requested element count ", " is less than zero.").toString());
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        z c5 = l.c(new o(l.M(resourceAsStream)));
        try {
            long readInt = c5.readInt();
            c5.F(readInt);
            byte[] Y6 = c5.f15428r.Y(readInt);
            long readInt2 = c5.readInt();
            c5.F(readInt2);
            byte[] Y7 = c5.f15428r.Y(readInt2);
            l.i(c5, null);
            synchronized (this) {
                this.f13097c = Y6;
                this.d = Y7;
            }
            this.f13096b.countDown();
        } finally {
        }
    }
}
