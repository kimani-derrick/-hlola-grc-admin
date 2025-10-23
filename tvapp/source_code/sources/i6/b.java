package i6;

import A5.k;
import A5.l;
import M5.g;
import U5.f;
import U5.n;
import h6.G;
import h6.H;
import h6.r;
import h6.t;
import h6.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import o6.C1074c;
import p6.d;
import u4.C1288l;
import v6.C1344i;
import v6.F;
import v6.InterfaceC1343h;
import v6.u;
import w4.l0;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11390a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f11391b = d.u(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final H f11392c;
    public static final u d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f11393e;
    public static final U5.d f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f11394g;

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, v6.h, v6.f] */
    static {
        byte[] bArr = new byte[0];
        f11390a = bArr;
        ?? obj = new Object();
        obj.g0(bArr, 0, 0);
        long j7 = 0;
        f11392c = new H(null, j7, obj, 0);
        c(j7, j7, j7);
        C1344i c1344i = C1344i.f15389t;
        d = l0.z(C1288l.c("efbbbf"), C1288l.c("feff"), C1288l.c("fffe"), C1288l.c("0000ffff"), C1288l.c("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        g.c(timeZone);
        f11393e = timeZone;
        f = new U5.d("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String q02 = f.q0(z.class.getName(), "okhttp3.");
        if (n.V(q02, "Client", false)) {
            q02 = q02.substring(0, q02.length() - "Client".length());
            g.e(q02, "substring(...)");
        }
        f11394g = q02;
    }

    public static final void A(IOException iOException, List list) {
        g.f(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(t tVar, t tVar2) {
        g.f(tVar, "<this>");
        g.f(tVar2, "other");
        if (g.a(tVar.d, tVar2.d) && tVar.f11207e == tVar2.f11207e && g.a(tVar.f11204a, tVar2.f11204a)) {
            return true;
        }
        return false;
    }

    public static final int b(long j7, TimeUnit timeUnit) {
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j7);
                if (millis <= 2147483647L) {
                    if (millis == 0 && i7 > 0) {
                        throw new IllegalArgumentException(g.k(" too small.", "timeout").toString());
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException(g.k(" too large.", "timeout").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(g.k(" < 0", "timeout").toString());
    }

    public static final void c(long j7, long j8, long j9) {
        if ((j8 | j9) >= 0 && j8 <= j7 && j7 - j8 >= j9) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final void d(Closeable closeable) {
        g.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e7) {
            if (g.a(e7.getMessage(), "bio == null")) {
                return;
            }
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final int f(int i7, int i8, String str, String str2) {
        g.f(str, "<this>");
        while (i7 < i8) {
            int i9 = i7 + 1;
            if (f.c0(str2, str.charAt(i7))) {
                return i7;
            }
            i7 = i9;
        }
        return i8;
    }

    public static final int g(String str, char c5, int i7, int i8) {
        g.f(str, "<this>");
        while (i7 < i8) {
            int i9 = i7 + 1;
            if (str.charAt(i7) == c5) {
                return i7;
            }
            i7 = i9;
        }
        return i8;
    }

    public static final boolean h(F f7, TimeUnit timeUnit) {
        g.f(f7, "<this>");
        g.f(timeUnit, "timeUnit");
        try {
            return u(f7, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        g.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        boolean z7;
        g.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                int i8 = 0;
                while (true) {
                    if (i8 < strArr2.length) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        int i9 = i8 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i8]) == 0) {
                                return true;
                            }
                            i8 = i9;
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            throw new NoSuchElementException(e3.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(G g7) {
        String b7 = g7.f11100v.b("Content-Length");
        if (b7 != null) {
            try {
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return Long.parseLong(b7);
    }

    public static final List l(Object... objArr) {
        g.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(l.L(Arrays.copyOf(objArr2, objArr2.length)));
        g.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 1;
            char charAt = str.charAt(i7);
            if (g.h(charAt, 31) > 0 && g.h(charAt, 127) < 0) {
                i7 = i8;
            } else {
                return i7;
            }
        }
        return -1;
    }

    public static final int n(int i7, int i8, String str) {
        g.f(str, "<this>");
        while (i7 < i8) {
            int i9 = i7 + 1;
            char charAt = str.charAt(i7);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i7 = i9;
            } else {
                return i7;
            }
        }
        return i8;
    }

    public static final int o(int i7, int i8, String str) {
        g.f(str, "<this>");
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                int i10 = i9 - 1;
                char charAt = str.charAt(i9);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i9 == i7) {
                        break;
                    }
                    i9 = i10;
                } else {
                    return i9 + 1;
                }
            }
        }
        return i7;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        g.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i7 = 0;
        while (i7 < length) {
            String str = strArr[i7];
            i7++;
            int length2 = strArr2.length;
            int i8 = 0;
            while (true) {
                if (i8 < length2) {
                    String str2 = strArr2[i8];
                    i8++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(String str) {
        g.f(str, "name");
        if (!n.W(str, "Authorization") && !n.W(str, "Cookie") && !n.W(str, "Proxy-Authorization") && !n.W(str, "Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int r(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' <= c5 && c5 < 'G') {
            return c5 - '7';
        }
        return -1;
    }

    public static final Charset s(InterfaceC1343h interfaceC1343h, Charset charset) {
        Charset charset2;
        String str;
        Charset charset3;
        g.f(interfaceC1343h, "<this>");
        g.f(charset, "default");
        int z7 = interfaceC1343h.z(d);
        if (z7 != -1) {
            if (z7 != 0) {
                if (z7 != 1) {
                    if (z7 != 2) {
                        if (z7 != 3) {
                            if (z7 == 4) {
                                Charset charset4 = U5.a.f3474a;
                                charset3 = U5.a.f3475b;
                                if (charset3 == null) {
                                    charset3 = Charset.forName("UTF-32LE");
                                    g.e(charset3, "forName(...)");
                                    U5.a.f3475b = charset3;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset5 = U5.a.f3474a;
                            charset3 = U5.a.f3476c;
                            if (charset3 == null) {
                                charset3 = Charset.forName("UTF-32BE");
                                g.e(charset3, "forName(...)");
                                U5.a.f3476c = charset3;
                            }
                        }
                        return charset3;
                    }
                    charset2 = StandardCharsets.UTF_16LE;
                    str = "UTF_16LE";
                } else {
                    charset2 = StandardCharsets.UTF_16BE;
                    str = "UTF_16BE";
                }
            } else {
                charset2 = StandardCharsets.UTF_8;
                str = "UTF_8";
            }
            g.e(charset2, str);
            return charset2;
        }
        return charset;
    }

    public static final int t(InterfaceC1343h interfaceC1343h) {
        g.f(interfaceC1343h, "<this>");
        return (interfaceC1343h.readByte() & 255) | ((interfaceC1343h.readByte() & 255) << 16) | ((interfaceC1343h.readByte() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, v6.f] */
    public static final boolean u(F f7, int i7, TimeUnit timeUnit) {
        long j7;
        g.f(f7, "<this>");
        g.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (f7.d().e()) {
            j7 = f7.d().c() - nanoTime;
        } else {
            j7 = Long.MAX_VALUE;
        }
        f7.d().d(Math.min(j7, timeUnit.toNanos(i7)) + nanoTime);
        try {
            ?? obj = new Object();
            while (f7.L(obj, 8192L) != -1) {
                obj.b();
            }
            int i8 = (j7 > Long.MAX_VALUE ? 1 : (j7 == Long.MAX_VALUE ? 0 : -1));
            v6.H d7 = f7.d();
            if (i8 == 0) {
                d7.a();
            } else {
                d7.d(nanoTime + j7);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i9 = (j7 > Long.MAX_VALUE ? 1 : (j7 == Long.MAX_VALUE ? 0 : -1));
            v6.H d8 = f7.d();
            if (i9 == 0) {
                d8.a();
            } else {
                d8.d(nanoTime + j7);
            }
            return false;
        } catch (Throwable th) {
            int i10 = (j7 > Long.MAX_VALUE ? 1 : (j7 == Long.MAX_VALUE ? 0 : -1));
            v6.H d9 = f7.d();
            if (i10 == 0) {
                d9.a();
            } else {
                d9.d(nanoTime + j7);
            }
            throw th;
        }
    }

    public static final r v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1074c c1074c = (C1074c) it.next();
            String q5 = c1074c.f12997a.q();
            String q7 = c1074c.f12998b.q();
            arrayList.add(q5);
            arrayList.add(f.C0(q7).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new r((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String w(t tVar, boolean z7) {
        int i7;
        g.f(tVar, "<this>");
        String str = tVar.d;
        if (f.d0(str, ":")) {
            str = "[" + str + ']';
        }
        int i8 = tVar.f11207e;
        if (!z7) {
            String str2 = tVar.f11204a;
            g.f(str2, "scheme");
            if (g.a(str2, "http")) {
                i7 = 80;
            } else if (g.a(str2, "https")) {
                i7 = 443;
            } else {
                i7 = -1;
            }
            if (i8 == i7) {
                return str;
            }
        }
        return str + ':' + i8;
    }

    public static final List x(List list) {
        g.f(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(k.m0(list));
        g.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(String str, int i7) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i7;
            }
        }
        if (valueOf == null) {
            return i7;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String z(int i7, int i8, String str) {
        int n = n(i7, i8, str);
        String substring = str.substring(n, o(n, i8, str));
        g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
