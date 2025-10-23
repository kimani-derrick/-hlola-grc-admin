package H0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import o.C1052e;
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f832a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f833b;

    /* renamed from: c  reason: collision with root package name */
    public float f834c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f835e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f836g;

    /* renamed from: h  reason: collision with root package name */
    public float f837h;

    /* renamed from: i  reason: collision with root package name */
    public float f838i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f839j;

    /* renamed from: k  reason: collision with root package name */
    public final int f840k;

    /* renamed from: l  reason: collision with root package name */
    public String f841l;

    public k() {
        this.f832a = new Matrix();
        this.f833b = new ArrayList();
        this.f834c = 0.0f;
        this.d = 0.0f;
        this.f835e = 0.0f;
        this.f = 1.0f;
        this.f836g = 1.0f;
        this.f837h = 0.0f;
        this.f838i = 0.0f;
        this.f839j = new Matrix();
        this.f841l = null;
    }

    @Override // H0.l
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f833b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // H0.l
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.f833b;
            if (i7 < arrayList.size()) {
                z7 |= ((l) arrayList.get(i7)).b(iArr);
                i7++;
            } else {
                return z7;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f839j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f835e);
        matrix.postScale(this.f, this.f836g);
        matrix.postRotate(this.f834c, 0.0f, 0.0f);
        matrix.postTranslate(this.f837h + this.d, this.f838i + this.f835e);
    }

    public String getGroupName() {
        return this.f841l;
    }

    public Matrix getLocalMatrix() {
        return this.f839j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f835e;
    }

    public float getRotation() {
        return this.f834c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f836g;
    }

    public float getTranslateX() {
        return this.f837h;
    }

    public float getTranslateY() {
        return this.f838i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f835e) {
            this.f835e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f834c) {
            this.f834c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f836g) {
            this.f836g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f837h) {
            this.f837h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f838i) {
            this.f838i = f;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [H0.j, H0.m] */
    public k(k kVar, C1052e c1052e) {
        m mVar;
        this.f832a = new Matrix();
        this.f833b = new ArrayList();
        this.f834c = 0.0f;
        this.d = 0.0f;
        this.f835e = 0.0f;
        this.f = 1.0f;
        this.f836g = 1.0f;
        this.f837h = 0.0f;
        this.f838i = 0.0f;
        Matrix matrix = new Matrix();
        this.f839j = matrix;
        this.f841l = null;
        this.f834c = kVar.f834c;
        this.d = kVar.d;
        this.f835e = kVar.f835e;
        this.f = kVar.f;
        this.f836g = kVar.f836g;
        this.f837h = kVar.f837h;
        this.f838i = kVar.f838i;
        String str = kVar.f841l;
        this.f841l = str;
        this.f840k = kVar.f840k;
        if (str != null) {
            c1052e.put(str, this);
        }
        matrix.set(kVar.f839j);
        ArrayList arrayList = kVar.f833b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.f833b.add(new k((k) obj, c1052e));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    ?? mVar2 = new m(jVar);
                    mVar2.f = 0.0f;
                    mVar2.f825h = 1.0f;
                    mVar2.f826i = 1.0f;
                    mVar2.f827j = 0.0f;
                    mVar2.f828k = 1.0f;
                    mVar2.f829l = 0.0f;
                    mVar2.f830m = Paint.Cap.BUTT;
                    mVar2.n = Paint.Join.MITER;
                    mVar2.f831o = 4.0f;
                    mVar2.f823e = jVar.f823e;
                    mVar2.f = jVar.f;
                    mVar2.f825h = jVar.f825h;
                    mVar2.f824g = jVar.f824g;
                    mVar2.f844c = jVar.f844c;
                    mVar2.f826i = jVar.f826i;
                    mVar2.f827j = jVar.f827j;
                    mVar2.f828k = jVar.f828k;
                    mVar2.f829l = jVar.f829l;
                    mVar2.f830m = jVar.f830m;
                    mVar2.n = jVar.n;
                    mVar2.f831o = jVar.f831o;
                    mVar = mVar2;
                } else if (!(obj instanceof i)) {
                    throw new IllegalStateException("Unknown object in the tree!");
                } else {
                    mVar = new m((i) obj);
                }
                this.f833b.add(mVar);
                Object obj2 = mVar.f843b;
                if (obj2 != null) {
                    c1052e.put(obj2, mVar);
                }
            }
        }
    }
}
