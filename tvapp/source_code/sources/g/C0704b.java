package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import o.C1054g;
import o.h;
import o.k;
import p.AbstractC1078a;
/* renamed from: g.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f10446A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f10447B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f10448C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f10449D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f10450E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f10451G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f10452H;

    /* renamed from: I  reason: collision with root package name */
    public C1054g f10453I;

    /* renamed from: J  reason: collision with root package name */
    public k f10454J;

    /* renamed from: a  reason: collision with root package name */
    public final C0707e f10455a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f10456b;

    /* renamed from: c  reason: collision with root package name */
    public int f10457c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10458e;
    public SparseArray f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f10459g;

    /* renamed from: h  reason: collision with root package name */
    public int f10460h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10461i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10462j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f10463k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10464l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10465m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f10466o;

    /* renamed from: p  reason: collision with root package name */
    public int f10467p;

    /* renamed from: q  reason: collision with root package name */
    public int f10468q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10469r;

    /* renamed from: s  reason: collision with root package name */
    public int f10470s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10471t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10472u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10473v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10474w;

    /* renamed from: x  reason: collision with root package name */
    public int f10475x;

    /* renamed from: y  reason: collision with root package name */
    public int f10476y;

    /* renamed from: z  reason: collision with root package name */
    public int f10477z;

    public C0704b(C0704b c0704b, C0707e c0707e, Resources resources) {
        Resources resources2;
        int i7;
        k kVar;
        SparseArray sparseArray;
        this.f10461i = false;
        this.f10464l = false;
        this.f10474w = true;
        this.f10476y = 0;
        this.f10477z = 0;
        this.f10455a = c0707e;
        if (resources != null) {
            resources2 = resources;
        } else if (c0704b != null) {
            resources2 = c0704b.f10456b;
        } else {
            resources2 = null;
        }
        this.f10456b = resources2;
        if (c0704b != null) {
            i7 = c0704b.f10457c;
        } else {
            i7 = 0;
        }
        int i8 = C0707e.f10483J;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f10457c = i7;
        if (c0704b != null) {
            this.d = c0704b.d;
            this.f10458e = c0704b.f10458e;
            this.f10472u = true;
            this.f10473v = true;
            this.f10461i = c0704b.f10461i;
            this.f10464l = c0704b.f10464l;
            this.f10474w = c0704b.f10474w;
            this.f10475x = c0704b.f10475x;
            this.f10476y = c0704b.f10476y;
            this.f10477z = c0704b.f10477z;
            this.f10446A = c0704b.f10446A;
            this.f10447B = c0704b.f10447B;
            this.f10448C = c0704b.f10448C;
            this.f10449D = c0704b.f10449D;
            this.f10450E = c0704b.f10450E;
            this.F = c0704b.F;
            this.f10451G = c0704b.f10451G;
            if (c0704b.f10457c == i7) {
                if (c0704b.f10462j) {
                    this.f10463k = c0704b.f10463k != null ? new Rect(c0704b.f10463k) : null;
                    this.f10462j = true;
                }
                if (c0704b.f10465m) {
                    this.n = c0704b.n;
                    this.f10466o = c0704b.f10466o;
                    this.f10467p = c0704b.f10467p;
                    this.f10468q = c0704b.f10468q;
                    this.f10465m = true;
                }
            }
            if (c0704b.f10469r) {
                this.f10470s = c0704b.f10470s;
                this.f10469r = true;
            }
            if (c0704b.f10471t) {
                this.f10471t = true;
            }
            Drawable[] drawableArr = c0704b.f10459g;
            this.f10459g = new Drawable[drawableArr.length];
            this.f10460h = c0704b.f10460h;
            SparseArray sparseArray2 = c0704b.f;
            if (sparseArray2 != null) {
                sparseArray = sparseArray2.clone();
            } else {
                sparseArray = new SparseArray(this.f10460h);
            }
            this.f = sparseArray;
            int i9 = this.f10460h;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i10, constantState);
                    } else {
                        this.f10459g[i10] = drawableArr[i10];
                    }
                }
            }
        } else {
            this.f10459g = new Drawable[10];
            this.f10460h = 0;
        }
        if (c0704b != null) {
            this.f10452H = c0704b.f10452H;
        } else {
            this.f10452H = new int[this.f10459g.length];
        }
        if (c0704b != null) {
            this.f10453I = c0704b.f10453I;
            kVar = c0704b.f10454J;
        } else {
            this.f10453I = new C1054g();
            kVar = new k();
        }
        this.f10454J = kVar;
    }

    public final int a(Drawable drawable) {
        int i7 = this.f10460h;
        if (i7 >= this.f10459g.length) {
            int i8 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i8];
            Drawable[] drawableArr2 = this.f10459g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f10459g = drawableArr;
            int[][] iArr = new int[i8];
            System.arraycopy(this.f10452H, 0, iArr, 0, i7);
            this.f10452H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f10455a);
        this.f10459g[i7] = drawable;
        this.f10460h++;
        this.f10458e = drawable.getChangingConfigurations() | this.f10458e;
        this.f10469r = false;
        this.f10471t = false;
        this.f10463k = null;
        this.f10462j = false;
        this.f10465m = false;
        this.f10472u = false;
        return i7;
    }

    public final void b() {
        this.f10465m = true;
        c();
        int i7 = this.f10460h;
        Drawable[] drawableArr = this.f10459g;
        this.f10466o = -1;
        this.n = -1;
        this.f10468q = 0;
        this.f10467p = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f10466o) {
                this.f10466o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f10467p) {
                this.f10467p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f10468q) {
                this.f10468q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f.keyAt(i7);
                Drawable[] drawableArr = this.f10459g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(i7)).newDrawable(this.f10456b);
                E.b.b(newDrawable, this.f10475x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f10455a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i7 = this.f10460h;
        Drawable[] drawableArr = this.f10459g;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            if (drawable != null) {
                if (E.a.b(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i8);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f10459g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.f10456b);
        E.b.b(newDrawable, this.f10475x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f10455a);
        this.f10459g[i7] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    public final int e(int i7) {
        Object obj;
        if (i7 < 0) {
            return 0;
        }
        k kVar = this.f10454J;
        Integer num = 0;
        int a7 = AbstractC1078a.a(kVar.f12813t, i7, kVar.f12811r);
        if (a7 >= 0 && (obj = kVar.f12812s[a7]) != h.f12801b) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f10452H;
        int i7 = this.f10460h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.f10458e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0707e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0707e(this, resources);
    }
}
