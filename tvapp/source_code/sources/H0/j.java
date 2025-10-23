package H0;

import android.graphics.Paint;
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: e  reason: collision with root package name */
    public C.d f823e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public C.d f824g;

    /* renamed from: h  reason: collision with root package name */
    public float f825h;

    /* renamed from: i  reason: collision with root package name */
    public float f826i;

    /* renamed from: j  reason: collision with root package name */
    public float f827j;

    /* renamed from: k  reason: collision with root package name */
    public float f828k;

    /* renamed from: l  reason: collision with root package name */
    public float f829l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Cap f830m;
    public Paint.Join n;

    /* renamed from: o  reason: collision with root package name */
    public float f831o;

    @Override // H0.l
    public final boolean a() {
        if (!this.f824g.k() && !this.f823e.k()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // H0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            C.d r0 = r6.f824g
            boolean r1 = r0.k()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f326t
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f324r
            if (r1 == r4) goto L1e
            r0.f324r = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            C.d r1 = r6.f823e
            boolean r4 = r1.k()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f326t
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f324r
            if (r7 == r4) goto L3a
            r1.f324r = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f826i;
    }

    public int getFillColor() {
        return this.f824g.f324r;
    }

    public float getStrokeAlpha() {
        return this.f825h;
    }

    public int getStrokeColor() {
        return this.f823e.f324r;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.f828k;
    }

    public float getTrimPathOffset() {
        return this.f829l;
    }

    public float getTrimPathStart() {
        return this.f827j;
    }

    public void setFillAlpha(float f) {
        this.f826i = f;
    }

    public void setFillColor(int i7) {
        this.f824g.f324r = i7;
    }

    public void setStrokeAlpha(float f) {
        this.f825h = f;
    }

    public void setStrokeColor(int i7) {
        this.f823e.f324r = i7;
    }

    public void setStrokeWidth(float f) {
        this.f = f;
    }

    public void setTrimPathEnd(float f) {
        this.f828k = f;
    }

    public void setTrimPathOffset(float f) {
        this.f829l = f;
    }

    public void setTrimPathStart(float f) {
        this.f827j = f;
    }
}
