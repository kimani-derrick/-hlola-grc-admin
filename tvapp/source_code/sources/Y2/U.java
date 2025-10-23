package Y2;

import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: h  reason: collision with root package name */
    public static final H.b f4358h = new H.b(14);

    /* renamed from: i  reason: collision with root package name */
    public static final H.b f4359i = new H.b(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f4360a;

    /* renamed from: e  reason: collision with root package name */
    public int f4363e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f4364g;

    /* renamed from: c  reason: collision with root package name */
    public final T[] f4362c = new T[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4361b = new ArrayList();
    public int d = -1;

    public U(int i7) {
        this.f4360a = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i7, float f) {
        T t5;
        int i8;
        T t7;
        int i9;
        int i10 = this.d;
        ArrayList arrayList = this.f4361b;
        if (i10 != 1) {
            Collections.sort(arrayList, f4358h);
            this.d = 1;
        }
        int i11 = this.f4364g;
        T[] tArr = this.f4362c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f4364g = i12;
            t5 = tArr[i12];
        } else {
            t5 = new Object();
        }
        int i13 = this.f4363e;
        this.f4363e = i13 + 1;
        t5.f4355a = i13;
        t5.f4356b = i7;
        t5.f4357c = f;
        arrayList.add(t5);
        int i14 = this.f + i7;
        while (true) {
            this.f = i14;
            while (true) {
                int i15 = this.f;
                int i16 = this.f4360a;
                if (i15 > i16) {
                    i8 = i15 - i16;
                    t7 = (T) arrayList.get(0);
                    i9 = t7.f4356b;
                    if (i9 <= i8) {
                        this.f -= i9;
                        arrayList.remove(0);
                        int i17 = this.f4364g;
                        if (i17 < 5) {
                            this.f4364g = i17 + 1;
                            tArr[i17] = t7;
                        }
                    }
                } else {
                    return;
                }
            }
            t7.f4356b = i9 - i8;
            i14 = this.f - i8;
        }
    }

    public final float b() {
        int i7 = this.d;
        ArrayList arrayList = this.f4361b;
        if (i7 != 0) {
            Collections.sort(arrayList, f4359i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            T t5 = (T) arrayList.get(i9);
            i8 += t5.f4356b;
            if (i8 >= f) {
                return t5.f4357c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((T) arrayList.get(arrayList.size() - 1)).f4357c;
    }
}
