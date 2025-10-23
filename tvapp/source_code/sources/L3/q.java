package L3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.boxhdo.android.tv.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import k3.AbstractC0958a;
import v3.AbstractC1322a;
/* loaded from: classes.dex */
public final class q extends r {
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2086e;
    public final m f;

    /* renamed from: g  reason: collision with root package name */
    public final c f2087g;

    /* renamed from: h  reason: collision with root package name */
    public final d f2088h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2089i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2090j;

    /* renamed from: k  reason: collision with root package name */
    public long f2091k;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f2092l;

    /* renamed from: m  reason: collision with root package name */
    public J3.g f2093m;
    public AccessibilityManager n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f2094o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f2095p;

    public q(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new l(this, 0);
        this.f2086e = new b(1, this);
        this.f = new m(this, textInputLayout);
        this.f2087g = new c(this, 1);
        this.f2088h = new d(this, 1);
        this.f2089i = false;
        this.f2090j = false;
        this.f2091k = Long.MAX_VALUE;
    }

    public static void d(q qVar, AutoCompleteTextView autoCompleteTextView) {
        boolean z7;
        if (autoCompleteTextView == null) {
            qVar.getClass();
            return;
        }
        qVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - qVar.f2091k;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            qVar.f2089i = false;
        }
        if (!qVar.f2089i) {
            qVar.g(!qVar.f2090j);
            if (qVar.f2090j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        qVar.f2089i = false;
    }

    public static boolean f(EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    @Override // L3.r
    public final void a() {
        Context context = this.f2097b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        J3.g e3 = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        J3.g e7 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f2093m = e3;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f2092l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, e3);
        this.f2092l.addState(new int[0], e7);
        Drawable i02 = android.support.v4.media.session.b.i0(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.f2096a;
        textInputLayout.setEndIconDrawable(i02);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new e(1, this));
        LinkedHashSet linkedHashSet = textInputLayout.f9005u0;
        c cVar = this.f2087g;
        linkedHashSet.add(cVar);
        if (textInputLayout.f9004u != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.y0.add(this.f2088h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC1322a.f15312a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new k(0, this));
        this.f2095p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new k(0, this));
        this.f2094o = ofFloat2;
        ofFloat2.addListener(new p(0, this));
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // L3.r
    public final boolean b(int i7) {
        if (i7 != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [J3.k, java.lang.Object] */
    public final J3.g e(float f, float f7, float f8, int i7) {
        J3.i iVar = new J3.i();
        J3.i iVar2 = new J3.i();
        J3.i iVar3 = new J3.i();
        J3.i iVar4 = new J3.i();
        J3.e eVar = new J3.e(0);
        J3.e eVar2 = new J3.e(0);
        J3.e eVar3 = new J3.e(0);
        J3.e eVar4 = new J3.e(0);
        J3.a aVar = new J3.a(f);
        J3.a aVar2 = new J3.a(f);
        J3.a aVar3 = new J3.a(f7);
        J3.a aVar4 = new J3.a(f7);
        ?? obj = new Object();
        obj.f1383a = iVar;
        obj.f1384b = iVar2;
        obj.f1385c = iVar3;
        obj.d = iVar4;
        obj.f1386e = aVar;
        obj.f = aVar2;
        obj.f1387g = aVar4;
        obj.f1388h = aVar3;
        obj.f1389i = eVar;
        obj.f1390j = eVar2;
        obj.f1391k = eVar3;
        obj.f1392l = eVar4;
        Paint paint = J3.g.f1350M;
        String simpleName = J3.g.class.getSimpleName();
        Context context = this.f2097b;
        int E4 = AbstractC0958a.E(R.attr.colorSurface, context, simpleName);
        J3.g gVar = new J3.g();
        gVar.h(context);
        gVar.j(ColorStateList.valueOf(E4));
        gVar.i(f8);
        gVar.setShapeAppearanceModel(obj);
        J3.f fVar = gVar.f1362q;
        if (fVar.f1337h == null) {
            fVar.f1337h = new Rect();
        }
        gVar.f1362q.f1337h.set(0, i7, 0, i7);
        gVar.invalidateSelf();
        return gVar;
    }

    public final void g(boolean z7) {
        if (this.f2090j != z7) {
            this.f2090j = z7;
            this.f2095p.cancel();
            this.f2094o.start();
        }
    }
}
