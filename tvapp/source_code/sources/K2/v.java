package K2;

import Z2.E;
import Z2.y;
import android.text.TextUtils;
import e2.C0593J;
import e2.m0;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C0943h;
import k2.C0950o;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
/* loaded from: classes.dex */
public final class v implements InterfaceC0946k {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f1821g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f1822h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final String f1823a;

    /* renamed from: b  reason: collision with root package name */
    public final E f1824b;
    public InterfaceC0948m d;
    public int f;

    /* renamed from: c  reason: collision with root package name */
    public final y f1825c = new y();

    /* renamed from: e  reason: collision with root package name */
    public byte[] f1826e = new byte[1024];

    public v(String str, E e3) {
        this.f1823a = str;
        this.f1824b = e3;
    }

    public final w b(long j7) {
        w q5 = this.d.q(0, 3);
        C0593J c0593j = new C0593J();
        c0593j.f9605k = "text/vtt";
        c0593j.f9599c = this.f1823a;
        c0593j.f9608o = j7;
        q5.e(c0593j.a());
        this.d.l();
        return q5;
    }

    @Override // k2.InterfaceC0946k
    public final int d(InterfaceC0947l interfaceC0947l, U4.k kVar) {
        String h7;
        int length;
        this.d.getClass();
        C0943h c0943h = (C0943h) interfaceC0947l;
        int i7 = (int) c0943h.f12165s;
        int i8 = this.f;
        byte[] bArr = this.f1826e;
        if (i8 == bArr.length) {
            if (i7 != -1) {
                length = i7;
            } else {
                length = bArr.length;
            }
            this.f1826e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f1826e;
        int i9 = this.f;
        int r3 = c0943h.r(bArr2, i9, bArr2.length - i9);
        if (r3 != -1) {
            int i10 = this.f + r3;
            this.f = i10;
            if (i7 == -1 || i10 != i7) {
                return 0;
            }
        }
        y yVar = new y(this.f1826e);
        V2.j.d(yVar);
        String h8 = yVar.h(N3.e.f2497c);
        long j7 = 0;
        long j8 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(h8)) {
                if (h8.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f1821g.matcher(h8);
                    if (matcher2.find()) {
                        Matcher matcher3 = f1822h.matcher(h8);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j8 = V2.j.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j7 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw m0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h8), null);
                        }
                    } else {
                        throw m0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h8), null);
                    }
                }
                h8 = yVar.h(N3.e.f2497c);
            } else {
                while (true) {
                    String h9 = yVar.h(N3.e.f2497c);
                    if (h9 == null) {
                        break;
                    } else if (V2.j.f3653a.matcher(h9).matches()) {
                        do {
                            h7 = yVar.h(N3.e.f2497c);
                            if (h7 != null) {
                            }
                        } while (!h7.isEmpty());
                    } else {
                        Matcher matcher4 = V2.h.f3649a.matcher(h9);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c5 = V2.j.c(group3);
                long b7 = this.f1824b.b(((((j7 + c5) - j8) * 90000) / 1000000) % 8589934592L);
                w b8 = b(b7 - c5);
                byte[] bArr3 = this.f1826e;
                int i11 = this.f;
                y yVar2 = this.f1825c;
                yVar2.D(i11, bArr3);
                b8.d(this.f, yVar2);
                b8.c(b7, 1, this.f, 0, null);
                return -1;
            }
        }
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.d = interfaceC0948m;
        interfaceC0948m.t(new C0950o(-9223372036854775807L));
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        throw new IllegalStateException();
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        C0943h c0943h = (C0943h) interfaceC0947l;
        c0943h.i(this.f1826e, 0, 6, false);
        byte[] bArr = this.f1826e;
        y yVar = this.f1825c;
        yVar.D(6, bArr);
        if (V2.j.a(yVar)) {
            return true;
        }
        c0943h.i(this.f1826e, 6, 3, false);
        yVar.D(9, this.f1826e);
        return V2.j.a(yVar);
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
