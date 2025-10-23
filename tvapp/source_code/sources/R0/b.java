package R0;

import M5.g;
import android.graphics.Bitmap;
import h6.G;
import h6.r;
import java.util.ArrayList;
import v6.y;
import v6.z;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1522d f2864a = h4.b.A(new a(this, 0));

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1522d f2865b = h4.b.A(new a(this, 1));

    /* renamed from: c  reason: collision with root package name */
    public final long f2866c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2867e;
    public final r f;

    public b(G g7) {
        this.f2866c = g7.f11091A;
        this.d = g7.f11092B;
        this.f2867e = g7.f11099u != null;
        this.f = g7.f11100v;
    }

    public final void a(y yVar) {
        long j7;
        yVar.I(this.f2866c);
        yVar.N(10);
        yVar.I(this.d);
        yVar.N(10);
        if (this.f2867e) {
            j7 = 1;
        } else {
            j7 = 0;
        }
        yVar.I(j7);
        yVar.N(10);
        r rVar = this.f;
        yVar.I(rVar.size());
        yVar.N(10);
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            yVar.G(rVar.f(i7));
            yVar.G(": ");
            yVar.G(rVar.h(i7));
            yVar.N(10);
        }
    }

    public b(z zVar) {
        this.f2866c = Long.parseLong(zVar.o(Long.MAX_VALUE));
        this.d = Long.parseLong(zVar.o(Long.MAX_VALUE));
        this.f2867e = Integer.parseInt(zVar.o(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(zVar.o(Long.MAX_VALUE));
        ArrayList arrayList = new ArrayList(20);
        for (int i7 = 0; i7 < parseInt; i7++) {
            String o7 = zVar.o(Long.MAX_VALUE);
            Bitmap.Config[] configArr = X0.e.f4059a;
            int i02 = U5.f.i0(o7, ':', 0, false, 6);
            if (i02 != -1) {
                String substring = o7.substring(0, i02);
                g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = U5.f.C0(substring).toString();
                String substring2 = o7.substring(i02 + 1);
                g.e(substring2, "this as java.lang.String).substring(startIndex)");
                g.f(obj, "name");
                if (obj.length() > 0) {
                    int length = obj.length();
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = i8 + 1;
                        char charAt = obj.charAt(i8);
                        if ('!' > charAt || charAt >= 127) {
                            throw new IllegalArgumentException(i6.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i8), obj).toString());
                        }
                        i8 = i9;
                    }
                    arrayList.add(obj);
                    arrayList.add(U5.f.C0(substring2).toString());
                } else {
                    throw new IllegalArgumentException("name is empty".toString());
                }
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(o7).toString());
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            this.f = new r((String[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
