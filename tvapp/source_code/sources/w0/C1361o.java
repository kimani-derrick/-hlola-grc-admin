package w0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k.C0852F;
/* renamed from: w0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361o {

    /* renamed from: a  reason: collision with root package name */
    public final List f15615a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f15616b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f15617c;
    public final C0852F d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15618e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15619g;

    public C1361o(C0852F c0852f, ArrayList arrayList, int[] iArr, int[] iArr2) {
        C1360n c1360n;
        int[] iArr3;
        int[] iArr4;
        C0852F c0852f2;
        int i7;
        C1360n c1360n2;
        int i8;
        int i9;
        int i10;
        this.f15615a = arrayList;
        this.f15616b = iArr;
        this.f15617c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = c0852f;
        RunnableC1349c runnableC1349c = (RunnableC1349c) c0852f.f11874r;
        int size = runnableC1349c.f15511q.size();
        this.f15618e = size;
        int size2 = runnableC1349c.f15512r.size();
        this.f = size2;
        this.f15619g = true;
        if (arrayList.isEmpty()) {
            c1360n = null;
        } else {
            c1360n = (C1360n) arrayList.get(0);
        }
        if (c1360n == null || c1360n.f15610a != 0 || c1360n.f15611b != 0) {
            arrayList.add(0, new C1360n(0, 0, 0));
        }
        arrayList.add(new C1360n(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.f15617c;
            iArr4 = this.f15616b;
            c0852f2 = this.d;
            if (!hasNext) {
                break;
            }
            C1360n c1360n3 = (C1360n) it.next();
            for (int i11 = 0; i11 < c1360n3.f15612c; i11++) {
                int i12 = c1360n3.f15610a + i11;
                int i13 = c1360n3.f15611b + i11;
                if (c0852f2.p(i12, i13)) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                iArr4[i12] = (i13 << 4) | i10;
                iArr3[i13] = (i12 << 4) | i10;
            }
        }
        if (this.f15619g) {
            Iterator it2 = arrayList.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                C1360n c1360n4 = (C1360n) it2.next();
                while (true) {
                    i7 = c1360n4.f15610a;
                    if (i14 < i7) {
                        if (iArr4[i14] == 0) {
                            int size3 = arrayList.size();
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < size3) {
                                    c1360n2 = (C1360n) arrayList.get(i15);
                                    while (true) {
                                        i8 = c1360n2.f15611b;
                                        if (i16 < i8) {
                                            if (iArr3[i16] == 0 && c0852f2.q(i14, i16)) {
                                                if (c0852f2.p(i14, i16)) {
                                                    i9 = 8;
                                                } else {
                                                    i9 = 4;
                                                }
                                                iArr4[i14] = (i16 << 4) | i9;
                                                iArr3[i16] = i9 | (i14 << 4);
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                                i16 = c1360n2.f15612c + i8;
                                i15++;
                            }
                        }
                        i14++;
                    }
                }
                i14 = c1360n4.f15612c + i7;
            }
        }
    }

    public static C1362p a(ArrayDeque arrayDeque, int i7, boolean z7) {
        C1362p c1362p;
        int i8;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                c1362p = (C1362p) it.next();
                if (c1362p.f15625a == i7 && c1362p.f15627c == z7) {
                    it.remove();
                    break;
                }
            } else {
                c1362p = null;
                break;
            }
        }
        while (it.hasNext()) {
            C1362p c1362p2 = (C1362p) it.next();
            int i9 = c1362p2.f15626b;
            if (z7) {
                i8 = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
            c1362p2.f15626b = i8;
        }
        return c1362p;
    }
}
