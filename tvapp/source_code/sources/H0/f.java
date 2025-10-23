package H0;

import android.animation.TypeEvaluator;
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public D.g[] f820a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        D.g[] gVarArr = (D.g[]) obj;
        D.g[] gVarArr2 = (D.g[]) obj2;
        if (android.support.v4.media.session.b.d(gVarArr, gVarArr2)) {
            if (!android.support.v4.media.session.b.d(this.f820a, gVarArr)) {
                this.f820a = android.support.v4.media.session.b.f0(gVarArr);
            }
            for (int i7 = 0; i7 < gVarArr.length; i7++) {
                D.g gVar = this.f820a[i7];
                D.g gVar2 = gVarArr[i7];
                D.g gVar3 = gVarArr2[i7];
                gVar.getClass();
                gVar.f433a = gVar2.f433a;
                int i8 = 0;
                while (true) {
                    float[] fArr = gVar2.f434b;
                    if (i8 < fArr.length) {
                        gVar.f434b[i8] = (gVar3.f434b[i8] * f) + ((1.0f - f) * fArr[i8]);
                        i8++;
                    }
                }
            }
            return this.f820a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
