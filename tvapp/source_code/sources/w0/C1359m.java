package w0;

import K.C0040p;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
/* renamed from: w0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359m extends P {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f15597s;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15598g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f15599h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f15600i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f15601j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f15602k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f15603l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f15604m;
    public ArrayList n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f15605o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f15606p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f15607q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f15608r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((k0) arrayList.get(size)).f15576a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [w0.k, java.lang.Object] */
    @Override // w0.P
    public final boolean a(k0 k0Var, k0 k0Var2, C0040p c0040p, C0040p c0040p2) {
        int i7;
        int i8;
        int i9 = c0040p.f1501a;
        int i10 = c0040p.f1502b;
        if (k0Var2.t()) {
            int i11 = c0040p.f1501a;
            i8 = c0040p.f1502b;
            i7 = i11;
        } else {
            i7 = c0040p2.f1501a;
            i8 = c0040p2.f1502b;
        }
        if (k0Var == k0Var2) {
            return g(k0Var, i9, i10, i7, i8);
        }
        View view = k0Var.f15576a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(k0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(k0Var2);
        View view2 = k0Var2.f15576a;
        view2.setTranslationX(-((int) ((i7 - i9) - translationX)));
        view2.setTranslationY(-((int) ((i8 - i10) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f15602k;
        ?? obj = new Object();
        obj.f15571a = k0Var;
        obj.f15572b = k0Var2;
        obj.f15573c = i9;
        obj.d = i10;
        obj.f15574e = i7;
        obj.f = i8;
        arrayList.add(obj);
        return true;
    }

    @Override // w0.P
    public final void d(k0 k0Var) {
        View view = k0Var.f15576a;
        view.animate().cancel();
        ArrayList arrayList = this.f15601j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1358l) arrayList.get(size)).f15592a == k0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(k0Var);
                arrayList.remove(size);
            }
        }
        j(this.f15602k, k0Var);
        if (this.f15599h.remove(k0Var)) {
            view.setAlpha(1.0f);
            c(k0Var);
        }
        if (this.f15600i.remove(k0Var)) {
            view.setAlpha(1.0f);
            c(k0Var);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, k0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f15604m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1358l) arrayList5.get(size4)).f15592a == k0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(k0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f15603l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(k0Var)) {
                view.setAlpha(1.0f);
                c(k0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f15607q.remove(k0Var);
        this.f15605o.remove(k0Var);
        this.f15608r.remove(k0Var);
        this.f15606p.remove(k0Var);
        i();
    }

    @Override // w0.P
    public final void e() {
        ArrayList arrayList = this.f15601j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1358l c1358l = (C1358l) arrayList.get(size);
            View view = c1358l.f15592a.f15576a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c1358l.f15592a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f15599h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((k0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f15600i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            k0 k0Var = (k0) arrayList3.get(size3);
            k0Var.f15576a.setAlpha(1.0f);
            c(k0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f15602k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1357k c1357k = (C1357k) arrayList4.get(size4);
            k0 k0Var2 = c1357k.f15571a;
            if (k0Var2 != null) {
                k(c1357k, k0Var2);
            }
            k0 k0Var3 = c1357k.f15572b;
            if (k0Var3 != null) {
                k(c1357k, k0Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.f15604m;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                C1358l c1358l2 = (C1358l) arrayList6.get(size6);
                View view2 = c1358l2.f15592a.f15576a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(c1358l2.f15592a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f15603l;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                k0 k0Var4 = (k0) arrayList8.get(size8);
                k0Var4.f15576a.setAlpha(1.0f);
                c(k0Var4);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.n;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C1357k c1357k2 = (C1357k) arrayList10.get(size10);
                k0 k0Var5 = c1357k2.f15571a;
                if (k0Var5 != null) {
                    k(c1357k2, k0Var5);
                }
                k0 k0Var6 = c1357k2.f15572b;
                if (k0Var6 != null) {
                    k(c1357k2, k0Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        h(this.f15607q);
        h(this.f15606p);
        h(this.f15605o);
        h(this.f15608r);
        ArrayList arrayList11 = this.f15470b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            AbstractC0515y1.v(arrayList11.get(0));
            throw null;
        }
    }

    @Override // w0.P
    public final boolean f() {
        if (this.f15600i.isEmpty() && this.f15602k.isEmpty() && this.f15601j.isEmpty() && this.f15599h.isEmpty() && this.f15606p.isEmpty() && this.f15607q.isEmpty() && this.f15605o.isEmpty() && this.f15608r.isEmpty() && this.f15604m.isEmpty() && this.f15603l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [w0.l, java.lang.Object] */
    public final boolean g(k0 k0Var, int i7, int i8, int i9, int i10) {
        View view = k0Var.f15576a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) k0Var.f15576a.getTranslationY());
        l(k0Var);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            c(k0Var);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        ArrayList arrayList = this.f15601j;
        ?? obj = new Object();
        obj.f15592a = k0Var;
        obj.f15593b = translationX;
        obj.f15594c = translationY;
        obj.d = i9;
        obj.f15595e = i10;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f15470b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                AbstractC0515y1.v(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(ArrayList arrayList, k0 k0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1357k c1357k = (C1357k) arrayList.get(size);
            if (k(c1357k, k0Var) && c1357k.f15571a == null && c1357k.f15572b == null) {
                arrayList.remove(c1357k);
            }
        }
    }

    public final boolean k(C1357k c1357k, k0 k0Var) {
        if (c1357k.f15572b == k0Var) {
            c1357k.f15572b = null;
        } else if (c1357k.f15571a == k0Var) {
            c1357k.f15571a = null;
        } else {
            return false;
        }
        k0Var.f15576a.setAlpha(1.0f);
        View view = k0Var.f15576a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(k0Var);
        return true;
    }

    public final void l(k0 k0Var) {
        if (f15597s == null) {
            f15597s = new ValueAnimator().getInterpolator();
        }
        k0Var.f15576a.animate().setInterpolator(f15597s);
        d(k0Var);
    }
}
