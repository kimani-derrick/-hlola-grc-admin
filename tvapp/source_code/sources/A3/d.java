package A3;

import J3.k;
import J3.v;
import K.O;
import a.AbstractC0189a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.boxhdo.android.tv.R;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f69a;

    /* renamed from: b  reason: collision with root package name */
    public k f70b;

    /* renamed from: c  reason: collision with root package name */
    public int f71c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f72e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f73g;

    /* renamed from: h  reason: collision with root package name */
    public int f74h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f75i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f76j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f77k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f78l;

    /* renamed from: m  reason: collision with root package name */
    public J3.g f79m;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f80o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f81p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f82q;

    /* renamed from: r  reason: collision with root package name */
    public RippleDrawable f83r;

    /* renamed from: s  reason: collision with root package name */
    public int f84s;

    public d(MaterialButton materialButton, k kVar) {
        this.f69a = materialButton;
        this.f70b = kVar;
    }

    public final v a() {
        Drawable drawable;
        RippleDrawable rippleDrawable = this.f83r;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f83r.getNumberOfLayers() > 2) {
                drawable = this.f83r.getDrawable(2);
            } else {
                drawable = this.f83r.getDrawable(1);
            }
            return (v) drawable;
        }
        return null;
    }

    public final J3.g b(boolean z7) {
        RippleDrawable rippleDrawable = this.f83r;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (J3.g) ((LayerDrawable) ((InsetDrawable) this.f83r.getDrawable(0)).getDrawable()).getDrawable(!z7 ? 1 : 0);
        }
        return null;
    }

    public final void c(k kVar) {
        this.f70b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i7, int i8) {
        Field field = O.f1447a;
        MaterialButton materialButton = this.f69a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i9 = this.f72e;
        int i10 = this.f;
        this.f = i8;
        this.f72e = i7;
        if (!this.f80o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i7) - i9, paddingEnd, (paddingBottom + i8) - i10);
    }

    public final void e() {
        int i7;
        J3.g gVar = new J3.g(this.f70b);
        MaterialButton materialButton = this.f69a;
        gVar.h(materialButton.getContext());
        E.a.h(gVar, this.f76j);
        PorterDuff.Mode mode = this.f75i;
        if (mode != null) {
            E.a.i(gVar, mode);
        }
        ColorStateList colorStateList = this.f77k;
        gVar.f1362q.f1340k = this.f74h;
        gVar.invalidateSelf();
        J3.f fVar = gVar.f1362q;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        J3.g gVar2 = new J3.g(this.f70b);
        gVar2.setTint(0);
        float f = this.f74h;
        if (this.n) {
            i7 = AbstractC0189a.t(materialButton, R.attr.colorSurface);
        } else {
            i7 = 0;
        }
        gVar2.f1362q.f1340k = f;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i7);
        J3.f fVar2 = gVar2.f1362q;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        J3.g gVar3 = new J3.g(this.f70b);
        this.f79m = gVar3;
        E.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(H3.a.a(this.f78l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f71c, this.f72e, this.d, this.f), this.f79m);
        this.f83r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        J3.g b7 = b(false);
        if (b7 != null) {
            b7.i(this.f84s);
        }
    }

    public final void f() {
        int i7 = 0;
        J3.g b7 = b(false);
        J3.g b8 = b(true);
        if (b7 != null) {
            ColorStateList colorStateList = this.f77k;
            b7.f1362q.f1340k = this.f74h;
            b7.invalidateSelf();
            J3.f fVar = b7.f1362q;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b7.onStateChange(b7.getState());
            }
            if (b8 != null) {
                float f = this.f74h;
                if (this.n) {
                    i7 = AbstractC0189a.t(this.f69a, R.attr.colorSurface);
                }
                b8.f1362q.f1340k = f;
                b8.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i7);
                J3.f fVar2 = b8.f1362q;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b8.onStateChange(b8.getState());
                }
            }
        }
    }
}
