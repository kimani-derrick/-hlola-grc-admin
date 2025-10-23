package J3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public m3.g f1383a = new i();

    /* renamed from: b  reason: collision with root package name */
    public m3.g f1384b = new i();

    /* renamed from: c  reason: collision with root package name */
    public m3.g f1385c = new i();
    public m3.g d = new i();

    /* renamed from: e  reason: collision with root package name */
    public c f1386e = new a(0.0f);
    public c f = new a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public c f1387g = new a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public c f1388h = new a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public e f1389i = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public e f1390j = new e(0);

    /* renamed from: k  reason: collision with root package name */
    public e f1391k = new e(0);

    /* renamed from: l  reason: collision with root package name */
    public e f1392l = new e(0);

    public static j a(Context context, int i7, int i8, a aVar) {
        if (i8 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
            i7 = i8;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1272a.f14964t);
        try {
            int i9 = obtainStyledAttributes.getInt(0, 0);
            int i10 = obtainStyledAttributes.getInt(3, i9);
            int i11 = obtainStyledAttributes.getInt(4, i9);
            int i12 = obtainStyledAttributes.getInt(2, i9);
            int i13 = obtainStyledAttributes.getInt(1, i9);
            c c5 = c(obtainStyledAttributes, 5, aVar);
            c c6 = c(obtainStyledAttributes, 8, c5);
            c c7 = c(obtainStyledAttributes, 9, c5);
            c c8 = c(obtainStyledAttributes, 7, c5);
            c c9 = c(obtainStyledAttributes, 6, c5);
            j jVar = new j();
            m3.g f = p6.d.f(i10);
            jVar.f1373a = f;
            j.d(f);
            jVar.f1376e = c6;
            m3.g f7 = p6.d.f(i11);
            jVar.f1374b = f7;
            j.d(f7);
            jVar.f = c7;
            m3.g f8 = p6.d.f(i12);
            jVar.f1375c = f8;
            j.d(f8);
            jVar.f1377g = c8;
            m3.g f9 = p6.d.f(i13);
            jVar.d = f9;
            j.d(f9);
            jVar.f1378h = c9;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i7, int i8) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.n, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i7, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i7);
        if (peekValue == null) {
            return cVar;
        }
        int i8 = peekValue.type;
        if (i8 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i8 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z7;
        boolean z8;
        boolean z9;
        if (this.f1392l.getClass().equals(e.class) && this.f1390j.getClass().equals(e.class) && this.f1389i.getClass().equals(e.class) && this.f1391k.getClass().equals(e.class)) {
            z7 = true;
        } else {
            z7 = false;
        }
        float a7 = this.f1386e.a(rectF);
        if (this.f.a(rectF) == a7 && this.f1388h.a(rectF) == a7 && this.f1387g.a(rectF) == a7) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((this.f1384b instanceof i) && (this.f1383a instanceof i) && (this.f1385c instanceof i) && (this.d instanceof i)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z7 || !z8 || !z9) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J3.j, java.lang.Object] */
    public final j e() {
        ?? obj = new Object();
        obj.f1373a = this.f1383a;
        obj.f1374b = this.f1384b;
        obj.f1375c = this.f1385c;
        obj.d = this.d;
        obj.f1376e = this.f1386e;
        obj.f = this.f;
        obj.f1377g = this.f1387g;
        obj.f1378h = this.f1388h;
        obj.f1379i = this.f1389i;
        obj.f1380j = this.f1390j;
        obj.f1381k = this.f1391k;
        obj.f1382l = this.f1392l;
        return obj;
    }
}
