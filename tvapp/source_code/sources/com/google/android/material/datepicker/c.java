package com.google.android.material.datepicker;

import K.D;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.AbstractC0565a;
import h6.C0761k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.AbstractC0869T;
import k.C0852F;
import k.C0904o;
import u3.AbstractC1272a;
import w0.C1347a;
import w0.K;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f8850a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8851b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8852c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8853e;
    public Object f;

    public c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i7, J3.k kVar, Rect rect) {
        android.support.v4.media.session.b.g(rect.left);
        android.support.v4.media.session.b.g(rect.top);
        android.support.v4.media.session.b.g(rect.right);
        android.support.v4.media.session.b.g(rect.bottom);
        this.f8851b = rect;
        this.f8852c = colorStateList2;
        this.d = colorStateList;
        this.f8853e = colorStateList3;
        this.f8850a = i7;
        this.f = kVar;
    }

    public static c e(Context context, int i7) {
        boolean z7;
        if (i7 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        android.support.v4.media.session.b.f("Cannot create a CalendarItemStyle with a styleResId of 0", z7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1272a.f14958m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList p3 = m3.g.p(context, obtainStyledAttributes, 4);
        ColorStateList p5 = m3.g.p(context, obtainStyledAttributes, 9);
        ColorStateList p7 = m3.g.p(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        J3.k a7 = J3.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new J3.a(0)).a();
        obtainStyledAttributes.recycle();
        return new c(p3, p5, p7, dimensionPixelSize, a7, rect);
    }

    public void a() {
        View view = (View) this.f8851b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0761k) this.d) != null) {
                if (((C0761k) this.f) == null) {
                    this.f = new Object();
                }
                C0761k c0761k = (C0761k) this.f;
                c0761k.f11169c = null;
                c0761k.f11168b = false;
                c0761k.d = null;
                c0761k.f11167a = false;
                Field field = O.f1447a;
                ColorStateList g7 = D.g(view);
                if (g7 != null) {
                    c0761k.f11168b = true;
                    c0761k.f11169c = g7;
                }
                PorterDuff.Mode h7 = D.h(view);
                if (h7 != null) {
                    c0761k.f11167a = true;
                    c0761k.d = h7;
                }
                if (c0761k.f11168b || c0761k.f11167a) {
                    C0904o.d(background, c0761k, view.getDrawableState());
                    return;
                }
            }
            C0761k c0761k2 = (C0761k) this.f8853e;
            if (c0761k2 != null) {
                C0904o.d(background, c0761k2, view.getDrawableState());
                return;
            }
            C0761k c0761k3 = (C0761k) this.d;
            if (c0761k3 != null) {
                C0904o.d(background, c0761k3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i7) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1347a c1347a = (C1347a) arrayList.get(i8);
            int i9 = c1347a.f15499a;
            if (i9 == 8) {
                if (h(c1347a.d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = c1347a.f15500b;
                int i11 = c1347a.d + i10;
                while (i10 < i11) {
                    if (h(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((K) this.f8853e).a((C1347a) arrayList.get(i7));
        }
        r(arrayList);
        this.f8850a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f8852c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1347a c1347a = (C1347a) arrayList.get(i7);
            int i8 = c1347a.f15499a;
            K k5 = (K) this.f8853e;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 == 8) {
                            k5.a(c1347a);
                            k5.f(c1347a.f15500b, c1347a.d);
                        }
                    } else {
                        k5.a(c1347a);
                        k5.d(c1347a.f15500b, c1347a.d, c1347a.f15501c);
                    }
                } else {
                    k5.a(c1347a);
                    int i9 = c1347a.f15500b;
                    int i10 = c1347a.d;
                    RecyclerView recyclerView = k5.f15465q;
                    recyclerView.U(i9, i10, true);
                    recyclerView.f6890A0 = true;
                    recyclerView.f6959x0.f15541c += i10;
                }
            } else {
                k5.a(c1347a);
                k5.e(c1347a.f15500b, c1347a.d);
            }
        }
        r(arrayList);
        this.f8850a = 0;
    }

    public void f(C1347a c1347a) {
        int i7;
        J.b bVar;
        int i8 = c1347a.f15499a;
        if (i8 != 1 && i8 != 8) {
            int v5 = v(c1347a.f15500b, i8);
            int i9 = c1347a.f15500b;
            int i10 = c1347a.f15499a;
            if (i10 != 2) {
                if (i10 == 4) {
                    i7 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c1347a);
                }
            } else {
                i7 = 0;
            }
            int i11 = 1;
            int i12 = 1;
            while (true) {
                int i13 = c1347a.d;
                bVar = (J.b) this.f8851b;
                if (i11 >= i13) {
                    break;
                }
                int v7 = v((i7 * i11) + c1347a.f15500b, c1347a.f15499a);
                int i14 = c1347a.f15499a;
                if (i14 == 2 ? v7 == v5 : !(i14 != 4 || v7 != v5 + 1)) {
                    i12++;
                } else {
                    C1347a m7 = m(c1347a.f15501c, i14, v5, i12);
                    g(m7, i9);
                    m7.f15501c = null;
                    bVar.c(m7);
                    if (c1347a.f15499a == 4) {
                        i9 += i12;
                    }
                    i12 = 1;
                    v5 = v7;
                }
                i11++;
            }
            Object obj = c1347a.f15501c;
            c1347a.f15501c = null;
            bVar.c(c1347a);
            if (i12 > 0) {
                C1347a m8 = m(obj, c1347a.f15499a, v5, i12);
                g(m8, i9);
                m8.f15501c = null;
                bVar.c(m8);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void g(C1347a c1347a, int i7) {
        K k5 = (K) this.f8853e;
        k5.a(c1347a);
        int i8 = c1347a.f15499a;
        if (i8 != 2) {
            if (i8 == 4) {
                k5.d(i7, c1347a.d, c1347a.f15501c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i9 = c1347a.d;
        RecyclerView recyclerView = k5.f15465q;
        recyclerView.U(i7, i9, true);
        recyclerView.f6890A0 = true;
        recyclerView.f6959x0.f15541c += i9;
    }

    public int h(int i7, int i8) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i8 < size) {
            C1347a c1347a = (C1347a) arrayList.get(i8);
            int i9 = c1347a.f15499a;
            if (i9 == 8) {
                int i10 = c1347a.f15500b;
                if (i10 == i7) {
                    i7 = c1347a.d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (c1347a.d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = c1347a.f15500b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = c1347a.d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += c1347a.d;
                }
            }
            i8++;
        }
        return i7;
    }

    public ColorStateList i() {
        C0761k c0761k = (C0761k) this.f8853e;
        if (c0761k != null) {
            return (ColorStateList) c0761k.f11169c;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        C0761k c0761k = (C0761k) this.f8853e;
        if (c0761k != null) {
            return (PorterDuff.Mode) c0761k.d;
        }
        return null;
    }

    public boolean k() {
        if (((ArrayList) this.f8852c).size() > 0) {
            return true;
        }
        return false;
    }

    public void l(AttributeSet attributeSet, int i7) {
        ColorStateList i8;
        View view = (View) this.f8851b;
        Context context = view.getContext();
        int[] iArr = AbstractC0565a.f9358u;
        g5.b C3 = g5.b.C(context, attributeSet, iArr, i7, 0);
        TypedArray typedArray = (TypedArray) C3.f10842s;
        View view2 = (View) this.f8851b;
        O.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) C3.f10842s, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f8850a = typedArray.getResourceId(0, -1);
                C0904o c0904o = (C0904o) this.f8852c;
                Context context2 = view.getContext();
                int i9 = this.f8850a;
                synchronized (c0904o) {
                    i8 = c0904o.f12073a.i(context2, i9);
                }
                if (i8 != null) {
                    s(i8);
                }
            }
            if (typedArray.hasValue(1)) {
                D.q(view, C3.y(1));
            }
            if (typedArray.hasValue(2)) {
                D.r(view, AbstractC0869T.b(typedArray.getInt(2, -1), null));
            }
            C3.D();
        } catch (Throwable th) {
            C3.D();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w0.a] */
    public C1347a m(Object obj, int i7, int i8, int i9) {
        C1347a c1347a = (C1347a) ((J.b) this.f8851b).a();
        if (c1347a == null) {
            ?? obj2 = new Object();
            obj2.f15499a = i7;
            obj2.f15500b = i8;
            obj2.d = i9;
            obj2.f15501c = obj;
            return obj2;
        }
        c1347a.f15499a = i7;
        c1347a.f15500b = i8;
        c1347a.d = i9;
        c1347a.f15501c = obj;
        return c1347a;
    }

    public void n() {
        this.f8850a = -1;
        s(null);
        a();
    }

    public void o(int i7) {
        ColorStateList colorStateList;
        this.f8850a = i7;
        C0904o c0904o = (C0904o) this.f8852c;
        if (c0904o != null) {
            Context context = ((View) this.f8851b).getContext();
            synchronized (c0904o) {
                colorStateList = c0904o.f12073a.i(context, i7);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(C1347a c1347a) {
        ((ArrayList) this.d).add(c1347a);
        int i7 = c1347a.f15499a;
        K k5 = (K) this.f8853e;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8) {
                        k5.f(c1347a.f15500b, c1347a.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c1347a);
                }
                k5.d(c1347a.f15500b, c1347a.d, c1347a.f15501c);
                return;
            }
            int i8 = c1347a.f15500b;
            int i9 = c1347a.d;
            RecyclerView recyclerView = k5.f15465q;
            recyclerView.U(i8, i9, false);
            recyclerView.f6890A0 = true;
            return;
        }
        k5.e(c1347a.f15500b, c1347a.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018e, code lost:
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
        if (r11.f15500b == r11.d) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0197, code lost:
        r1.set(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019b, code lost:
        r1.remove(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019e, code lost:
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a0, code lost:
        r1.add(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015c, code lost:
        if (r5 > r12.f15500b) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015e, code lost:
        r11.d = r5 - r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:
        if (r5 >= r12.f15500b) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.c.q():void");
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1347a c1347a = (C1347a) arrayList.get(i7);
            c1347a.f15501c = null;
            ((J.b) this.f8851b).c(c1347a);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0761k) this.d) == null) {
                this.d = new Object();
            }
            C0761k c0761k = (C0761k) this.d;
            c0761k.f11169c = colorStateList;
            c0761k.f11168b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((C0761k) this.f8853e) == null) {
            this.f8853e = new Object();
        }
        C0761k c0761k = (C0761k) this.f8853e;
        c0761k.f11169c = colorStateList;
        c0761k.f11168b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((C0761k) this.f8853e) == null) {
            this.f8853e = new Object();
        }
        C0761k c0761k = (C0761k) this.f8853e;
        c0761k.d = mode;
        c0761k.f11167a = true;
        a();
    }

    public int v(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1347a c1347a = (C1347a) arrayList.get(size);
            int i15 = c1347a.f15499a;
            if (i15 == 8) {
                int i16 = c1347a.f15500b;
                int i17 = c1347a.d;
                if (i16 < i17) {
                    i11 = i16;
                    i10 = i17;
                } else {
                    i10 = i16;
                    i11 = i17;
                }
                if (i7 >= i11 && i7 <= i10) {
                    if (i11 == i16) {
                        if (i8 == 1) {
                            i14 = i17 + 1;
                        } else {
                            if (i8 == 2) {
                                i14 = i17 - 1;
                            }
                            i7++;
                        }
                        c1347a.d = i14;
                        i7++;
                    } else {
                        if (i8 == 1) {
                            i13 = i16 + 1;
                        } else {
                            if (i8 == 2) {
                                i13 = i16 - 1;
                            }
                            i7--;
                        }
                        c1347a.f15500b = i13;
                        i7--;
                    }
                } else if (i7 < i16) {
                    if (i8 == 1) {
                        c1347a.f15500b = i16 + 1;
                        i12 = i17 + 1;
                    } else if (i8 == 2) {
                        c1347a.f15500b = i16 - 1;
                        i12 = i17 - 1;
                    }
                    c1347a.d = i12;
                }
            } else {
                int i18 = c1347a.f15500b;
                if (i18 <= i7) {
                    if (i15 == 1) {
                        i7 -= c1347a.d;
                    } else if (i15 == 2) {
                        i7 += c1347a.d;
                    }
                } else {
                    if (i8 == 1) {
                        i9 = i18 + 1;
                    } else if (i8 == 2) {
                        i9 = i18 - 1;
                    }
                    c1347a.f15500b = i9;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1347a c1347a2 = (C1347a) arrayList.get(size2);
            int i19 = c1347a2.f15499a;
            J.b bVar = (J.b) this.f8851b;
            if (i19 == 8) {
                int i20 = c1347a2.d;
                if (i20 == c1347a2.f15500b || i20 < 0) {
                    arrayList.remove(size2);
                    c1347a2.f15501c = null;
                    bVar.c(c1347a2);
                }
            } else if (c1347a2.d <= 0) {
                arrayList.remove(size2);
                c1347a2.f15501c = null;
                bVar.c(c1347a2);
            }
        }
        return i7;
    }

    public c(View view) {
        C0904o c0904o;
        this.f8850a = -1;
        this.f8851b = view;
        PorterDuff.Mode mode = C0904o.f12071b;
        synchronized (C0904o.class) {
            try {
                if (C0904o.f12072c == null) {
                    C0904o.c();
                }
                c0904o = C0904o.f12072c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8852c = c0904o;
    }

    public c(K k5) {
        this.f8851b = new J.b(30);
        this.f8852c = new ArrayList();
        this.d = new ArrayList();
        this.f8850a = 0;
        this.f8853e = k5;
        this.f = new C0852F(26, this);
    }
}
